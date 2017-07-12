package com.code.efan.designpattern.singletonpattern;

/**
 * Created by efan on 2017/5/2.
 * Email: yifanyan@sohu-inc.com
 */

public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }
}
