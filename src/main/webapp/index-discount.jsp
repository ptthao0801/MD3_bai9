<%--
  Created by IntelliJ IDEA.
  User: pttha
  Date: 2024-04-30
  Time: 1:05 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount Calculator</title>
</head>
<body>
<form action="/display-discount" method="post">
    <h2>Discount Calculator</h2>
    <label for="des">Description</label><br>
    <input type="text" id="des" name="description" placeholder="mo ta"><br>
    <label for="price">Price</label><br>
    <input type="number" id="price" name="price" placeholder="gia"><br>
    <label for="discount">Discount Percent</label><br>
    <input type="number" id="discount" name="discount" placeholder="ty le chiet khau (phan tram)"><br>

    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
