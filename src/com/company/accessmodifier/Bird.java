package com.company.accessmodifier;

public class Bird {
public void display()
{
    Animal animal =new Animal();

    //System.out.println(animal.animalName);// Not possible because Private variable animal can be accessible only in the same Animal class.
    System.out.println(animal.getAnimalName());//Public members can be accessed within same class, with in same package and outside the class with different package
    System.out.println(animal.animalType);//default member variables and functions can be accessed within same class and outside the class within the same package.
    System.out.println(animal.canFly);//Protected variable,methods can be accessed within the same class and within the same package.


}

}
