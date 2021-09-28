package com.company.stringdemo;
import java.util.Scanner;
public class EmployeeStrMain
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi, Please enter the number of employees in the company");
            int numOfEmp = scan.nextInt();//variable to store the number of employees during run time
            long arrayOfEmployeeId[] = new long[numOfEmp];//declaring array
               String arrOfEmpName[]= new String[numOfEmp];
               String arrOfAddress[]=new String[numOfEmp];
               double arrOfSal[]= new double[numOfEmp];
               EmployeeDetails emp =new EmployeeDetails();
            for(int j=0; j<numOfEmp;j++)
            {
                System.out.println("Please enter the employee ID of employee "+(j+1));
                arrayOfEmployeeId[j]=emp.setEmpId(scan.nextLong());
                scan.nextLine();// this is to flush the blank string value got from non string value
                System.out.println("Please enter the employee name of employee "+(j+1));
                //arrOfEmpName[j]= emp.setEmpName(scan.nextLine());
               // System.out.println("Employee name:"+ arrOfEmpName[j]);
                arrOfEmpName[j]=emp.setEmpName(scan.nextLine());
                System.out.println("Enter the Address of employee "+(j+1) );
                arrOfAddress[j]=emp.setAddress(scan.nextLine());
                System.out.println("Enter the Salary of Employee "+(j+1));
                arrOfSal[j]=emp.setEmpSal(scan.nextDouble());

            }
//printing all employee details
           for (int i = 0; i < numOfEmp; i++)
            {
                System.out.println("Employee ID of "+ (i+1)+" is "+ emp.getEmpID(arrayOfEmployeeId[i]));
                System.out.println("Employee name of "+ (i+1)+" is "+emp.getEmpName(arrOfEmpName[i]));
                System.out.println("Employee Address of "+ (i+1)+" is "+emp.getAddress(arrOfAddress[i]));
                System.out.println("Employee Salary of "+ (i+1)+" is "+emp.getSal(arrOfSal[i]));
            }
        }
    }


