import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookWithGenreTest {

    private BookWithGenre bookWithGenre;

    @Before
    public void before(){
        this.bookWithGenre = new BookWithGenre("Carrie", Genre.HORROR);
    }

    @Test
    public void hasTitle(){
        assertEquals("Carrie", bookWithGenre.getTitle());
    }

    @Test
    public void hasGenre(){
        assertEquals(Genre.HORROR, bookWithGenre.getGenre());
    }

    @Test
    public void getsDescription(){
        assertEquals("Psychological drama or fiction, often involving elements of danger or threat", bookWithGenre.getDescription());
    }
}
