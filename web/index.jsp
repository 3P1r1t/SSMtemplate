<%--
  Created by IntelliJ IDEA.
  User: woyou
  Date: 2022/5/17
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <c:forEach items="${list}" var="water">
    ${water.water_id}--${water.water_oxy}--${water.pool_id}<br/>
  </c:forEach>

  </body>
</html>
