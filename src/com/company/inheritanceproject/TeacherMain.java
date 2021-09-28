package com.company.inheritanceproject;

public class TeacherMain {
    public static void main( String[] args)
    {
     Teacher t1 =new Teacher();
        t1.show();
        Teacher t2 =new Teacher("Ju","Ma",3,5);
        t2.show();
     MathsTeacher mt1 =new MathsTeacher()   ;
     mt1.display();
        mt1.show();

     MathsTeacher mt2=new MathsTeacher("Juli","Maths", 2, 5);
     mt2.display();

     Teacher t3 = new MathsTeacher("Meena","Maths", 12, 3);
     t3.show();

    // MathsTeacher mt3=new Teacher(); -- not possible
        ScienceTeacher st1 =new ScienceTeacher();
        st1.show();
        //st1.show();
        ScienceTeacher st2 =new ScienceTeacher("carmel","Science",15, 5, 50);
        st2.show();
       // st2.show();
    }
}
