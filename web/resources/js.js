/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

google.charts.load('current', {'packages': ['corechart']});
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
    var data = google.visualization.arrayToDataTable([
        ['Element', 'LowPrice', 'Solar', {role: 'style'}, {role: 'annotation'}],
        ['KW:', 8, 12, 'color: green; color: darkred', 'KW'], // CSS-style declaration
    ]);
    var options = {
        'title': 'How Much Pizza I Ate Last Night',
        'width': 500,
        'height': 40,
        isStacked: true
    };
    var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
    chart.draw(data, options);
}
