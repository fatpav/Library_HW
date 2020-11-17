import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        library = new Library();
        borrower = new Borrower();
        book = new Book("good book", "Mr Writer", "books");
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBook(book);
        library.checkOut();
        borrower.borrowBook(book);
        assertEquals(0, library.bookTotal());
        assertEquals(1, borrower.takenCount());
    }
}
