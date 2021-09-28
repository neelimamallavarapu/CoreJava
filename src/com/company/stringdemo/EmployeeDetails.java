package com.company.stringdemo;

import java.util.Scanner;
public class EmployeeDetails
{
    String empName;
    long empID;
    String empAddress;
    double empSal;

    String setEmpName(String name)
    {
        empName=name;
        return empName;
    }
    long setEmpId(long id)
    {
        empID=id;
        return empID;
    }
    String setAddress(String address)
    {
        empAddress=address;
        return empAddress;
    }
    double setEmpSal(double sal)
    {
        empSal=sal;
        return empSal;
    }
    String getEmpName(String eName)
    {
        return eName;
    }
    long getEmpID(long eId)
    {
        return eId;
    }
    String getAddress(String eAdd)
    {
        return eAdd;
    }
    double getSal(double eSal)
    {
        return eSal;
    }
}