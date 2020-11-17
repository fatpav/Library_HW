import java.util.*;

public class BookIndex {

    private Book book;

        Map<Integer, Book> bookList = new HashMap<Integer, Book>();



        public int indexCount(){
            return bookList.size();
        }

        public void addBook(Book book){
            bookList.put(0,book);
        }

        public int genreCount(String genre){
            int total = 0;

            for(int number : booklist.g)
//            bookList.forEach((T, A, G) -> System.out.println(T + A + G));
//                //for every match of 'Genre' add 1 to the total and return the total
////                total =+ 1;


        }

}


