package com.company.staticdemo;

public class StaticPractice {
    static int a=10;
    static int b;
    int empId=555;
    static
    {
      b=2*a;
      System.out.println("b: from static block: "+b);
    }
    {
        System.out.println("I am a non static block");
    }
    public StaticPractice() {

        System.out.println("Default Constructor called");
    }
    public void show()
    {
        //static members are allowed to access in non static method/context
        System.out.println("Value of a from show method: "+this.a );
        System.out.println("Value of emploeeID from show method: "+this.empId );
    }

    public static void display()
    {
        //System.out.println("Value of a from show method: "+this.a );//static method gets loaded before the object gets created and so, 'this'
        // reference cannot be used as there is not current object calling 'a'. This can not be used inside static context.

        System.out.println("Value of a from show method: "+a ); //a is static and so it is accessible.
       // System.out.println("Value of emploeeID from show method: "+empId );//Nonstatic objects can not be reference inside static context.
    }


    public static void main(String args[])
    {
        System.out.println("From main");
        System.out.println("Value of a is :"+a);
        System.out.println("From main value of b is :"+b);
        StaticPractice sp1 = new StaticPractice();
        sp1.a=99;//class level variable is being modified by sp1 which means from now on all the objects will see the value of a as 99.
        sp1.empId=666;
        StaticPractice sp2 = new StaticPractice();
        System.out.println("sp2.a value is: "+sp2.a);//a is static variable and the value changed by object sp1 will be reflected to sp2.a
        System.out.println(StaticPractice.a);//static members can be called with class name directly.
        StaticPractice.display();
        //System.out.println(StaticPractice.empID);
        System.out.println("sp2.empId value is: "+sp2.empId);// empid is class level variable and so both have their own values.
    }



    }
