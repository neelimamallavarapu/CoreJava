package com.company.assignmentsday2;
import java.util.Scanner;

public class NumberReversing {
    public static void main(String[] a)
    {
        int x;
        int y=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number to reverse");
        x= scan.nextInt();//Reading the number

        for( ;x != 0; x=x/10)
        {
            int z = x % 10;
            y = y * 10 + z;
        }
        System.out.println("The reverse of the number " + y);

    }
}
