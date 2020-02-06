
<!DOCTYPE HTML>
<html>
<head>
    <title>Get Data from Adress</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/stats.jsp" method="Get">
    <div class="input-group">
    </div>
    <br>
    <div class="col-2">
        <div class="input-group">
            <div class="rs-select2 js-select-simple select--no-search">
                <div class="select-dropdown"></div></div>
            <%=request.getAttribute("total")%>
        </div>
    </div>
    <br>
    <div class="p-t-20">
    </div><br><br>
</form>

</body>
</html>
