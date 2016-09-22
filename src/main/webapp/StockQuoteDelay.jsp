<%-- 
    Document   : StockQuote
    Created on : May 27, 2015, 12:30:28 PM
    Author     : Mandar
--%>

<%@ page import="java.util.Random" %>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%!               
public static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
 %>
<%
Random random = new Random();
int millis = 2000;
String stockValue = "Error -1";// some json string;
String comp = request.getParameter("company");

String delay = request.getParameter("delay");

if (comp != null){
    
     if (comp.equalsIgnoreCase("INFY")){
          millis = random.nextInt(4500);
          stockValue = "INFOSYS LTD - "+millis;
     }
     if (comp.equalsIgnoreCase("REL")){
          millis = random.nextInt(800);
          stockValue = "RELIANCE INDUSTRIES - "+millis;
     }
     
     if (comp.equalsIgnoreCase("LT")){
          millis = random.nextInt(2100);
          stockValue = " LARSEN & TOUBRO - "+millis;
     }
     
     if (comp.equalsIgnoreCase("Sensex")){
         millis = random.nextInt(1000)+25000;
          stockValue = " Sensex - "+millis;
     }
     if (comp.equalsIgnoreCase("Nifty")){
         millis = random.nextInt(500)+8000;
          stockValue = " Nifty - "+millis;
     }
 
     Thread.sleep(millis); //simulate server delay
     int delaysec = 15;
     
     if ( ("MED").equalsIgnoreCase(delay) ){
         delaysec = 30;
     }
     if ( ("HI").equalsIgnoreCase(delay) ){
         delaysec = 45;
     }
     if ( ("VHI").equalsIgnoreCase(delay) ){
         delaysec = 60;
     }
     if ( ("VVHI").equalsIgnoreCase(delay) ){
         delaysec = 120;
     }
     Thread.sleep(delaysec*1000);
} //else error to AJAX???
%>
<%=stockValue%>

