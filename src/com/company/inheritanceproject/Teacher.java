package com.company.inheritanceproject;

public class Teacher {
    final String schoolName="ABC School";
    String teacherName;
    String subjectName;
    float experience;
    int teacherRating;
    public Teacher()
    {
        System.out.println("Default Constructor of Teacher class");
    }
    public Teacher(String teacherName, String subjectName,float experience,int teacherRating)
    {
        this.teacherName=teacherName;
        this.subjectName=subjectName;
        this.experience=experience;
        this.teacherRating=teacherRating;
    }

    public String getSchoolName() {
        return schoolName;
    }


    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
       this.experience = experience;
    }

    public int getTeacherRating() {
        return teacherRating;
    }

    public void setTeacherRating(int teacherRating) {
        this.teacherRating = teacherRating;
    }

    public void show()
    {
        System.out.println("This info is from parent class ");
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("School Name: " + getSchoolName());
        System.out.println("Subject Name: " + getSubjectName());
        System.out.println("Teacher Experience: " + getExperience());
        System.out.println("Teacher Rating: " + getTeacherRating());
    }
}
