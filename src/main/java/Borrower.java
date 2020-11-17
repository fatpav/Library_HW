import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<Book>();
    }

    public void borrowBook(Book book){
        this.borrowed.add(book);
    }

    public int takenCount(){
        return this.borrowed.size();
    }

}
