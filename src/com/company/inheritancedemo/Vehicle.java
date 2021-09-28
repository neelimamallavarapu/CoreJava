package com.company.inheritancedemo;

public class Vehicle {//It is super class
 private String vehicleType;

 public  Vehicle()
 {
     System.out.println("Default constructor of super class Vehicle");

 }
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void show()
    {
        System.out.println("I am Parent class vehicle");
    }
}
