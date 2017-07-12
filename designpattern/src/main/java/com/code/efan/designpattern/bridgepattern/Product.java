package com.code.efan.designpattern.bridgepattern;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class Product {
    private Color color;
    private Shape shape;

    public Product(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color=" + color.color() +
                ", shape=" + shape.shape() +
                '}';
    }
}
