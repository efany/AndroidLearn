package com.code.efan.datastructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by efan on 2017/5/4.
 * Email: yifanyan@sohu-inc.com
 */

public class EnumerationTest {
    public static void main(String[] arg){
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
