package com.code.efan.designpattern.singletonpattern;

/**
 * Created by efan on 2017/5/2.
 * Email: yifanyan@sohu-inc.com
 */

public class Singleton5 {
    private static class Singleton5Holder{
        private static Singleton5 instance = new Singleton5();
    }
    private Singleton5(){}

    public static Singleton5 getInstance(){
        return Singleton5Holder.instance;
    }
}
