public class Book {

    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int pages;
    private String barcode; //No math is necessary for the barcode, and its a large number, so i chose string instead of int or long
    private boolean isBorrowed;

    //Creates Book object
    public Book (String title, String author, String publisher, int yearPublished, int pages, String barcode, boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.pages = pages;
        this.barcode = barcode;
        this.isBorrowed = isBorrowed;
    }

    //Return title
    public String getTitle() {
        return title;
    }

    //Return author
    public String getAuthor() {
        return author;
    }

    //Return publisher
    public String getPublisher() {
        return publisher;
    }

    //Return publishing year
    public int getYearPublished() {
        return yearPublished;
    }

    //Return amount of pages
    public int getPages() {
        return pages;
    }

    //Return barcode of book
    public String getBarcode() {
        return barcode;
    }

    //Return whether or not the book is currently borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    //Sets isBorrowed boolean
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
