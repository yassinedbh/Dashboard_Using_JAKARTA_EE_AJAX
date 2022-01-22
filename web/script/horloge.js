var timerID = null;
var timerActif = false;

function stopClock() {
    if (timerActif)
        clearTimeout(timerID);
    timerActif = false;
}

function startClock() {
    stopClock();
    showtime();
}

function showtime() {
    var now = new Date();
    var hour = now.getHours();
    var min = now.getMinutes();
    var sec = now.getSeconds();
    heure = (hour > 9 ? hour : "0" + hour);
    heure += ":" + (min > 9 ? min : "0" + min);
    heure += ":" + (sec > 9 ? sec : "0" + sec);
    document.getElementById('horloge').innerHTML = heure;
    //pour mettre l'horloge dans la barre de status :
    //window.status = heure;
    timerID = setTimeout("showtime()", 1000);
    timerActif = true;
}

window.addEventListener('load', function(){
   startClock(); 
});