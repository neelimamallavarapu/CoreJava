package com.company.stringdemo;

public class StringBuilderMain {
//When ever you want to do string manipulation use String Builder for better memory management and performance instead of string
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Neelima");
        String s= sb.toString();
        System.out.println(s);
        System.out.println(sb);
        sb.append(" ");
        sb.append(" Mallavarapu");
        System.out.println(sb);
        sb.insert(8,"B");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(4,8);
        System.out.println(sb);
        System.out.println(sb.replace(6,10,"Myname"));


    }
}
