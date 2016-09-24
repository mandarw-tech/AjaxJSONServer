/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mw.ajaxjsonserver.util;

/**
 *
 * @author Mandar
 * Added language preference for LANGUAGE
 */
public class Preferences {
    
    private static Preferences instance = null;
    public static String CITY="PUNE";
    public static String TEMP_UNIT="Celsius";
    //Added for Main branch
    public static String LANGUAGE="English";
    
    public static Preferences getInstance() {
        if (instance == null) {
            instance = new Preferences();
        }
        return instance;
    }
    
}
