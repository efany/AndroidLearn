package com.code.efan.designpattern.abstractfactorypattern;

/**
 * Created by efan on 2017/5/1.
 * Email: yifanyan@sohu-inc.com
 */

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
