package com.zhi.dao.mybatis;

/**
 * Created by root on 2015-8-20.
 */
public class Test {
    static {
        int x = 5;
    }
    static int x,y;

    public static void main(String[] args) {
        x--;
        myMethod();
        System.out.println(x+y+ ++x);
    }

    public static void myMethod(){
        y = x++ + ++x;
    }
}
