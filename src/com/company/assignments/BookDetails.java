package com.company.assignments;

public class BookDetails
{
    String author,bookName;

    public BookDetails()
    {
        System.out.println("Book Name must be entered. Blank values not allowed");
    }
    public BookDetails(String bookName)
    {
        this.bookName=bookName;
        this.author="unknown";
    }
    public BookDetails(String bookName, String author)
    {
        this.bookName=bookName;
        this.author=author;
    } /*
    public BookDetails(String author)
    {
        System.out.println("Book Name must be entered. Blank values not allowed");
    }*/


}
