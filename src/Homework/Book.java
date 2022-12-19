package Homework;

public class Book {

    String bookName;
    String authorName;
    int publishingYear;


    public Book(String bookName, String authorName, int publishingYear) {

        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;

    }
    public String getBookName ()  {
        return this.bookName;
    }
    public String getAuthorName() {
        return this.authorName;

    }
    public int setPublishingYear() {
        return this.publishingYear;
    }


    public static void main(String[] args) {


    }

}

