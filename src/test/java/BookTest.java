import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Consider Phlebas", "Iain M Banks", "Sci-Fi");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Consider Phlebas", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Iain M Banks", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Sci-Fi", book.getGenre());
    }
}
