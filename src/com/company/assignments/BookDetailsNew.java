package com.company.assignments;

public class BookDetailsNew {
    long bookId;
    String bookTitle,description;//,author;
    float bookPrice;
    BookAuthor bookAuthor;

    public BookDetailsNew()
    {
        System.out.println("Book Name can not be null. Please enter valid book Name");
        this.bookTitle="";
        this.description="";
        this.bookAuthor.authorName="";
        this.bookPrice=0.0f;
    }
    public BookDetailsNew(long id,String title, String description, String author,float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
       // this.bookAuthor.authorName=author;
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.bookAuthor.authorName="Unknown";
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, float price, String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.bookAuthor.authorName=author;
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title, String description, String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
        this.bookAuthor.authorName=author;
        //this.bookPrice=price;
        System.out.println("This book is not for sale");
    }
    public BookDetailsNew(long id,String title,  String author)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="No description available";
        this.bookAuthor.authorName=author;
        //this.bookPrice=price;
        System.out.println("This book is not for sale");
    }
    public BookDetailsNew(long id,String title, String description, float price)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description=description;
        this.bookAuthor.authorName="Unknown";
        this.bookPrice=price;
    }
    public BookDetailsNew(long id,String title)
    {
        this.bookId=id;
        this.bookTitle=title;
        this.description="Not Available";
        this.bookAuthor.authorName="Unknown";
        System.out.println("This book is not for sale");
            }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return bookAuthor.authorName;
    }

    public void setAuthor(String author) {
        this.bookAuthor.authorName = author;
    }

    public BookAuthor getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(BookAuthor bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
