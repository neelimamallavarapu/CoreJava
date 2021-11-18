package com.company.exceptiondemo;

public class ExceptionNullPointer_ArrayLengthOutOfBoundMain {

    public static void displayLength(int arr[])
    {
        try {
            System.out.println(arr.length);
        }catch(Exception e)
        {
            System.out.println("Array is empty");
        }
        System.out.println("end of displayLength");
    }
    public  static void displayNthElement(String str[], int n)
    {
        try {
            System.out.println(str[n]);
        }catch(Exception e)
        {
            System.out.println("Array is smaller than the required element");
        }
        System.out.println("end of displayNthElement");
    }

    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[] = new int[2];
        int e[] = null;
        String c[]=null;
        String d[]= new String[]{"abc","xyz"};

        displayLength(a);
        displayLength(b);
        displayLength(e);

        displayNthElement(d,1);
        displayNthElement(d,10);
        displayNthElement(c,1);
    }
}
