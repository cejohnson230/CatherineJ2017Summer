package com.example.catherinejohnson.catherinej2017summer.util;

import android.util.Log;

/**
 * Created by catherinejohnson on 7/5/17.
 */

public class UtilLog {
    private static boolean isLog =false;

    public static void setIsLog (boolean b){
        isLog=b;
    }
    public static void d(String tag, String msg){
        if(isLog){
            Log.d(tag,msg);
        }
    }
    public static void v(String tag, String msg){
        if(isLog){
            Log.v(tag,msg);
        }
    }
}
