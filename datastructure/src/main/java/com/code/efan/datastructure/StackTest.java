package com.code.efan.datastructure;

import java.util.Stack;

/**
 * Created by yifanyan213966 on 2017/7/12.
 */

public class StackTest {
    public static void main(String[] arg) {
        Stack st = new Stack();
        st.push("45");
        System.out.println(st);
        st.push("24");
        System.out.println(st);
        st.push("67");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
