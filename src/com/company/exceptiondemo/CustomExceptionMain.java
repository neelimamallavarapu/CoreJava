package com.company.exceptiondemo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class CustomExceptionMain {
    static void validateAge(int age) throws InvalidAgeException, IOException
    {
        if (age<18) {
            InvalidAgeException ae =new InvalidAgeException("Not Valid to vote");
            throw  ae;
        }
        else
        {
            System.out.println("Welcome to Vote!!!");
        }
        throw new IOException(); // This just for example to show, it will be handled by parent catch block because we did not define the method to handle
    }
    public static void main(String args[])
    {
        try{
            validateAge(12);
            validateAge(21);//This line skips execution because InvalidAgeException get thrown inside validateAge().
            //It looks for the matching catch block otherwise looks for general exception block and the program continues.

        }catch (InvalidAgeException ie)
        {System.out.println("Exception Occured:"+ie);}
        catch (Exception e)//Parent class catch block should always be at last otherwise compilation error.
        {System.out.println("Exception Occured: "+e);}

        System.out.println("Rest of the code");
    }
}
