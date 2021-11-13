package com.company.interfacedemo;

public class Bird implements Animal, SuperAnimal { // Example of multiple inheritance
    @Override
    public void speak() {
        System.out.println("Chirp");
    }
}
