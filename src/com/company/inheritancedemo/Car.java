package com.company.inheritancedemo;

public class Car extends Vehicle{ // car is sub class of vehicle

    private long buildNumber;

    public Car()
{
    super();
    System.out.println("Default constructor of Child class Car");
    super.setVehicleType("Car is four wheeler");
}
public Car(long buildNumber)
{
    this(); //calls default constructor of car class which is line#7
    this.buildNumber=buildNumber;
}
    public void showDetails()
    {
        System.out.println(super.getVehicleType());//System.out.println(getVehicleType()); also works as by default it calls super class method
        System.out.println("Build number is :" +this.buildNumber);
    }

    //Method overriding
    public void show() //The child class Car is overriding the logic of the parent class function show()
    {
        System.out.println("I am child class car");
    }

}
