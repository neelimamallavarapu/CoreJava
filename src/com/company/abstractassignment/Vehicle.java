package com.company.abstractassignment;

public abstract class Vehicle {
    String vehicleName;
    String vehicleType;
    int mileage;

    public abstract void vehicleMileage(String name) ;
    public Vehicle()
     {
        // System.out.println("Default Constructor of Vehicle class called");
        // vehicleMileage(vehicleName);

     }
     public Vehicle(String vehicleName)
     {
         //this();
         setVehicleName(vehicleName);

     }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void displayDetails()
    {
        System.out.println("Vehicle Name:"+getVehicleName());
        System.out.println("Vehicle Type:"+getVehicleType());
        System.out.println("Vehicle Mileage:"+getMileage());
        //System.out.println("Vehicle Name:"+super.getVehicleName());


    }
}
