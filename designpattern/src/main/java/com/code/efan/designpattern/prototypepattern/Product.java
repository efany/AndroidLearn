package com.code.efan.designpattern.prototypepattern;

/**
 * Created by efan on 2017/5/4.
 * Email: yifanyan@sohu-inc.com
 */

public class Product implements Cloneable{
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

    public Object clone() {
        Product product=null;
        try {
            product=(Product)super.clone();
            product.shape = this.shape;
            product.color = this.color;
            product.size = this.size;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
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
