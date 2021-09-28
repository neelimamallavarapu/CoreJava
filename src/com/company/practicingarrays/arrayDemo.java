package com.company.practicingarrays;

public class arrayDemo {
    public static void main(String[] args)
    {
        int arrayOfEmpId[]=new int[5];
        System.out.println(arrayOfEmpId[3]);
        for(int i=0;i<arrayOfEmpId.length;i++)
        {
        System.out.println(arrayOfEmpId[i]);
        }
        boolean arrayIsEmp[]=new boolean[5];
        for(int i=0;i<arrayOfEmpId.length;i++)
        {
            System.out.println(arrayIsEmp[i]);
        }

        for(int i:arrayOfEmpId)
        {
            System.out.println(i);
        }


    }
}
