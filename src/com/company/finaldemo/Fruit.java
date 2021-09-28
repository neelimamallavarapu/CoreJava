package com.company.finaldemo;

public class Fruit { //Final class can not be inherited
    String fruitColour;
    public  void displayName() //if we make it public final displayName() - it can not be overridden
    {
        System.out.println("Fruit Parent Class");
    }
}
