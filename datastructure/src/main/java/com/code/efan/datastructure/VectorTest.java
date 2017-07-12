package com.code.efan.datastructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by efan on 2017/5/4.
 * Email: yifanyan@sohu-inc.com
 */

public class VectorTest {
    public static void main(String[] arg){
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Integer(5));
        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());

        if(v.contains(new Integer(3)))
            System.out.println("Vector contains 3.");

        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
