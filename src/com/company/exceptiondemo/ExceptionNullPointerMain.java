package com.company.exceptiondemo;

public class ExceptionNullPointerMain {
    public static void printLength(String s) {
        //System.out.println(s.length());// causes null pointer exception
        try{
            System.out.println(s.length());

        }
        catch (Exception e)
        {
            System.out.println("Exception occurred");
        }
        System.out.println("Exiting the printLength method");
    }

    public static void main(String args[]) {
        String str = null;
        String str1 = "abc";
        printLength(str1);
        printLength(str);


    }
}

