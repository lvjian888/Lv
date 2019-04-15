<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index2.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">

    $(function(){
    	$.ajax({
    		url:"getdep",
    		type:"post",
    	   data:{},
    	   success:function(json){
    		    for ( var i in json) {
					$("[name='sid']").append(" <option value='"+json[i].id+"'>"+json[i].name+"</option>")
				}
    		    $("[name='sid']").val(${param.sid});
    	   },
    	   dataType:"json"
    	})
    })
</script>
</head>
<body>
   <form action="update" method="post">
            部门编号:<input type="text" name="id" value="${param.id }"><br><br>
            部门名称:<input type="text" name="name" value="${param.name }"><br><br>
        
           上级部门名称:<select name="sid">
                <option>===请选择====</option>
           </select>
           
           <br><br>
          部门描述:<input type="text" name="ms" value="${param.ms }"><br><br>
   <input type="submit" value="修改">
   </form>
</body>
</html>