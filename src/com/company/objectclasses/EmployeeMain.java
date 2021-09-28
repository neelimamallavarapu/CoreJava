package com.company.objectclasses;

public class EmployeeMain {
    public static void main(String args[])
    {
        //e1 is reference        //below line creates new object and e1 reference is pointing to it.
        Employee e1             =new Employee();
        e1.setEmpID(123);
        e1.setEmpSalary(12345.678);

        Employee e2=new Employee();
        e2.setEmpID(234);
        e2.setEmpSalary(23456.789);

        System.out.println("Employee1 name:"+e1.getEmpID());
        System.out.println("Employee1 Salary:"+e1.getEmpSalary());
        System.out.println("Employee2 name:"+e2.getEmpID());
        System.out.println("Employee2 name:"+e2.getEmpSalary());


    }

}
