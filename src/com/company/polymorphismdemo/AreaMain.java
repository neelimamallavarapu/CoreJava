package com.company.polymorphismdemo;

public class AreaMain {
    public static void main (String[] args)
    {
        double radius;
        int length,breadth;
        double width;
        long side;
        Area ar =new Area();
        System.out.println("Area of Circle is:"+ar.calcArea(2.5));
        System.out.println("Area of Rectangle is:"+ar.calcArea(3,4));
        System.out.println("Area of square is:"+ar.calcArea(25));
        System.out.println("Area of Rectangle width called first is:"+ar.calcArea(2.5, 5));
    }
}
