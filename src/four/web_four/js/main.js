var oldprice;
var soket;
function start() {
    $("#ll").show();
    var vid = $("#vid").val();
    var valuta = $("#valuta").val();
    var send = "price:"+vid+":"+valuta;
    if(soket!=undefined && soket.readyState!=WebSocket.CLOSED)
        soket.close();
    if (vid.length == 0 || valuta.length == 0)
        alert("не введены валюты!!!");
    // soket = new WebSocket("ws://localhost:8080/getcoast");
    soket = new WebSocket("ws://localhost:8099/getcoast");
    soket.onopen = function (ev) {
        oldprice = 0;
        console.log("сокет");
        soket.send(send);
    };
    soket.onmessage = function (ev) {
        console.log(ev);
        var unswerData = jQuery.parseJSON(ev.data);
        console.log(unswerData);
        $("#load").hide();
        var printTable = "<tr><td>" + unswerData.name + "</td><td>"+unswerData.valute+"</td><td>"+unswerData.price + "</td></tr>"
        if (oldprice!=unswerData.price){
            $("#content").prepend(printTable);
        }
        oldprice = unswerData.price;
        soket.send(send);
    }
}
