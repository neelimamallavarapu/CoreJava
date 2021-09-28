package com.company.stringdemo;

public class StringMain {
    public static void main(String[] args)
    {
        String s1="John";
        String s2="John";
        String s3=new String("John");
        String s4=new String("John");
        String s5=new String("John").intern();

        if(s1==s2)
            System.out.println("s1 and s2 are equal");
        else
            System.out.println("s1 and s2 are not equal");
        if(s1.equals(s2))
            System.out.println("s1 and s2 are equal with equals method");
        else
            System.out.println("s1 and s2 are not equal");
        if(s1==s3)
            System.out.println("s1 and s3 are equal");
        else
            System.out.println("s1 and s3 are not equal");
       if(s1.equals(s3))
            System.out.println("s1 and s3 are equal with equal method");
        else
            System.out.println("s1 and s3 are not equal");
        if(s3==s4)
            System.out.println("s3 and s4 are equal");
        else
            System.out.println("s3 and s4 are not equal");
        if(s3.equals(s4))
            System.out.println("s3 and s4 are equal with equals method");
        else
            System.out.println("s3 and s4 are not equal");
        if(s3==s5)
            System.out.println("s3 and s5 are equal");
        else
            System.out.println("s3 and s5 are not equal");
        if(s3.equals(s5))
            System.out.println("s3 and s5 are equal with equals method");
        else
            System.out.println("s3 and s5 are not equal");
        if(s1==s5)
            System.out.println("s1 and s5 are equal");
        else
            System.out.println("s1 and s5 are not equal");
        if(s4.equals(s5))
            System.out.println("s4 and s5 are equal with equal method");
        else
            System.out.println("s3 and s5 are not equal");


    }
}

