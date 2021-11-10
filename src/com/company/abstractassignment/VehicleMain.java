package com.company.abstractassignment;

public class VehicleMain {
    public static void main(String[] args)
    {

        TwoWheeler tw1 =new TwoWheeler();
        TwoWheeler tw2 =new TwoWheeler("Pulser");

        tw1.displayDetails();
        tw2.displayDetails();
        tw2.displayDetails();
        FourWheeler f1 =new FourWheeler("Indica");
                f1.displayDetails();
        Vehicle v1 =new TwoWheeler("Pleasure");
        v1.displayDetails();
        Vehicle v2=new FourWheeler("Swift");
        v2.displayDetails();
       //tw1.show(tw1);
        f1.test(tw1);
        System.out.println(tw1.vehicleName);
        System.out.println(tw1.vehicleType);
        System.out.println(tw1.mileage);
    }
}
