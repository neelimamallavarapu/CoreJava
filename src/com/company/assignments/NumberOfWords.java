package com.company.assignments;

import java.util.Scanner;

public class NumberOfWords {


    public static int numOfWords(String string) {
        int numOfChar=string.length();
        char ch[] = new char[numOfChar];
        int count=0;
        for (int i = 0; i < numOfChar; i++) {
            ch[i] = string.charAt(i);
            if (ch[i] == ' ')
                count++;


        }
        return count+1;
    }

    public static String upperCase(String string)
    {
        string=string.toUpperCase();

        return string ;

    }


    public static void main(String args[]) {
        String myString;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        myString=scan.nextLine();
        System.out.println("number of words :"+ numOfWords(myString));
        System.out.println("Uppercase converted string: " + upperCase(myString));




    }
}
