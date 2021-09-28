package com.company.assignmentsday3;

public class FibonacciSeries {
    public static void main(String args[])
    {
        int first=0,second=1,third;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=0;i<5; i++)
        {
            third=first+second;
            first=second;
            second=third;
            System.out.print(third+" ");
        }
    }
}
