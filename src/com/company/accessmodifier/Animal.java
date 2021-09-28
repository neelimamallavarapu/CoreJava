package com.company.accessmodifier;

public class Animal {
private String animalName="Fox";
protected boolean canFly;
    String animalType;

    //public final Animal(){} --- final keyword not allowed with constructor
public String getAnimalName()
{
    System.out.println(this.animalName);//Private variables and methods can be accessed within the same class
    System.out.println(this.canFly);//Protected variables and methods can be accessed with in same class
    System.out.println(this.animalType);//default variables and methods can be accessed with in same class
    return this.animalName;  //Private members can be accessed within the same class.


}

}
