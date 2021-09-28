package com.company.objectclasses;

public class Employee {
long empID;
double empSalary;

long setEmpID(long eid)
{
    empID=eid;
    return eid;
}
double setEmpSalary(double eSal)
{
    empSalary=eSal;
    return eSal;
}
long getEmpID()
{
    return empID;
}
double getEmpSalary()
{
    return empSalary;
}
}

