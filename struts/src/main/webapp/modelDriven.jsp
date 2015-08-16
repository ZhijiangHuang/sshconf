<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2015-8-14
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>ModelDrivenDemo</title>
</head>
<body>
<s:form action="modelDrivenResult" method="POST" namespace="/modelDriven">
  <s:textfield label="Gangster Name" name="name" />

  <s:textfield label="Gangster Age"  name="age" />
  <s:checkbox  label="Gangster Busted Before" name="bustedBefore" />
  <s:textarea  cols="30" rows="5" label="Gangster Description" name="description" />
  <s:submit />
</s:form>
</body>
</html>
