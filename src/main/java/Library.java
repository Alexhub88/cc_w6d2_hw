import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
    private Book book;

    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = 1;
    }

    public int getBookCount(){
        return this.stock.size();
    }

    public void addBook(Book book){
        this.stock.add(book);
    }

    public boolean checkIfStockIsFull(){

        if( getBookCount() < this.capacity ) {
           return false;
        }   else  {
           return true;
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }


}
