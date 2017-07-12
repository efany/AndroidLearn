package com.code.efan.designpattern.singletonpattern;

/**
 * Created by efan on 2017/5/2.
 * Email: yifanyan@sohu-inc.com
 */

public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
