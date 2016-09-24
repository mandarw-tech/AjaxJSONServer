/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mw.ajaxjsonserver.util;

import java.util.Random;

/**
 *
 * @author Mandar
 */
public class AppUtil {

    private static AppUtil instance = null;
    private static Random rand = new Random();

    public static AppUtil getInstance() {
        if (instance == null) {
            instance = new AppUtil();
        }
        return instance;
    }

    public static int getRandom(int min, int max) {

    // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    
    public static int getRandom(int max) {

        int randomNum = rand.nextInt(max);

        return randomNum;
    }
    
    public static int getTemp() {
        return getRandom(11, 46);
    }
    
     
    /**
     *  Celsius to Fahrenheit
     * @return 
     */
    public static double cToF(double c)
    {
        return Math.round( 9*c/5+32 );
    }
    
    /*
     * Added improvement for main 1.0
     * convert language
     * Translate
     */
    public static String Translate(String origStr) {
	    //translate
    	return origStr;
    }
}
