package com.code.efan.designpattern.proxypattern.static_;

import com.efan.learn.designpattern.proxypattern.IProduct;

/**
 * Created by efan on 2017/7/3.
 * Email: yifanyan@sohu-inc.com
 */

public class ProductProxy implements IProduct {
    private IProduct product;

    public ProductProxy(IProduct product) {
        this.product = product;
    }

    @Override
    public void setColor(String color) {
        System.out.println("开始事务...");
        product.setColor(color);
        System.out.println("提交事务...");
    }
}
