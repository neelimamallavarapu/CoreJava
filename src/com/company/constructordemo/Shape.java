package com.company.constructordemo;

public class Shape {
    int length, breadth;
    String shapeType;
//default constructor gets called during the time of object creation and its job is to initialise the member variable
    //with default values of their data types. example: default value of int is 0 and string is null.
    public Shape() //default constructor is a special method that has the same name as class name, it can have parameter list it can also have return type but we don't specify the return type
    {
        System.out.println("Default Constructor");
        System.out.println(length);//JVM initializes the default values
        System.out.println(breadth);
        System.out.println(shapeType);
    }
    public Shape(int length, String shapeType)
    {
        this.length=length;//The length local variable parameter is getting assigned to the current objects length property, the current object is being pointed by the this keyword.
        this.shapeType=shapeType;
        System.out.println("Two parameterised overloaded Constructor");
        System.out.println(this.length);
        System.out.println(breadth);
        System.out.println(this.shapeType);
    }
    public Shape(int length,int breadth, String shapeType)
    {
        this.length=length;//The length local variable parameter is getting assigned to the current objects length property, the current object is being pointed by the this keyword.
        this.shapeType=shapeType;
        this.breadth=breadth;
        System.out.println("Three parameterised overloaded Constructor");
        System.out.println(this.length);
        System.out.println(this.breadth);
        System.out.println(this.shapeType);
        this.test(); //calls the current objects test method
    }
    public void test()
    {
        System.out.println("I am test method");
    }

}
