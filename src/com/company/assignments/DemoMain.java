package com.company.assignments;


import java.util.Scanner;

public class DemoMain {
    public static void main(String args[])
    {
        float price=5.0f,newPrice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price");
        newPrice=sc.nextFloat();
        if(price==newPrice)
            System.out.println("Price is equal");
        else
            System.out.println("Price not equal");
    }
}
