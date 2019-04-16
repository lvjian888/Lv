package com.bw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Student;
import com.bw.service.StudentService;
import com.bw.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
   @Autowired
   private StudentService service;
   
   @RequestMapping("list")
   public String getlist(HttpServletRequest request,@RequestParam(defaultValue="1")Integer cpage){
	
	   PageHelper.startPage(cpage,3);
	   List list=service.getlist();
	   PageInfo info=new PageInfo(list);
	   PageUtils pageUtils=new PageUtils(cpage, (int)info.getTotal(), 3, "list", request);
	   request.setAttribute("list", info.getList());
	   return "list";
	   
   }
   
   @RequestMapping("add")
   public String add(Student stu){
	
	   service.add(stu);
	   
	   return "redirect:list";
	   
   }
   @RequestMapping("update")
   public String update(Student stu){
	
	   service.update(stu);
	   
	   return "redirect:list";
	   
   }
}
