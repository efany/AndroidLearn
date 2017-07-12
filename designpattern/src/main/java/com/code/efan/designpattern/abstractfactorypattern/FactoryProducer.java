package com.code.efan.designpattern.abstractfactorypattern;

/**
 * Created by efan on 2017/5/1.
 * Email: yifanyan@sohu-inc.com
 */

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
