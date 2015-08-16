<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2015-8-16
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="imageUpload" method="post" enctype="multipart/form-data">
  文件：<input type="file" name="image">
  <input type="submit" value="上传">
</form>
</body>
</html>
