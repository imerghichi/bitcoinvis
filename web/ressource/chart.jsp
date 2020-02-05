<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        window.onload = function() {

            var dataPoints = [];

            var chart = new CanvasJS.Chart("chartContainer", {
                animationEnabled: true,
                exportEnabled: true,
                title: {
                    text: "Tuna Production"
                },
                axisY: {
                    title: "in metric tons",
                    includeZero: false
                },
                data: [{
                    type: "column",
                    toolTipContent: "{y} metric tons",
                    dataPoints: dataPoints
                }]
            });

            $.get("https://api.blockchain.info/charts/transactions-per-second?timespan=5weeks&rollingAverage=8hours&format=csv", getDataPointsFromCSV);

            //CSV Format
            //Year,Volume
            function getDataPointsFromCSV(csv) {
                var points;
                var csvLines = csv.split(/[\r?\n|\r|\n]+/);
                for (var i = 1; i < csvLines.length; i++) {
                    if (csvLines[i].length > 0) {
                        points = csvLines[i].split(",");
                        dataPoints.push({
                            label: points[0],
                            y: parseFloat(points[1])
                        });
                    }
                }
                chart.render();
            }

        }
    </script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>