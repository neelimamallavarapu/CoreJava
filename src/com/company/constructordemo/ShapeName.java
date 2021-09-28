package com.company.constructordemo;

public class ShapeName {
    public static void main(String[] args)
    {
        Shape s=new Shape() ;//calls default or zero parameter constructor this keyword and 's' reference are pointing to
        // same object where the object variables length, breadth and shapeType are initialized by the default values of JVM.
        Shape s2=new Shape(10, "Square") ;
        Shape s3=new Shape(10,8, "Rectangle") ;//this is example of polymorphism because decision is will be made at compile time to which overloaded constructor to be called.



    }
}
