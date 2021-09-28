package com.company.stringdemo;
import java.util.Scanner;
public class StringOperatorsMain {
    public static void main(String args[])
    {
        String text="\t This text is tab apart. \r";
        String text1="\n This is new line. ";
        String text2="This is new 2 line.\n ";
        String text3="This is new 3 line. ";
        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number of words to concatenate");
        int numOfWords = scan.nextInt();
        String arrOfStr[]=new String[numOfWords];
        String conStr="";
        scan.nextLine();
        for(int i=0; i<numOfWords;i++)
        {
            System.out.println("Enter the Word to append");
            arrOfStr[i]=scan.nextLine();
            conStr=conStr + " "+arrOfStr[i];

        }
        System.out.println("Basic Concatenated String is: "+conStr);
        StringBuilder sbconStr =new StringBuilder();
        for(String str:arrOfStr)
        {
            //System.out.println("Enter the Word to append");

            sbconStr.append(str);
            sbconStr.append(" ");// to insert space inbetween words

        }
        System.out.println("Concatenated String using String Builder is: "+sbconStr.toString());

        int len= conStr.length();
        System.out.println("Length of Concatenated String is: "+len);
        System.out.println("Part of Concatenated String is: "+conStr.substring(3, 9));
        //Searching a string
        System.out.println("Please enter the word to find:");
        String wordToSearch=scan.nextLine();
        System.out.println("Word to find: "+wordToSearch);
        int index =conStr.indexOf(wordToSearch);
        if(index<0)
            System.out.println("Word Not found");
        else {
            System.out.println("Index of word to search is: " + index + " and length of entire string is " + len);
            System.out.println("Part of Concatenated String is: " + conStr.substring(index, len));
            //System.out.println("Length of entire string is "+len);
        }
        String split[]=conStr.split(" ");
       System.out.println("Words after split:");
       for(String S:split) {
           System.out.println(S);
       }
    }

}
