package com.company.abstractdemo;

public class AbstractMain {
    public static void main(String args[])
    {
       // Employee e =new Employee(); //object instantiation/creation is not allowed for abstract class.
        PermanentEmployee neelima =new PermanentEmployee();
        String companyName=neelima.getCompanyName();
        double salary=neelima.calcSal("permanent");
        System.out.println("Your company is " + companyName);
    System.out.println("Your Salary is: "+salary);


    ContractEmployee neelima1     =new ContractEmployee();
    companyName= neelima1.getCompanyName();
    salary= neelima1.calcSal("contract");
        System.out.println("neelima1 company is " + companyName);
        System.out.println("neelima1 Salary is: "+salary);




    }
}
