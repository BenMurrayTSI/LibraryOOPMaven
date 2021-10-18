import com.softwareinstitute.training.murray.ben.AnimationDVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimationDVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 4);

    @Test
    public void  testAnimationDVDItemTitleMethod() {
        assertEquals("This animation DVD is not A", "A", myAnimationDVD.getItemTitle());
    }

    @Test
    public void  testAnimationDVDWriterNameMethod() {
        assertEquals("This animation DVD is not by B.", "B", myAnimationDVD.getWriterName());
    }

    @Test
    public void  testAnimationDVDQualityMethod() {
        assertEquals("This animation DVD is not C", "C", myAnimationDVD.getQuality());
    }

    @Test
    public void  testAnimationDVDRuntimeMethod() {
        assertEquals("This animation DVD is not 4 minutes.", 4, myAnimationDVD.getRuntime());
    }

    @Test
    public void  testAnimationDVDSetting() {
        assertEquals("This animation DVD setting is not correct.", "Setting could be anything.", myAnimationDVD.getSetting());
    }

    @Test
    public void  testAnimationDVDTellsStory() {
        assertEquals("This animation DVD story description is not correct.", "Tells story with animated characters.", myAnimationDVD.getTellStory());
    }
}
