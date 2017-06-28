<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Create booking</h1>
<s:form action="book" method="post">
	<s:textfield name="bookingVO.emp_id" label="Employee Id:"></s:textfield>
	<s:textfield name="bookingVO.date" label="Date" ></s:textfield>
	<s:textfield name="bookingVO.meeting_room" label="Meeting Room"></s:textfield>
	<s:submit value="Submit"/>
</s:form>
</body>
</html>