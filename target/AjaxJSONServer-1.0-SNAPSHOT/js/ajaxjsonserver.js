/**
 * Created by Mandar on 5/29/2015.
 */

var URL_LIST = {
    PREF_URL:"http://localhost:8080/AjaxJSONServer/PreferencesServlet",
    WEATHER_URL:"http://localhost:8080/AjaxJSONServer/WeatherServlet?city="

};
function savePref()
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp=new XMLHttpRequest();
    }
    else
    {// code for IE6, IE5
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            document.getElementById("saveStatus").innerHTML=xmlhttp.responseText;
        }
    };


    var city = document.getElementById("city").value;
    console.log(city);
    var tunit="celsius";

    if (document.getElementById('fahr-rb').checked) {
        console.log("Fahrenheit selected");
        tunit = document.getElementById('fahr-rb').value;
    }

    xmlhttp.open("POST",URL_LIST.PREF_URL,true);
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmlhttp.send("city="+city+"&tempunit="+tunit);
}

function loadTemp(city) {
    var xmlhttp;
    if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    }
    else {// code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            if (city === "local") {
                document.getElementById("localWeather").innerHTML = xmlhttp.responseText;
            } else {
                document.getElementById("cityWeather").innerHTML = xmlhttp.responseText;
            }
        }
    };
    xmlhttp.open("GET", URL_LIST.WEATHER_URL + city, true);
    xmlhttp.send();
}
function loadStock(companyCode) {
    var xmlhttp;
    if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    }
    else {// code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            if (companyCode === "INFY") {
                document.getElementById("stock_infy").innerHTML = xmlhttp.responseText;
            }

            if (companyCode === "REL") {
                document.getElementById("stock_rel").innerHTML = xmlhttp.responseText;
            }
            
            if (companyCode === "SENSEX") {
                document.getElementById("sensex").innerHTML = xmlhttp.responseText;
            }

            if (companyCode === "NIFTY") {
                document.getElementById("nifty").innerHTML = xmlhttp.responseText;
            }
        }
    };
    xmlhttp.open("GET", "StockQuote.jsp?company=" + companyCode, true);
    xmlhttp.send();
}

var myIntervalVar1=setInterval(loadTemp,1000,"local");
var myIntervalVar2=setInterval(loadTemp,1000,"Mumbai");
var myIntervalVar3=setInterval(loadStock,1000,"INFY");
var myIntervalVar4=setInterval(loadStock,1000,"REL");
var myIntervalVar5=setInterval(loadStock,1000,"SENSEX");
var myIntervalVar6=setInterval(loadStock,1000,"NIFTY");