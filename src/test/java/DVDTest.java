import com.softwareinstitute.training.murray.ben.AnimationDVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 4);

    @Test
    public void  testBookStoryMedium() {
        assertEquals("This DVDs medium is not correct.", "You watch it.", myAnimationDVD.getStoryMedium());
    }
}
