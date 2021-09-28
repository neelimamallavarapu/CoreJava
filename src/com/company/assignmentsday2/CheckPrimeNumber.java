package com.company.assignmentsday2;
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] a) {
        int num ;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the number to check");
        num=scan.nextInt();
        boolean isPrime =true;
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                System.out.println(num+" Number is Composite");
                   isPrime=false;
                   break;
            }
        }
        //if (flag==0)
        if (isPrime==true)
            System.out.println(num + " Number is Prime");
    }
}
