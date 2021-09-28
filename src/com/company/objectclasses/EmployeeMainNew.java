package com.company.objectclasses;
import java.util.Scanner;
public class EmployeeMainNew {
    public static void main(String args[])
    {
        int numOfEmp;
        System.out.println("Enter the number of employees:");
        Scanner scan = new Scanner(System.in);
        numOfEmp=scan.nextInt();
        long empIDArray[]=new long[numOfEmp];
        double empSalArray[]=new double[numOfEmp];
        Employee emp= new Employee();
        for(int i=0; i<numOfEmp;i++)
        {
            System.out.println("Enter the employee number of employee "+(i+1));
            //empIDArray[i]=scan.nextLong();
            empIDArray[i]=emp.setEmpID(scan.nextLong());
            System.out.println("Enter the salary of employee "+(i+1));
            //empSalArray[i]=scan.nextDouble();
            empSalArray[i]=emp.setEmpSalary(scan.nextDouble());
       }
         for(int j=0; j<numOfEmp;j++)
        {
            System.out.println("Employee ID of "+(j+1)+" employee "+empIDArray[j]);
            System.out.println("Employee Salary of "+(j+1)+" employee "+empSalArray[j]);
        }
    }
}
