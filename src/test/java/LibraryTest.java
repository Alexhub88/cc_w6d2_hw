import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

        @Before
        public void before () {
            this.library = new Library();
            this.book1 = new Book("Middlemarch");
            this.book2 = new Book("Skagboys");
        }

        @Test
        public void startsEmpty() {
            assertEquals(0,library.getBookCount());
        }

        @Test
        public void addsBook() {
           library.addBook(book1);
           assertEquals(1,library.getBookCount());
        }

        @Test
        public void testStockNotFull() {
           assertEquals(false, library.checkIfStockIsFull());
        }

        @Test
        public void testStockIsFull() {
           library.addBook(book1);
           assertEquals(true, library.checkIfStockIsFull());
        }

}
