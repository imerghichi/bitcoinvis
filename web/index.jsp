<%@ page import="JSONUtilities.JSONReader" %>
<%@ page import="org.json.JSONObject" %>
<%@ page import="static JSONUtilities.JSONReader.readJSONFromUrl" %><%--lates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="JSONReader" class="JSONUtilities.JSONReader"/>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  hello imane
  <h1>
    json:
    <% String name = request.getParameter("test");
      JSONObject jsonObject = readJSONFromUrl("https://api.coindesk.com/v1/bpi/currentprice.json");
      String test = jsonObject.toString();%>
      <%out.println(jsonObject.toString());%>
  </h1>
  </body>
</html>
