package com.company.abstractdemo;

public  abstract class Employee {
    private final String companyName="xyz pvt ltd";

    //this is a concrete method because this method has its own body and implementation
    public String getCompanyName()
    {
        return this.companyName;
    }


    public abstract double calcSal(String employmentType);

}
