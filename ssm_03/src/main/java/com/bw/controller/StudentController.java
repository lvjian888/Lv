package com.bw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.service.StudentService;
import com.bw.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
   @Autowired
   private StudentService service;
   
   @RequestMapping("list")
   public String getlist(HttpServletRequest request,@RequestParam(defaultValue="1")Integer cpage,@RequestParam(defaultValue="")String sname){
	   PageHelper.startPage(cpage, 3);
	   List list=service.getlist(sname);
	   PageInfo info=new PageInfo<>(list);
	   PageUtils pageUtils=new PageUtils(cpage, (int)info.getTotal(),3, "list?sname="+sname, request);
	   request.setAttribute("list", info.getList());
	   request.setAttribute("sname", sname);
	   return "list";
	   
   }
}
