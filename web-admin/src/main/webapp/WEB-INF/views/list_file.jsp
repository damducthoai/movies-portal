<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 10/3/2017
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List file</title>
</head>
<body>
<ul>
    <c:forEach items="${files}" var="file">
        <li>
            <h3>${file.fileTitle}</h3>
            <p>${file.fileDescription}</p>
            <a href="${file.hostAddr}">Direct link</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
