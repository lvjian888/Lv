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
	   $("#qx").click(function(){
		   $(".box").attr("checked",true)
	   })
	   $("#qbx").click(function(){
		   $(".box").attr("checked",false)
	   })
	   $("#fx").click(function(){
		   $(".box").each(function(){
			   $(this).attr("checked",!$(this).attr("checked"))
		   })
	   })
	   $(".del").click(function(){
		   
	   var id=$(this).val();
		   $.ajax({
	    		url:"del",
	    		type:"post",
	    	   data:{id:id},
	    	   success:function(json){
	    		    if (json) {
						alert("删除成功");
						location="list";
					} else {
						alert("删除失败")
					}
	    	   },
	    	   dataType:"json"
	    	})
	   })
	   $("#del").click(function(){
		   
	   var id="";
	   $(".box:checked").each(function(){
		   id+=","+$(this).val();
	   })
	   id=id.substring(1);
		   $.ajax({
	    		url:"del",
	    		type:"post",
	    	   data:{id:id},
	    	   success:function(json){
	    		    if (json) {
						alert("删除成功");
						location="list";
					} else {
						alert("删除失败")
					}
	    	   },
	    	   dataType:"json"
	    	})
	   })
   })

</script>
</head>
<body>
  <form action="list" method="post">
    <input type="button" value="批量删除" id="del">
    <input type="button" value="添加" onclick="location='add.jsp'">
            部门名称:<input type="text" name="name" value="${name }">
            <input type="submit" value="搜索">
  </form>
  <table>
      <tr>
          <td>
            <input type="button" value="全选" id="qx">
            <input type="button" value="全不选" id="qbx">
            <input type="button" value="反选" id="fx">
          </td>
         <td>序号</td>
         <td>部门名称</td>
         <td>上级部门</td>
         <td>部门描述</td>
         <td>操作</td>
      </tr>
      <c:forEach items="${list }" var="s">
      <tr>
           <td>
           <input type="checkbox" value="${s.id }" class="box">
          </td>
         <td>${s.id }</td>
         <td>${s.name }</td>
         <td>${s.sname }</td>
         <td>${s.ms }</td>
         <td>
         <button value="${s.id }" class="del">删除</button>
            <input type="button" value="修改" onclick="location='update.jsp?id=${s.id}&name=${s.name}&sid=${s.sid }&ms=${s.ms }'" >
         </td>
      </tr>
      </c:forEach>
      <tr>
          <td colspan="15">
             ${fenye }
         </td>
      </tr>
      
  </table>
</body>
</html>