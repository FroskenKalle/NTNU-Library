import java.util.Iterator;
/**
 * @author Martinus
 * @version
 *
 */
public class BookLibraryApp {
    //Variables
    private BookLibrary bookLibrary;

    public static void main(String[] args) {

    }

    //Creates an object of BookLibrary and populates it with books
    public void init() {
        bookLibrary = new BookLibrary();

        bookLibrary.populateBookCollection();
    }

    //Prints the title, author, publisher, publishing year, number of pages, barcode
    public void listAllBooks() {
        Iterator<Book> it = bookLibrary.getBookIterator();
        while (it.hasNext()) {
            Book b = it.next();
            System.out.println("\n\nTitle: " + b.getTitle() + "\nPublisher: " + b.getPublisher() +
                    "\nPublishing year: " + b.getYearPublished() + "\nPages: " + b.getPages() +
                    "\nBarcode: " + b.getBarcode() + "\nIs borrowed: " + b.isBorrowed());
        }
    }


}