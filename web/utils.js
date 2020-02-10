const theme = {
    backgroundColor: [
        'rgba(255, 99, 132, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(255, 206, 86, 0.2)',
        'rgba(75, 192, 192, 0.2)',
        'rgba(153, 102, 255, 0.2)',
        'rgba(255, 159, 64, 0.2)'
    ],
    borderColor: [
        'rgba(255, 99, 132, 1)',
        'rgba(54, 162, 235, 1)',
        'rgba(255, 206, 86, 1)',
        'rgba(75, 192, 192, 1)',
        'rgba(153, 102, 255, 1)',
        'rgba(255, 159, 64, 1)'
    ],
    borderWidth: 1
};
const config = {
    bar: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    },
    line: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    },
    scatter: {
        scales: {
            xAxes: [{
                type: 'linear',
                position: 'bottom'
            }]
        }
    }
};

const drawChart = function(dataset, title, type = "bar", config = config.bar, chartTheme = theme) {
    new Chart(chart1, {
        type: type,
        data: {
            labels: dataset.labels,
            datasets: [{
                label: title,
                data: dataset.data,
                backgroundColor: chartTheme.backgroundColor,
                borderColor: chartTheme.borderColor,
                borderWidth: chartTheme.borderWidth
            }]
        },
        options: config
    });
};

var getJSON = function(url) {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', url, true);
    xhr.responseType = 'json';
    xhr.send();
};
const chart1 = document.getElementById('chart1').getContext('2d');
const dataset = {
    data: getJSON("https://api.blockchain.info/charts/market-price?format=json"),
    labels: ['lab1', 'lab2','lab1', 'lab2','lab1', 'lab2']
};
drawChart(dataset, "Bitcoin price evolution", 'scatter', config.scatter);