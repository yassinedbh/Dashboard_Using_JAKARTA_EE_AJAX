$(document).ready(function () {
    var iid;
    function formatDate(date) {
        var d = new Date(date),
                month = '' + (d.getMonth() + 1),
                day = '' + d.getDate(),
                year = d.getFullYear();

        if (month.length < 2)
            month = '0' + month;
        if (day.length < 2)
            day = '0' + day;

        return [year, month, day].join('-');
    }

    $.ajax({
        url: "MachineController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        }
    });

    $.ajax({
        url: "MachineController",
        data: {op: "loadcmb"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplircmb(data);
        }
    });
    $("#send").click(function () {
        var reference = $("#reference").val();
        var dateAchat = $("#dateAchat").val();
        var prix = $("#prix").val();

        var cmb = $("#marquecmb").val();
        if (reference === "" || dateAchat === "" || prix === "" || cmb === "") {
            alert("Veuillez remplire tout les champs");
        } else {

            $.ajax({
                url: "MachineController",
                data: {reference: reference, dateAchat: dateAchat, prix: prix, idmarque: cmb},
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    remplir(data);

                    $("#reference").val("");
                    $("#dateAchat").val("");
                    $("#prix").val("");
                    $("#marquecmb").val("");
                    // alert(data);
                    // alert(JSON.stringify(data));
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(textStatus);

                }
            });
        }

    });






    $("#content").on('click', '.delete', function () {

        var indice = $(this).attr('indice');

        if (confirm("Voulez vous vraiment supprimer cette machine?")) {
            $.ajax({
                url: "MachineController",
                data: {op: "delete", id: indice},
                method: 'POST',
                success: function (data) {
                    remplir(data);
                },
                error: function (data) {
                    console.log(textStatus);

                }
            });
        } 
    });





    $("#content").on('click', '#update', function () {

        var buttonM = document.getElementById('send');
        buttonM.disabled = true;
        var indice = $(this).attr('indice');
        iid = indice;
        var reference = $(this).attr('indice1');
        var prix = $(this).attr('indice3');
        var marq = $(this).attr('indice4');

        $("#reference").val(reference);
        $("#dateAchat").val(formatDate($(this).attr('indice2')));
        $("#prix").val(prix);
        $("#marquecmb").val(marq);
        $("#modifie").css("display", "inline-block");


    });



    $("#modifie").click(function () {
        var reference = $("#reference").val();

        var prix = $("#prix").val();
        var dateAchat = $("#dateAchat").val();
        var idmarque = $("#marquecmb").val();
        if (reference === "" || dateAchat === "" || prix === "" || idmarque === "") {
            alert("Veuillez remplire tout les champs");
        } else {
            $.ajax({
                url: "MachineController",
                data: {op: "update", id: iid, reference: reference, prix: prix, dateAchat: dateAchat, idmarque: idmarque},
                method: 'POST',
                success: function (data) {

                    remplir(data);
                    $("#reference").val("");
                    $("#dateAchat").val("");
                    $("#prix").val("");
                    $("#marquecmb").val("");
                    $("#modifie").css("display", "none");

                    var buttonM = document.getElementById('send');
                    buttonM.disabled = false;
                },
                error: function (data) {
                    console.log(textStatus);

                }
            });
        }

    });









    function remplir(data) {
        var ligne = "";
        for (var i = 0; i < data.length; i++) {
            ligne += "<tr style='text-align:center'><td class='table-danger'>" + data[i].id + "</td><td class='table-success'>" + data[i].reference + "</td><td class='table-primary'>" + data[i].dateAchat + "</td><td  class='table-warning'>" + data[i].prix + "</td><td class='table-danger'>" + data[i].idmarque + "</td><td  class='table-info'> <button class='btn btn-inverse-dark btn-fw delete' indice=" + data[i].id + "> supprimer </button> </td><td  class='table-primary'> <button id='update' class='btn btn-inverse-dark btn-fw' indice=" + data[i].id + " indice1=" + data[i].reference + " indice2=" + (data[i].dateAchat).replace(/ /g, "") + " indice3=" + data[i].prix + " indice4=" + data[i].idmarque + " > Modifier </button></td></tr>";
        }
        $("#content").html(ligne);
    }

    function remplircmb(data) {
        var ligne = "";
        var ligne1 = "";
        for (var i = 0; i < data.length; i++) {

            ligne += " <option value=" + data[i].id + ">" + data[i].libelle + "</option>";
        }
        ligne1 = " <option value='' disabled selected>Choisissez une marque </option>";

        $("#marquecmb").html(ligne1 + ligne);

    }
});


