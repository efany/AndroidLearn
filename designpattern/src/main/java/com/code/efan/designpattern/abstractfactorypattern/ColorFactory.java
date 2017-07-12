package com.code.efan.designpattern.abstractfactorypattern;

/**
 * Created by efan on 2017/5/1.
 * Email: yifanyan@sohu-inc.com
 */

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
