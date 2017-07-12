package com.code.efan.designpattern.abstractfactorypattern;

import android.graphics.*;

/**
 * Created by efan on 2017/5/1.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {

    public static void main(String[] arg){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
        Color green = colorFactory.getColor("GREEN");
        green.fill();
        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
