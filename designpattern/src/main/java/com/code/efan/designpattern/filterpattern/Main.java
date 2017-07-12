package com.code.efan.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class Main {
    public static void main(String[] arg){
        List<Product> products = new ArrayList<Product>();
        Product product = new Product("red", "circle");
        products.add(product);
        product = new Product("red", "square");
        products.add(product);
        product = new Product("blue", "circle");
        products.add(product);
        product = new Product("blue", "square");
        products.add(product);

        List<Product> redProducts = new RedColorFilter().filter(products);
        System.out.println("-----red-----");
        printList(redProducts);

        List<Product> circleProducts = new CircleShapeFilter().filter(products);
        System.out.println("-----circle-----");
        printList(circleProducts);

        List<Product> redAndCircleProducts = new FilterAnd(new RedColorFilter(), new CircleShapeFilter()).filter(products);
        System.out.println("-----red and circle-----");
        printList(redAndCircleProducts);

        List<Product> redOrCircleProducts = new FilterOr(new RedColorFilter(), new CircleShapeFilter()).filter(products);
        System.out.println("-----red or circle-----");
        printList(redOrCircleProducts);
    }

    private static void printList(List<Product> list) {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }
}
