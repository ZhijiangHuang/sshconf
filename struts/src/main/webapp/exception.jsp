<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2015-8-16
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>exception</title>
</head>
<body>
<h4>Exception Name:<s:property value="exception"></s:property> </h4>
<h4>What you did wrong:<s:property value="exceptionStack"/> </h4>

</body>
</html>
