// src/main/resources/static/js/chart.js
async function fetchData() {
    const response = await fetch('/api/countries');
    const data = await response.json();
    return data;
}

async function initializeChart() {
    const data = await fetchData();

    // Process the data to count the number of countries with each ideology
    const ideologyCounts = {};
    data.forEach(country => {
        if (!ideologyCounts[country.ideology]) {
            ideologyCounts[country.ideology] = 1;
        } else {
            ideologyCounts[country.ideology]++;
        }
    });

    const countryIdeologies = Object.keys(ideologyCounts);
    const counts = Object.values(ideologyCounts);

    var options = {
        series: [{
            name: 'Number of Countries',
            data: counts
        }],
        chart: {
            type: 'bar',
            height: 350
        },
        plotOptions: {
            bar: {
                horizontal: false, // Make the bars vertical
                columnWidth: '55%',
                endingShape: 'rounded'
            },
        },
        dataLabels: {
            enabled: false
        },
        stroke: {
            show: true,
            width: 2,
            colors: ['transparent']
        },
        xaxis: {
            categories: countryIdeologies,
            title: {
                text: 'Ideologies'
            }
        },
        yaxis: {
            title: {
                text: 'Number of Countries'
            }
        },
        fill: {
            opacity: 1
        },
        tooltip: {
            y: {
                formatter: function (val) {
                    return val + " countries";
                }
            }
        }
    };

    var chart = new ApexCharts(document.querySelector("#chart"), options);
    chart.render();
}

window.onload = initializeChart;
