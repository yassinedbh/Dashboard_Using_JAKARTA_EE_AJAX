$(document).ready(function () {
   var iid;
/*
    $.ajax({
        url: "MachineRechere_Marque",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        }
    });
    */
    $.ajax({
        url: "MachineRechere_Marque",
        data: {op: "loadcmb"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplircmb(data);
        }
    });
    $("#send").click(function () {
      
        var cmb = $("#marquecmb").val();
        $.ajax({
            url: "MachineRechere_Marque",
            data: {idmarque:cmb},
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
    
    function remplircmb(data) {
        var ligne = "";
         var ligne1 = "";
        for (var i = 0; i < data.length; i++) {
             
            ligne += " <option value="+ data[i].id +">"+ data[i].libelle +"</option>";
        }
        ligne1=" <option value='' disabled selected>Choisissez une marque </option>";
         
        $("#marquecmb").html(ligne1+ligne);
        
    }
});


