package com.code.efan.designpattern.proxypattern.notstatic;


import com.efan.learn.designpattern.proxypattern.IProduct;
import com.efan.learn.designpattern.proxypattern.Product;

/**
 * Created by efan on 2017/7/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        IProduct product = new Product();
        System.out.println(product.getClass());

        IProduct proxy = (IProduct) new ProxyFactory(product).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.setColor("red");
    }
}
