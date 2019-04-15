package com.bw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Dep;
import com.bw.service.DepService;
import com.bw.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class DepController {
   @Autowired
   private  DepService service;
   
   @RequestMapping("list")
   public String getlist(HttpServletRequest request,@RequestParam(defaultValue="")String name,@RequestParam(defaultValue="1")Integer cpage){
	    PageHelper.startPage(cpage, 3);
	    List list=service.getlist(name);
	    PageInfo info=new PageInfo<>(list);
	    PageUtils pageUtils=new PageUtils(cpage, (int)info.getTotal(), 3, "list?name="+name, request);
	    request.setAttribute("list", info.getList());
	    request.setAttribute("name", name);
	   return "list";
	   
   }
  @RequestMapping("del")
  @ResponseBody
  public Object del(String id){
	 try {
		 service.del(id);
		  return true;
	} catch (Exception e) {
      e.printStackTrace();
      return false;
	 }
  }
  @RequestMapping("add")
  public String add(Dep dep){
	  service.add(dep);
	  return "redirect:list";
  }
  @RequestMapping("update")
  public String update(Dep dep){
	  service.update(dep);
	  return "redirect:list";
  }
  @RequestMapping("getdep")
  @ResponseBody
  public Object getdep(){
	  List list=service.getdep();
	  return list;
  }
}
