
<%--
  Created by IntelliJ IDEA.
  User: haohao
  Date: 2020/5/14
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录到后台</title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="login" method="post">
        <s:textfield label="用户名" name="studentEntity.stuName"></s:textfield>
        <s:password label="密码" name="studentEntity.stuPassword"></s:password>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
