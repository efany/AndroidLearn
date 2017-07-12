package com.code.efan.designpattern.proxypattern.static_;

import com.efan.learn.designpattern.proxypattern.Product;

/**
 * Created by efan on 2017/7/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        Product product = new Product();
        ProductProxy productProxy = new ProductProxy(product);
        productProxy.setColor("red");
    }
}
