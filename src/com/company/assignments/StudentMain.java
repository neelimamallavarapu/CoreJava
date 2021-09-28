package com.company.assignments;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {

        int numOfStudents;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of Students");
        numOfStudents = s.nextInt();
        s.nextLine();
        Student arr[] = new Student[numOfStudents];
        //String arr[]=new String[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {

            System.out.println("Enter the name of Student no [" + (i + 1) + "]");
            //arr[i] = new Student(); // give memory to the i th position inside array
           // arr[i].name = s.nextLine(); // here you assign the i th Student object name variable value as input
            String name = s.nextLine();
            if(name.equals("")) {
                arr[i] = new Student();
            }else{
                arr[i] = new Student(name);
            }
            /*arr[i] = new Student();
            arr[i] = new Student(name);*/

        }
        for (int i = 0; i < numOfStudents; i++) {

            System.out.println("The name of Student no [" + (i + 1) + "] is: " + arr[i].name);

        }
        for (Student stud : arr) {
            System.out.println(stud.name);
        }
    }
}