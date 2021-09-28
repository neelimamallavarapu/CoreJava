package com.company.abstractassignment;

public class TwoWheeler extends Vehicle {
    String vehicleName;
    String vehicleType;
    String mileage;
    public  TwoWheeler()    {    };
    public  TwoWheeler(String name)    { vehicleMileage(name);   };

    public void vehicleMileage(String name)
    {
        super.setVehicleName(name);
      //super.Vehicle(name); -- error
        super.setVehicleType("2 Wheeler");

        if(name=="Pulser")
            super.setMileage(60);
        else if(name=="Pleasure")
            super.setMileage(50);
    }
/*
    public void show(TwoWheeler tw){
        System.out.println("Below is from show function of 2 wheeler class:");
        tw.setVehicleName("Enfield");
        tw.setVehicleType("2 wheeler");
        tw.setMileage(30);
        System.out.println(tw.vehicleName);
        System.out.println(tw.vehicleType);
        System.out.println(tw.mileage);



    }*/


    /*
    public void displayDetails()
    {

        System.out.println("Vehicle Name:"+super.getVehicleName());
        System.out.println("Vehicle Type:"+super.getVehicleType());
        System.out.println("Vehicle Mileage:"+super.getMileage());
        //System.out.println("Vehicle Name:"+super.getVehicleName());


    }*/
}
