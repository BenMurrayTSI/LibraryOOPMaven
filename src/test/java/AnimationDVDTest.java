import com.softwareinstitute.training.murray.ben.AnimationDVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimationDVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 4);

    @Test
    public void  testAnimationDVDItemTitleMethod() {
        assertEquals("This documentary com.softwareinstitute.training.murray.ben.DVD is not A", "A", myAnimationDVD.getItemTitle());
    }

    @Test
    public void  testAnimationDVDWriterNameMethod() {
        assertEquals("This documentary com.softwareinstitute.training.murray.ben.DVD is not by B.", "B", myAnimationDVD.getWriterName());
    }

    @Test
    public void  testAnimationDVDQualityMethod() {
        assertEquals("This documentary com.softwareinstitute.training.murray.ben.DVD is not C", "C", myAnimationDVD.getQuality());
    }

    @Test
    public void  testAnimationDVDRuntimeMethod() {
        assertEquals("This documentary com.softwareinstitute.training.murray.ben.DVD is not 4 minutes.", 4, myAnimationDVD.getRuntime());
    }
}
