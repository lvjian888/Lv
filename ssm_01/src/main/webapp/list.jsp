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
<table>
   <tr>
       <td>编号</td>
       <td>姓名</td>
       <td>年纪</td>
       <td>综合积分</td>
       <td>出生日期</td>
       <td>操作|
       <input type="button" value="添加" onclick="location='add.jsp'">
       </td>
   </tr>
   <c:forEach items="${list }" var="s">
   <tr>
       <td>${s.sid }</td>
       <td>${s.sname }</td>
       <td>${s.age }</td>
       <td>${s.score }</td>
       <td>${s.birthday }</td>
       <td>
        <input type="button" value="删除" value="${s.sid }">
        <input type="button" value="修改" onclick="location='update.jsp?sid=${s.sid }&sname=${s.sname}&age=${s.age }&score=${s.score }&birthday=${s.birthday }'">
       </td>
   </tr>
   </c:forEach>
   <tr>
      <td colspan="8">
      ${fenye }
      </td>
   </tr>
</table>
</body>
</html>