package com.code.efan.designpattern.adapterpattern;

/**
 * Created by efan on 2017/5/4.
 * Email: yifanyan@sohu-inc.com
 */

public class ProductAdapter implements ProductSize {
    private Product product;

    public ProductAdapter() {
        product = new Product();
    }

    public String getColor() {
        return product.getColor();
    }

    public String getShape() {
        return product.getShape();
    }

    @Override
    public int getSize() {
        return 100;
    }
}
