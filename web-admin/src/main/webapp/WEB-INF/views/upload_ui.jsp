<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 9/24/2017
  Time: 10:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<sf:form modelAttribute="file" action="${pageContext.servletContext.contextPath}/files" enctype="multipart/form-data">
    <sf:label path="fileTitle">Title: </sf:label>
    <sf:input path="fileTitle"/>
    <sf:label path="fileType">Type: </sf:label>
    <sf:select path="fileType" items="${fileTypes}"/><br>
    <sf:label path="fileDescription">Description: </sf:label><br>
    <sf:textarea path="fileDescription"/><br>
    <label>Tags: </label>
    <textarea name="tags"></textarea>
    <label>File: </label>
    <input type="file" name="uploadFile"/>
    <sf:hidden path="thumnailId"/><br>
    <input type="submit" value="OK">
</sf:form>