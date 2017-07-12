package com.code.efan.designpattern.filterpattern;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class Product {
    private String color;
    private String shape;

    public Product(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
