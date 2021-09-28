package com.company.assignmentsday2;
import java.util.Scanner;
public class NumberPalindromeWhileLoop {

    public static void main(String[] a) {
        int x , initial ;
        int y = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to check");
        x=initial=scan.nextInt();

        while (x != 0) {
            int z = x % 10;
            y = y * 10 + z;
            x = x / 10;
        }
        if (y == initial) {
            System.out.println(initial + " Number is Palindrome checked with While loop");
        } else {
            System.out.println(initial + " Is not a Palindrome ");
        }
    }
}

