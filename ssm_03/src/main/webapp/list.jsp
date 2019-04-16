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
</head>
<body>
<form action="list" method="post">
 姓名:<input type="text" name="sname" value="${sname }">
 <input type="submit" value="搜索">
</form>
<table>
   <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>年龄</td>
      <td>综合积分</td>
      <td>出生日期</td>
      <td>操作</td>
   </tr>
   <c:forEach items="${list }" var="s">
   <tr>
      <td>${s.sid }</td>
      <td>${s.sname }</td>
      <td>${s.age }</td>
      <td>${s.score }</td>
      <td>${s.birthday }</td>
      <td>
      </td>
   </tr>
   </c:forEach>
   <tr>
     <td colspan="7">
     ${fenye }
     </td>
   </tr>
</table>
</body>
</html>