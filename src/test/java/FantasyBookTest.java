import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyBookTest {

    FantasyBook myFantasyBook = new FantasyBook("Twp Towers", "Tolkien", "Paperbsck", 352);

    @Test
    public void  testFantasyBookItemTitleMethod() {
        assertEquals("This fantasy book is not Two Towers.", "Two Towers", myFantasyBook.getItemTitle());
    }

    @Test
    public void  testFantasyBookWriterNameMethod() {
        assertEquals("This fantasy book is not by Tolkien.", "Tolkien", myFantasyBook.getWriterName());
    }

    @Test
    public void  testFantasyBookCoverTypeMethod() {
        assertEquals("This fantasy book is not a paperback.", "Paperback", myFantasyBook.getCoverType());
    }

    @Test
    public void  testFantasyBookPagesMethod() {
        assertEquals("This fantasy book is not 352 pages.", 352, myFantasyBook.getPages());
    }

}
