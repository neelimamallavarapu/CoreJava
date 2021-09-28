package com.company.inheritancedemo;

public class InheritanceMain {
    public static void main(String args[])
    {
        Bike bike =new Bike();
        bike.display();

        Car car = new Car();
        car.showDetails();
        Car car1 = new Car(8989765);
        car1.showDetails();
System.out.println("-------------------------------------------------------------------------------------");

//The concept of making decision to which objects method should be called at run time is called dynamic polymorphism
        //Whose object that particular method gets called.
        Vehicle vehicle = new Vehicle();
        vehicle.show();

        System.out.println("-------------------------------------------------------------------------------------");

        vehicle  = new Bike();
        vehicle.show();

        System.out.println("-------------------------------------------------------------------------------------");

        vehicle =new Car();
        vehicle.show();

    }


}
