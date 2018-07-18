<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/18
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>资源文件测试</title>
</head>
<body>

<img alt="读取默认配置中的图片" src="${pageContext.request.contextPath }/myres/1.jpg">
<br/>
<img alt="读取自定义配置myres中的图片" src="${pageContext.request.contextPath }/myres/P8510.png">

</body>
</html>
