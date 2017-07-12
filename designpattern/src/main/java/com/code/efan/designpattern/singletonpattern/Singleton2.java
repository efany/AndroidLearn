package com.code.efan.designpattern.singletonpattern;

/**
 * Created by efan on 2017/5/2.
 * Email: yifanyan@sohu-inc.com
 */

public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
