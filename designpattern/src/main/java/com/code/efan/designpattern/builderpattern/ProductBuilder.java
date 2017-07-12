package com.code.efan.designpattern.builderpattern;

/**
 * Created by efan on 2017/5/3.
 * Email: yifanyan@sohu-inc.com
 */

public class ProductBuilder {
    private Product product = new Product();

    public void setShape(String shape) {
        product.setShape(shape);
    }

    public void setColor(String color) {
        product.setColor(color);
    }

    public void setSize(int size) {
        product.setSize(size);
    }

    public Product build(){
        return product;
    }
}
