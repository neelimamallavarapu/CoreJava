package com.company.exceptiondemo;

public class Exception1Main {

    public static void main(String args[]) {

        calculate(2,2);
        calculate(2,0);//null pointer exception and array index out of bound

    }
    public static void calculate(int a, int b) //throws Exception
    {
        try{
            int c =a/b;
            System.out.println(c);


        }catch (Exception e)
        {
            System.out.println("Something Went wrong");
        }
        System.out.println("Exiting calculate function");


    }

}
