import com.softwareinstitute.training.murray.ben.BiographyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    BiographyBook myBiographyBook = new BiographyBook("A", "B", "C", 4);

    @Test
    public void  testBookStoryMedium() {
        assertEquals("This books medium is not correct.", "You read it.", myBiographyBook.getStoryMedium());
    }

}
