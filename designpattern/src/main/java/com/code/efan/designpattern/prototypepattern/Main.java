package com.code.efan.designpattern.prototypepattern;

/**
 * Created by efan on 2017/5/4.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        Product product = new Product();
        product.setColor("red");
        product.setShape("cricle");
        product.setSize(100);

        Product product2 = (Product) product.clone();
        product2.setSize(80);
        System.out.println(product.toString());
        System.out.println(product2.toString());
    }
}
