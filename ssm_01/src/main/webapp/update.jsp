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
<form action="update" method="post">

 编号:<input type="text" name="sid" value="${param.sid }" readonly="readonly"><br><br>
 姓名:<input type="text" name="sname" value="${param.sname }"><br><br>
年纪:<input type="text" name="age" value="${param.age }"><br><br>
 出生日期:<input type="text" name="birthday" onclick="WdatePicker()" value="${param.birthday }"><br><br>
综合积分:<input type="text" name="score" value="${param.score }"><br><br>
  <input type="submit"  value="提交"><br><br>
</form>
</body>
</html>