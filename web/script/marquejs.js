$(document).ready(function () {
    var iid;
    var button = document.querySelector("#send");
    $.ajax({
        url: "MarqueController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        }
    });
    $("#send").click(function () {
        var code = $("#code").val();
        var libelle = $("#libelle").val();
        if (code === "" || libelle === "") {
            alert("Veuillez remplire tout les champs");
        } else {
            $.ajax({
                url: "MarqueController",
                data: {code: code, libelle: libelle},
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    remplir(data);
                    $("#code").val("");
                    $("#libelle").val("");
                    // alert(data);
                    // alert(JSON.stringify(data));
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(textStatus);
                    alert("Veuillez remplire tout les champs");
                }
            });
        }

    });

    $("#content").on('click', '.delete', function () {

        var indice = $(this).attr('indice');
        if (confirm("Voulez vous vraiment supprimer cette machine?")) {
        $.ajax({
            url: "MarqueController",
            data: {op: "delete", id: indice},
            method: 'POST',
            success: function (data) {
                remplir(data);
            },
            error: function (data) {
                console.log(textStatus);

            }
        });}
    });




    $("#content").on('click', '.update', function () {

        var buttonM = document.getElementById('send');
        buttonM.disabled = true;

        var indice = $(this).attr('indice');
        iid = indice;
        var code = $(this).attr('indice1');
        var libelle = $(this).attr('indice2');

        $("#code").val(code);
        $("#libelle").val(libelle);
        $("#modifie").css("display", "inline-block");

    });



    $("#modifie").click(function () {

        var code = $("#code").val();
        var libelle = $("#libelle").val();
        if (code == "" || libelle == "") {
            alert("Veuillez remplire tout les champs");
        } else {
        $.ajax({
            url: "MarqueController",
            data: {op: "update", id: iid, code: code, libelle: libelle},
            method: 'POST',
            success: function (data) {
                remplir(data);
                $("#code").val("");
                $("#libelle").val("");
                var buttonM = document.getElementById('send');
                buttonM.disabled = false;
                $("#modifie").css("display", "none");
            },
            error: function (data) {
                console.log(textStatus);
                alert("Veuillez remplire tout les champs");
            }
        });}

    });









    function remplir(data) {
        var ligne = "";
        for (var i = 0; i < data.length; i++) {
            ligne += "<tr style='text-align:center'><td class='table-danger col-md-2'>" + data[i].id + "</td><td class='table-success col-md-2'>" + data[i].code + "</td><td class='table-warning col-md-2'>" + data[i].libelle + "</td><td  class='table-info'> <button indice=" + data[i].id + " class='btn btn-inverse-dark btn-fw delete'>supprimer</button></td><td  class='table-primary'> <button class='btn btn-inverse-dark btn-fw update' indice=" + data[i].id + " indice1=" + data[i].code + " indice2=" + data[i].libelle + " > Modifier </button></td></tr>";
        }
        $("#content").html(ligne);
    }
});


