
<!DOCTYPE HTML>
<html>
<head>
    <title>Bitcoin Data from Adress</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="ressource/assets/css/main.css" />
</head>
<body>

<!-- Header -->
<header id="header" class="alt">
    <div class="logo"><a href="home.jsp">Bitcoin <span>Visualizer</span></a></div>
    <a href="#menu">Menu</a>
</header>

<!-- Nav -->
<nav id="menu">
    <ul class="links">
        <li><a href="home.jsp">Home</a></li>
        <li><a href="generic.html">Converter</a></li>
        <li><a href="#">last 24hours</a></li>
        <li><a href="adressdata.jsp">Get data for any Adress</a></li>
        <li><a href="#">About Us</a></li>

    </ul>
</nav>
<section id="one" class="wrapper style2">
    <div class="inner">
        <div class="grid-style">
            <div>
                <h2 class="title">Bitcoin Data from adress</h2>
                <form action="${pageContext.request.contextPath}/converter" method="POST">
                    <div class="input-group">
                        <input class="input--style-1" type="text" placeholder="VALUE" name="value">
                    </div>
                    <br>
                    <div class="col-2">
                        <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="p-t-20">
                        <button class="btn btn--radius btn--green" type="submit">Get Informations</button>
                    </div><br><br>
                </form>
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
            &copy; Imane. All rights reserved.
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