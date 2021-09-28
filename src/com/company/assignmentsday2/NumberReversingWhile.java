package com.company.assignmentsday2;

import java.util.Scanner;

public class NumberReversingWhile {
    public static void main(String[] a)
    {
        int x;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to reverse");
        x = scan.nextInt();//Reading the number
        while(x!=0)
        {
            int z=x%10;
            y=y*10+z;
            x=x/10;
        }
        System.out.println("Number reversed: "+y);
    }
}

