package com.company.assignmentsday2;
import java.util.Scanner;
public class SwapNumbersWithoutTemp {
    public static void main(String[] arg)
    {
        int x, y;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
        x=scan.nextInt();
        System.out.println("Enter the Second number");
        y=scan.nextInt();
        System.out.println("Initial x=" +x );
        System.out.println("Initial y=" +y );
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Final x=" +x );
        System.out.println("Final y=" +y );

    }
}
