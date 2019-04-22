package myUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WebUtils {
	@RequestMapping("a")//获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值
	@ResponseBody
	public Object getString(HttpServletRequest request, String name, @RequestParam(defaultValue="bawei")String defaultValue){
		if (name==null) {
			return defaultValue;
		} else {
           return name;
		}
	    //实现代码
	}
	@RequestMapping("int")//获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值
	public int getInt(String a){
	
	   try {
	     return Integer.valueOf(a).intValue();
	  } catch (Exception e) {
		// TODO: handle exception
		  return 0;
	   }
		
	}
	@RequestMapping("getboolean")
	public boolean getBoolean(String b){//获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false 
	    if (b.equals("true")||b.equals("false")) {
			return true;
		} else {
           return false;
		}
	}

	@RequestMapping("getpath")//获取当前请求地址
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String contextPath = request.getContextPath();
		return contextPath;
	}
	@RequestMapping("cook")//给定一个Cookie名获得取Cookie值 
	public String getCookieValue(String name){
	    Cookie cookie=new Cookie(name, "123");
	    return cookie.getValue();
	}



}
