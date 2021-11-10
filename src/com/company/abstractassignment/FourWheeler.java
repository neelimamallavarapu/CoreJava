package com.company.abstractassignment;

public class FourWheeler  extends Vehicle{

        String vehicleName;
        String vehicleType;
        String mileage;
        public  FourWheeler()    {    };
        public  FourWheeler(String name)    { vehicleMileage(name);   };
        public void test(TwoWheeler tw){
            tw.setVehicleName("Enfield");
            tw.setVehicleType("2 wheeler");
            tw.setMileage(30);
        }
        public void vehicleMileage(String name)
        {
            super.setVehicleName(name);
            super.setVehicleType("4 Wheeler");

            if(name=="Swift")
                super.setMileage(20);
            else if(name=="Indica")
                super.setMileage(21);
        }


    /*
    public void displayDetails()
    {

        System.out.println("Vehicle Name:"+super.getVehicleName());
        System.out.println("Vehicle Type:"+super.getVehicleType());
        System.out.println("Vehicle Mileage:"+super.getMileage());
        //System.out.println("Vehicle Name:"+super.getVehicleName());


    }*/


}
