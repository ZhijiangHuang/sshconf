<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2015-8-17
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:form action="dataTransfer" method="GET">
  <s:textfield name="ages" label="Ages"/>
  <s:textfield name="ages" label="Ages"/>
  <s:textfield name="ages" label="Ages"/>

  <s:textfield name="names[0]" label="names"/>
  <s:textfield name="names[1]" label="names"/>
  <s:textfield name="names[2]" label="names"/>

  <s:submit/>
</s:form>

</body>
</html>
