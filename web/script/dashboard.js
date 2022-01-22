$(document).ready(function () {
    
    $.ajax({
        url: "DashboardController",
        data: {},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            $("#machinec").html(data[0]);
            $("#marquec").html(data[1]);
            $("#userc").html(data[2]);
            $("#achatc").html(data[3]);


            var marque = [];
            var machine = [];
            for (var i in data[4]) {
                marque.push(data[4][i].lb);
                machine.push(data[4][i].nbr);
            }
            marque.push("");
            machine.push(0);
            var chartdata = {
                labels: marque,
                datasets: [
                    {
                        label: 'Marque',
                        backgroundColor: [
                            'rgba(54, 162, 235, 0.2)',
                            'rgba(153, 102, 255, 0.2)',
                            'rgba(201, 203, 207, 0.2)',
                            'rgba(255, 99, 132, 0.2)',
                            'rgba(255, 159, 64, 0.2)',
                            'rgba(255, 205, 86, 0.2)',
                            'rgba(75, 192, 192, 0.2)'
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


            var ctx2 = $("#mycanvas2");
            var barGraph = new Chart(ctx2, {
                type: 'line',
                data: chartdata
            })

   // chart 2
   
   
  
            var marquen = [];
            var machinep = [];
            for (var i in data[5]) {
                marquen.push(data[5][i].lb);
                machinep.push(data[5][i].nbr);
            }
            marquen.push("");
            machinep.push(0);
            var chartdata2 = {
                labels: marquen,
                datasets: [
                    {
                        label: 'Marque',
                        backgroundColor: [
                            
                            'rgba(54, 162, 235, 0.2)',
                            'rgba(153, 102, 255, 0.2)',
                            'rgba(201, 203, 207, 0.2)',
                            'rgba(255, 99, 132, 0.2)',
                            'rgba(255, 159, 64, 0.2)',
                            'rgba(255, 205, 86, 0.2)',
                            'rgba(75, 192, 192, 0.2)'
                        ],
                        borderColor: [
                            
                            'rgb(54, 162, 235)',
                            'rgb(153, 102, 255)',
                            'rgb(201, 203, 207)',
                            'rgb(255, 99, 132)',
                            'rgb(255, 159, 64)',
                            'rgb(255, 205, 86)',
                            'rgb(75, 192, 192)'
                        ],
                        borderWidth: 1,
                        hoverBorderWidth: 3,
                        data: machinep,
                    }
                ]
            }


            var ctx = $("#mycanvas");
            var barGraph1 = new Chart(ctx, {
                type: 'bar',
                data: chartdata2
            })


        }
    });


});
