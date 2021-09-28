package com.company.abstractdemo;

public class ContractEmployee extends Employee {

    @Override
    public double calcSal(String employmentType) {
        double tax=0.20;
        double grossSal=80000;
        double netSal=0.0;
        if(employmentType=="contract")
        {
            netSal=grossSal-(grossSal*tax);
            netSal=netSal-5000; //5000 deduction for contract emp
        }

        return netSal;
    }
}
