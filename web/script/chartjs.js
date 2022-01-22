$(document).ready(function () {

    $.ajax({
        url: "ChartControlleur",
        data: {op: "load"},
        method: 'POST',
        success: function (data) {
            var marque = [];
            var machine = [];
            for (var i in data) {
                marque.push(data[i].lb);
                machine.push(data[i].nbr);
            }
             marque.push("");
             machine.push(0);
            var chartdata = {
                labels: marque,
                datasets: [
                    {
                        label: 'Marque',
                        backgroundColor: [
                            'rgba(255, 99, 132, 0.2)',
                            'rgba(255, 159, 64, 0.2)',
                            'rgba(255, 205, 86, 0.2)',
                            'rgba(75, 192, 192, 0.2)',
                            'rgba(54, 162, 235, 0.2)',
                            'rgba(153, 102, 255, 0.2)',
                            'rgba(201, 203, 207, 0.2)'
                        ],
                        borderColor: [
                            'rgb(255, 99, 132)',
                            'rgb(255, 159, 64)',
                            'rgb(255, 205, 86)',
                            'rgb(75, 192, 192)',
                            'rgb(54, 162, 235)',
                            'rgb(153, 102, 255)',
                            'rgb(201, 203, 207)'
                        ],
                        borderWidth: 1,
                        hoverBorderWidth: 3,
                        data: machine,
                    }
                ]
            }
            var ctx = $("#mycanvas");
            var barGraph = new Chart(ctx, {
                type: 'bar',
                data: chartdata
            })

            var ctx2 = $("#mycanvas2");
            var barGraph = new Chart(ctx2, {
                type: 'line',
                data: chartdata
            })
            var ctx3 = $("#mycanvas3");
            var barGraph = new Chart(ctx3, {
                type: 'polarArea',
                data: chartdata,
                options: {
                    elements: {
                        line: {
                            borderWidth: 3
                        }
                    }
                }

            })
            var ctx4 = $("#mycanvas4");
            var barGraph = new Chart(ctx4, {
                type: 'doughnut',
                data: chartdata
            })
        },
        error: function (data) {
            console.log(data);
        }
    });

});