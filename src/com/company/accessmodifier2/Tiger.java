package com.company.accessmodifier2;

import com.company.accessmodifier.Animal;

public class Tiger {

    Animal animal =new Animal();

    public  void display()
    {
        //System.out.println(animal.animalName);//animal name is private variable can not be accessed outside the class
        //System.out.println(animal.animalType);//animal Type is default variable can not be accessed outside package
        System.out.println(animal.getAnimalName()); //getAnimalName is public method and can be accessible from anywhere.
        //System.out.println(animal.canFly); //protected variable can not be accessed outside the package.

    }


}
