import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;
    private Book book8;
    private Book book9;
    private Book book10;
    private Book book11;
    private Book book12;

    private Library library;

    @Before
    public void before(){
        library = new Library();
        book = new Book ("Look to Windward", "Iain M Banks", "Sci-Fi");
        book2 = new Book ("Berlin", "Anthony Beevor", "History");
        book3 = new Book ("Dance of Dragons", "George RR Martin", "Fantasy");
        book4 = new Book ("War and Peace", "Charles Dickens", "Fiction");
        book5 = new Book ("Stalingrad", "Anthony Beevor", "History");
        book6 = new Book ("Smiley's People", "John LeCarre", "Fiction");
        book7 = new Book ("Wasp Factory", "Iain Banks", "Fiction");
        book8 = new Book ("Lord Foul's Bane", "Stephen Donaldson", "Fiction");
        book9 = new Book ("Bon Vivant's Companion", "Jerry Thomas", "Non-Fiction");
        book10 = new Book ("Potions of the Caribbean", "Jeff Berry", "Non-Fiction");
        book11 = new Book ("Ring World", "Robert Heinlein", "Sci-Fi");
        book12 = new Book ("So Long, And Thanks For All The Fish", "Douglas Adams", "Sci-Fi");

        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);

    }

    @Test
    public void libraryStartsWithBooks(){
        assertEquals(10, library.bookTotal());
    }

    @Test
    public void canAddBookToStockIfThereIsSpace(){
        library.addBook(book);
        assertEquals(10, library.bookTotal());
    }

    @Test
    public void checkCapacity(){
        assertEquals(10, library.checkCapacity());
    }

}
