package com.company.abstractdemo;

//This class must be declared as abstract class or provide method body for the abstract methods in the parent abstract class
public class PermanentEmployee extends Employee {

    @Override
    public double calcSal(String empType) {
        double tax=0.20;
        double grossSal=60000;
        double netSal=0.0;
        if(empType=="permanent")
        {
            netSal=grossSal-(grossSal*tax);
            netSal=netSal+10000; //10000 is bonus for permanent emp
        }

        return netSal;
    }
}
