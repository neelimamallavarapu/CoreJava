package com.company.accessmodifier;

public class Cat extends Animal {
    public void display() {
        //Animal animal = new Animal();not needed as we are using inheritance

        System.out.println(canFly);//protected members can be accessed with in the package in the child classes.


    }
}