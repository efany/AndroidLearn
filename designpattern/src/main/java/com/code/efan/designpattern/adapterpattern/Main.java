package com.code.efan.designpattern.adapterpattern;

/**
 * Created by efan on 2017/5/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        ProductAdapter adapter = new ProductAdapter();
        System.out.println("color:" + adapter.getColor() + "  shape:" + adapter.getShape() + "  size:" + adapter.getSize());
    }
}
