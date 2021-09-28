package com.company.assignments;
import java.util.Scanner;
public class BookMain
{
    public static void main(String args[])
    {
        int numOfBooks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        numOfBooks = sc.nextInt();
        sc.nextLine();
        String bName;
        String aName;
        BookDetails bookArr[] = new BookDetails[numOfBooks];
        for (int i = 0; i < numOfBooks; i++) {
            System.out.println("Enter the Name of book no " + (i + 1) + " :");
            bName = sc.nextLine();
            System.out.println("Enter the Author Name of book " + bName + " :");
            aName = sc.nextLine();

            if (bName.equals("")) {
                bookArr[i] = new BookDetails();
            } else if (aName.equals("")) {
                bookArr[i] = new BookDetails((bName));
            } else {
                bookArr[i] = new BookDetails(bName, aName);
            }

                /*bookArr[i].bookName=bName;
                bookArr[i].author=aName;
                System.out.println(bookArr[i].bookName);
                System.out.println(bookArr[i].author);*/

        }
        for(int i=0;i<numOfBooks;i++)
        {
            System.out.println("Name of book "+(i+1)+" is: " +bookArr[i].bookName);
            System.out.println("Author of Book "+bookArr[i].bookName+ " is:" +bookArr[i].author);
        }
       /* for(BookDetails bd:bookArr) {
            System.out.println("Book name is " + bd.bookName);
            System.out.println("Author name is " + bd.author);
        }*/
    }
}