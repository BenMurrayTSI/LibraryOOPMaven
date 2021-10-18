import com.softwareinstitute.training.murray.ben.FantasyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyBookTest {

    FantasyBook myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);

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

    @Test
    public void  testFantasyBookSetting() {
        assertEquals("This fantasy book setting is not correct.", "Setting is goblins and stuff.", myFantasyBook.getSetting());
    }

    @Test
    public void  testFantasyBookTellsStory() {
        assertEquals("This fantasy book story description is not correct.", "Tells story with magic.", myFantasyBook.getTellStory());
    }

}
