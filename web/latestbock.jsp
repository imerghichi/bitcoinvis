
<!DOCTYPE HTML>
<html>
<head>
    <title>Bitcoin Converter</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="ressource/assets/css/main.css" />
</head>
<body>

<!-- Header -->
<header id="header" >
    <div class="logo"><a href="home.jsp">Bitcoin <span>Visualizer</span></a></div>
    <a href="#menu">Menu</a>
</header>

<!-- Nav -->
<nav id="menu">
    <ul class="links">
        <li><a href="home.jsp">Home</a></li>
        <li><a href="converter.jsp">Converter</a></li>
        <li><a href="Last24h.jsp">last 24hours</a></li>
        <li><a href="adressdata.jsp">Get data for any Adress</a></li>
        <li><a href="bitcoinchart.jsp">Bitcoin price evolution</a> </li>
        <li><a href="latestbock.jsp">Latest block information</a> </li>
        <li><a href="aboutus.html">About Us</a></li>

    </ul>
</nav>

<section id="one" class="wrapper style2">
    <div class="inner">
        <div class="grid-style">
            <div>
                <h2 class="title">Last 24hours data </h2>
                <form action="${pageContext.request.contextPath}/converter" method="POST">
                    <br>
                    <div class="col-2">
                        <div class="input-group">
                        </div>
                    </div>
                    <br><br>
                </form>
                <div>
                    <h3 class="title"><h4>
                        hash:<br>
                        index:<br>
                        block index :<br>
                        height:<br>
                    </h4></h3>
                    <div> </div><br>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer -->
    <footer id="footer">
        <div class="container">
            <ul class="icons">
                <li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
                <li><a href="#" class="icon fa-linkedin"><span class="label">Linkedin</span></a></li>
                <li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
            </ul>
        </div>
        <div class="copyright">
            &copy; Imane.
        </div>
    </footer>

    <!-- Scripts -->
    <script src="ressource/assets/js/jquery.min.js"></script>
    <script src="ressource/assets/js/jquery.scrollex.min.js"></script>
    <script src="ressource/assets/js/skel.min.js"></script>
    <script src="ressource/assets/js/util.js"></script>
    <script src="ressource/assets/js/main.js"></script>
</section>

</html>