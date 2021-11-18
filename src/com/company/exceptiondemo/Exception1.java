package com.company.exceptiondemo;

public class Exception1 {
    public static void main(String args[]) {
        calculate(5,2);
        calculate(5,0);
    }
        public static void calculate(int a, int b)
        {
            try {
                int c = a / b;
                System.out.println(c);
            }
            catch (Exception e) {
                System.out.println("Something went wrong");

            }
            System.out.println("Exiting calculate function");

        }
}
