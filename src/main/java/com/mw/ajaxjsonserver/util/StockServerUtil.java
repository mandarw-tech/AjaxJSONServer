/*
 * StockServer - Backend connectivity wrapper for BSE and NSE
 */
package com.mw.ajaxjsonserver.util;

import java.util.Random;

/**
 *
 * @author Mandar
 */
public class StockServerUtil {

    private static Random rand = new Random();
    /**
     * Added NSE support (v1.2)
     */
    public static double getNSEPrice(String stock_code)
    {
	//Open connection with NSE backend 
	//Get stock value
	return 1.38*getRandom(45, 999);
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
    
//    public static int getRandomFloat(int min, int max) {
//
//    // nextInt is normally exclusive of the top value,
//        // so add 1 to make it inclusive
//        int randomNum = rand.nextInt((max - min) + 1) + min;
//
//        return randomNum;
//    }
}
