package com.company.interfacedemo;

public class AnimalMain {
    public static void main(String[] args)
    {
        Bird b1 =new Bird();//creating an object of Bird class
        b1.speak();
        Tiger t1=new Tiger();//creating an object of Tiger class
        t1.speak();
        Animal a1 =new Bird();//dynamic polymorphism - reference of interface and object of Bird is being created
        a1.speak();
        Animal a2 =new Tiger();//dynamic polymorphism
        a2.speak();

      //  Bird b3 =new Animal(); // Not allowed because Interface is just like abstract class and so we can not create object of interface



    }
}
