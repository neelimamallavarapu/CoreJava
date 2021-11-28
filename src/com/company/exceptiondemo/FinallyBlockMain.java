package com.company.exceptiondemo;

public class FinallyBlockMain {
    public static void main(String[] args)
    {
        try
        {
            int a=10;
            int b=0;
            int c;
            c=a/b;
        }catch (ArithmeticException ae){System.out.println("divided by zero occured" +ae);}
        finally
        {
             System.out.println("finally block always get executed whether exception occurs or not");
             System.out.println("Database closing, file operation closing or any other cleaning activity can be written inside finally");
        }
        System.out.println("Rest of the Code");
        try
        {
            //System.out.println("inside Try block");
        }
        finally
        {
            System.out.println("Try with finally can exist");
        }
        try {
        System.exit('0');
        }
        finally {
            System.out.println("This will not execute because in try block System.exit method is called");

        }
    }
}
