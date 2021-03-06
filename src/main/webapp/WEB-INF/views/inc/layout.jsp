<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width,  initial-scale=1 minimum-scale=1 user-scalable=1">


<title>Insert title here</title>
<link href="${ctx}/resources/CSS/style.css" type="text/css" rel="stylesheet"/>
<link href="${ctx}/resources/CSS/liMarquee.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- header -->
	<tiles:insertAttribute name="header" />
	
	<!-- header -->
	<tiles:insertAttribute name="visual" />
	
	<!-- main -->
	<tiles:insertAttribute name="main" />
	
	<!-- aside -->
	<sec:authorize access="isAuthenticated()">
	<tiles:insertAttribute name="aside" />
	</sec:authorize>

	<!-- footer -->
	<tiles:insertAttribute name="footer" />
	
</body>
</html>

