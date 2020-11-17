import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;



    public Library(){

        this.stock = new ArrayList<Book>();
        this.capacity = 10;

    }

    public int bookTotal(){
        return this.stock.size();
    }

    public void addBook(Book book){
        int totalStock = this.stock.size();
        if(totalStock < this.capacity) {
            this.stock.add(book);
        }
    }

    public int checkCapacity(){
        return this.capacity;
    }

}
