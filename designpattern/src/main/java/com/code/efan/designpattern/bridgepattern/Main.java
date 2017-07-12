package com.code.efan.designpattern.bridgepattern;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        Product product = new Product(new Color() {
            @Override
            public String color() {
                return "red";
            }
        }, new Shape() {
            @Override
            public String shape() {
                return "circle";
            }
        });
        System.out.println(product.toString());
    }
}
