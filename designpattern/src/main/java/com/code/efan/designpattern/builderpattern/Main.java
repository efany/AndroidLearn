package com.code.efan.designpattern.builderpattern;

import android.hardware.Camera;

import java.util.ArrayList;

/**
 * Created by efan on 2017/5/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        ProductBuilder builder = new ProductBuilder();
        builder.setColor("red");
        builder.setShape("cricle");
        builder.setSize(100);
        Product product = builder.build();
        System.out.println(product.toString());
    }
}
