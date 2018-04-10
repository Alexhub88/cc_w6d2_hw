import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before() {
        this.library = new Library();
        this.book1 = new Book("Middlemarch");
        this.book2 = new Book("Skagboys");
        this.borrower = new Borrower("Bill");
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void testBorrowsCorrectly() {
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(library);
        assertEquals(1, borrower.getBookCount());
    }
}