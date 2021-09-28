package com.company.inheritanceproject;

public class MathsTeacher extends Teacher {
    public MathsTeacher()
    {
        System.out.println("Default constructor of Maths Teacher");
        super.setTeacherName("MathsMiss");
        super.setSubjectName("Maths");
        super.setExperience(2);
        super.setTeacherRating(5);

    }
    public MathsTeacher(String name, String sub, float exp, int rating)
    {
        System.out.println("Default constructor of Maths Teacher");
        super.setTeacherName(name);
        super.setSubjectName(sub);
        super.setExperience(exp);
        super.setTeacherRating(rating);

    }

    public void display()
    {
        System.out.println(super.getTeacherName());
        System.out.println(super.getSchoolName());
        System.out.println(super.getSubjectName());
        System.out.println(super.getExperience());
        System.out.println(super.getTeacherRating());

    }
    /*public void show()
    {
        super.show();
    }*/
}
