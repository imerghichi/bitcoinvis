<%@ page import="JSONUtilities.JSONParseUtil" %>
<%--
  Created by IntelliJ IDEA.
  User: taaha
  Date: 04/02/2020
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="ressources/graph.min.js"></script>
<html>
<head>
    <title>donness</title>
</head>
<body>
<form action="home" method="get">
    blabla <br>

    <% JSONParseUtil jsonParseUtil = new JSONParseUtil();
            String url ="https://api.coindesk.com/v1/bpi/historical/close.json";
            String string ;
            string = jsonParseUtil.read(url);
          %> <br>
    <%=string%>
    blabla


</form>

</body>
</html>