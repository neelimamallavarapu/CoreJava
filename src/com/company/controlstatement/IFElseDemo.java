package com.company.controlstatement;

public class IFElseDemo {
    public static void main(String[] arr)
    {
        int marksObtained=700;
        int totalMarks=1000;

        if (marksObtained>500 && marksObtained<700)
        {
            System.out.println("Student  just passed");
        }
        else if (marksObtained>=700)
        {
            System.out.println("Passed with Grade B");
        }
        else
        {
            System.out.println("Student Failed");
        }


    }
}
