package com.company.stringdemo;

public class CompareToMain {
    public static void main(String[] args)
    {
        String s1="apple";
        String s2="banana";
        String s3="cat";
        String s4="apple";
        System.out.println(s2.compareTo(s1));//(s2-s1 ascii 98-97=1)
        System.out.println(s1.compareTo(s3));//s1-s3 97-99=-2
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s1));
        System.out.println(s4.compareTo(s2));
    }
}
