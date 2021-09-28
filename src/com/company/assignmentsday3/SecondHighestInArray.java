package com.company.assignmentsday3;
import java.util.Scanner;

public class SecondHighestInArray {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values to compare");
        int n;
        n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length;i++)
        {
           System.out.println ("Enter the number");
           a[i]=scan.nextInt();
        }
        System.out.println("Numbers entered: ");
        for(int num:a)
        {

            System.out.println(num);
        }
        int temp;
        for(int i = 0; i<a.length; i++ ){
            for(int j = i+1; j<a.length; j++){

                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The second largest number is: "+a[a.length-2]);
    }

}
