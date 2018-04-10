import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;

    @Before
    public void before(){
        this.book1 = new Book("Middlemarch");
        this.book2 = new Book("Skagboys");
    }

    @Test
    public void hasTitle(){

        assertEquals("Skagboys",book2.getTitle());
    }
}
