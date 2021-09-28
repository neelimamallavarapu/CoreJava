package com.company.looping;

public class WhileLoopMain
{
    public static void main(String[] a)
    {
        int i=0;
        while(i<=10)
        {
           System.out.println(i);
            if(i%2!=0)
            {
                System.out.println(i+" is odd number");
            }
            else
            {
                System.out.println((i+" is even number"));
            }
            i++;
        }
    }
}
