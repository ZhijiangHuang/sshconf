<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2015-8-17
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="typeConversionAction" method="post">
  birthday:<input type="datetime" name="birthday">
  <input type="submit">
  <s:property value="birthday"></s:property>
</form>

</body>
</html>
