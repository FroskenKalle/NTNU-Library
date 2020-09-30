import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books;

    //Creates a new ArrayList
    public BookManager() {
        books = new ArrayList<>();

    }

    //Populates the books list with books
    public void populateBookCollection(){
        books.add(new Book("Martinus 1","Martinus","Martinus publishing firm",2014, 55, "", false));
        books.add(new Book("Martinus 2","Martinus","Martinus publishing firm",2012, 55, "", true));
        books.add(new Book("Martinus 3","Martinus","Martinus publishing firm",2014, 55, "", false));
        books.add(new Book("Martinus 4","Martinus","Martinus publishing firm",2016, 55, "", true));
    }

    //Prints the title, author, publisher, publishing year, number of pages, barcode and if the book is borrowed
    public void printBookData(){
        books.forEach(book -> System.out.println("Title: " + book.getTitle() + "Author: " + book.getAuthor() + "Publisher: " + book.getPublisher() + "Publishing year: " + book.getYearPublished() + "Pages: " + book.getPages() + "Barcode: " + book.getBarcode() + "Borrowed: " + book.isBorrowed()));
    }

    public static void main(String[] args) {
    }
}
