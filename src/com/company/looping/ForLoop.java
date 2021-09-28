package com.company.looping;

public class ForLoop {
    public static void main(String[] a)
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
            System.out.println("===ODD/Even Numbers===");
            if(i%2!=0)
            {
                System.out.println(i+" is odd number");
            }
            else
            {
                System.out.println((i+" is even number"));
            }
        }
    }
}
