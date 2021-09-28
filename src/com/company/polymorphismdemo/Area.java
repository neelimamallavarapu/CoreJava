package com.company.polymorphismdemo;

public class Area {
    public double calcArea(double r)
    {
        return(3.14*r*r);
    }
    public double calcArea (int l, int b)
    {
        return(l*b);
    }
    public double calcArea(double w, int l)
    {
        return (l * w);
    }
    public long calcArea( long l)
    {
        return(l*l);
    }
}
