package com.company.assignments;


public class Student {

    String name;

    //String arr[]=new String[numOfStudents];
   public Student()
    {
        this.name="Unknown";
        //System.out.println(this.name);
    }
    public Student(String name)
    {
        this.name=name;

    //System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
