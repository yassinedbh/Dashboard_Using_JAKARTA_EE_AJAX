$(document).ready(function () {
 
     $("#send").click(function () {
      
        var dateAchatd = $("#dateAchatD").val();
        var dateAchatf = $("#dateAchatF").val();
        
        $.ajax({
            url: "MachineRechere_Date",
            data: {dateAchatd: dateAchatd, dateAchatf: dateAchatf},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
               
                remplir(data);
                
                // alert(data);
                // alert(JSON.stringify(data));
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

   






    function remplir(data) {
        var ligne = "";
        for (var i = 0; i < data.length; i++) {
            ligne += "<tr style='text-align:center'><td class='table-danger'>" + data[i].id + "</td><td class='table-success'>" + data[i].reference + "</td><td class='table-primary'>" + data[i].dateAchat + "</td><td  class='table-warning'>" + data[i].prix + "</td><td class='table-danger'>" + data[i].idmarque + "</td></tr>";
        }
        $("#content").html(ligne);
    }
    
    
});


