package com.company.inheritancedemo;

public class TestMain {
    public static void main(String args[])
    {
        BaseTest b=new Test();
        b.print();
        System.out.println(b.test);
        BaseTest b1=new BaseTest();
        System.out.println(b1.test);
    }
}
