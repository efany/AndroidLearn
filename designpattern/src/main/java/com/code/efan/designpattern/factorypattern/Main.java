package com.code.efan.designpattern.factorypattern;

/**
 * Created by efan on 2017/4/30.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {

    public static void main(String[] arg){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
