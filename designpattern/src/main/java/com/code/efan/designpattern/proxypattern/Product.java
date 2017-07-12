package com.code.efan.designpattern.proxypattern;

/**
 * Created by efan on 2017/7/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Product implements IProduct {
    @Override
    public void setColor(String color) {
        System.out.println("setColor: " + color);
    }
}
