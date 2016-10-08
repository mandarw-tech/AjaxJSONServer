/*
 * Added more preference related to Stock Exchange
 * Added changes in v1.2
 */
package com.mw.ajaxjsonserver.util;

/**
 *
 * @author Mandar Wadhavekar
 */
public class Preferences {
    
    private static Preferences instance = null;
    public static String CITY="PUNE";
    public static String TEMP_UNIT="Celsius";
    //version 1.2 - Stock
    public static String PREFFERRED_STOCK_EXCHANGE="NSE";
    
    public static Preferences getInstance() {
        if (instance == null) {
            instance = new Preferences();
        }
        return instance;
    }
    
}
