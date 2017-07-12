package com.code.efan.designpattern.builderpattern;

/**
 * Created by efan on 2017/5/3.
 * Email: yifanyan@sohu-inc.com
 */

public class Product {
    private String shape;
    private String color;
    private int size;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "product{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
