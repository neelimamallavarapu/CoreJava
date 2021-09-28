package com.company.inheritanceproject;

public class ScienceTeacher extends Teacher {
private int numberOfExperiments;
    public ScienceTeacher()
    {
        System.out.println("Default constructor of Maths Teacher");
        super.setTeacherName("ScienceMiss");
        super.setSubjectName("Science");
        super.setExperience(4);
        super.setTeacherRating(4);

    }
    public ScienceTeacher(String name, String sub, float exp, int rating, int numberOfExperiments)
    {
        System.out.println("Default constructor of Maths Teacher");
        super.setTeacherName(name);
        super.setSubjectName(sub);
        super.setExperience(exp);
        super.setTeacherRating(rating);
        this.numberOfExperiments=numberOfExperiments;

    }
    public  ScienceTeacher(int numOfExperiments)
    {
        this();
        this.numberOfExperiments=numOfExperiments;
    }

   /* public void display()
    {
        System.out.println(super.getTeacherName());
        System.out.println(super.getSchoolName());
        System.out.println(super.getSubjectName());
        System.out.println(super.getExperience());
        System.out.println(super.getTeacherRating());
        System.out.println(this.numberOfExperiments);

    */
    public void show()
    {
        super.show();
        System.out.println("Number of experiments" + numberOfExperiments);
    }
}
