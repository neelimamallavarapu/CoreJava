package com.company.inheritancedemo;

public class Bike extends Vehicle{ //Bike is sub class of vehicle

    public Bike()
    {
       // super();// similar to calling Vehicle(). If we don't call JVM automatically calls the constructor of the parent class
        System.out.println("Default constructor of Child class Bike");
        super.setVehicleType("Bike is Two Wheeler");
    }

    public void display()
    {
        System.out.println(super.getVehicleType());
    }

    //method overriding
    public void show() //The child class Car is overriding the logic of the parent class function show()
    {
        System.out.println("I am child class bike");
    }
}
