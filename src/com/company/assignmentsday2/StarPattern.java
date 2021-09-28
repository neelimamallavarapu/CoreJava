package com.company.assignmentsday2;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] a)
    {
        int numOfLines;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        numOfLines=scan.nextInt();

        for (int i = 0; i < numOfLines; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}