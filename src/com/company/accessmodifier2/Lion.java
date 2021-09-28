package com.company.accessmodifier2;

import com.company.accessmodifier.Animal;

public class Lion extends Animal {

    public void display()
    {
        System.out.println(canFly);//protected members can be accessed outside the package in the child classes.
    }
}
