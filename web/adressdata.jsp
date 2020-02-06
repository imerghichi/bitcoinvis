<%--
  Created by IntelliJ IDEA.
  User: taaha
  Date: 06/02/2020
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Get Data from Adress</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/adressdata" method="POST">
    <div class="input-group">
    </div>
    <br>
    <div class="col-2">
        <div class="input-group">
            <div class="rs-select2 js-select-simple select--no-search">
                <div class="select-dropdown"></div>
                <input class="input--style-1" type="text" placeholder="adress" name="adress">
            </div>
        </div>
    </div>
    <br>
    <div class="p-t-20">
        <button class="btn btn--radius btn--green" type="submit">get data</button>
    </div><br><br>
</form>

</body>
</html>
