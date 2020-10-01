import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Martinus
 * @version
 *
 */
public class BookLibrary {
    //Variables
    private ArrayList<Book> books;

    //Creates a new ArrayList
    public BookLibrary() {
        books = new ArrayList<>();
    }

    //Populates the books list with books
    public void populateBookCollection(){
        books.add(new Book("Martinus 1","Martinus","Martinus publishing firm",2014, 55, "", false));
        books.add(new Book("Martinus 2","Martinus","Martinus publishing firm",2012, 55, "", true));
        books.add(new Book("Martinus 3","Martinus","Martinus publishing firm",2014, 55, "", false));
        books.add(new Book("Martinus 4","Martinus","Martinus publishing firm",2016, 55, "", true));
    }


    //Finds a book based on the title, returns book
    public Book findBookByTitle(String title){
        Book bookFound = null;

        boolean searching = true;
        Iterator<Book> it = this.books.iterator();
        while(it.hasNext() && searching){
            Book b = it.next();

            if(title.equals(b.getTitle())){
                bookFound = b;
                searching = false;
            }
            else{
                return null;
            }
        }
        return bookFound;
    }

    //Finds the books writen by an author and returns them in a ArrayList
    public ArrayList<Book> findAllBooksByAuthor(String author){
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        booksByAuthor = new ArrayList<>();
        for (Book b : this.books){
            if(author.equals(b.getAuthor())){
                booksByAuthor.add(b);
            }
        }
        return booksByAuthor;
    }

    //Returns the iterator
    public Iterator<Book> getBookIterator(){
        return this.books.iterator();
    }

}
