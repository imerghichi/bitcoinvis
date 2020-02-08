
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
                <h2 class="title">Bitcoin Converter</h2>
                <form action="${pageContext.request.contextPath}/converter" method="POST">
                    <div class="input-group">
                        <input class="input--style-1" type="number" placeholder="VALUE" name="value">
                    </div>
                    <br>
                        <div class="col-2">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="currency">
                                        <option disabled="disabled" selected="selected">Currency</option>
                                        <option>USD</option>
                                        <option>JPY</option>
                                        <option>SGD</option>
                                        <option>HKD</option>
                                        <option>CAD</option>
                                        <option>NZD</option>
                                        <option>AUD</option>
                                        <option>CLP</option>
                                        <option>GBP</option>
                                        <option>DKK</option>
                                        <option>SEK</option>
                                        <option>ISK</option>
                                        <option>CHF</option>
                                        <option>BRL</option>
                                        <option>EUR</option>
                                        <option>RUB</option>
                                        <option>PLN</option>
                                        <option>THB</option>
                                        <option>KRW</option>
                                        <option>TWD</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    <br>
                    <div class="p-t-20">
                        <button class="btn btn--radius btn--green" type="submit">Convert</button>
                    </div><br><br>
                </form>
                <div>
                    <h3 class="title">Result</h3>
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