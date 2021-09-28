package com.company.practicingarrays;
import java.util.Scanner;
public class Employee
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, Please enter the number of employees in the company");
        int numEmp = scan.nextInt();//variable to store the number of employees during run time
        int arrayOfEmployee[] = new int[numEmp];//declaring array
        for(int j=0; j<arrayOfEmployee.length;j++)
        {
            System.out.println("Please enter the employee ID of "+(j+1)+" employee");
            arrayOfEmployee[j]=scan.nextInt();
        }

//printing all employee Ids
        for (int i = 0; i < arrayOfEmployee.length; i++) {
            System.out.println("Employee ID of "+ (i+1)+" is "+arrayOfEmployee[i]);
        }
    }
}
