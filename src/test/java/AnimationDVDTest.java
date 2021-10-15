import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimationDVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 4);

    @Test
    public void  testAnimationDVDItemTitleMethod() {
        assertEquals("This documentary DVD is not A", "A", myAnimationDVD.getItemTitle());
    }

    @Test
    public void  testAnimationDVDWriterNameMethod() {
        assertEquals("This documentary DVD is not by B.", "B", myAnimationDVD.getWriterName());
    }

    @Test
    public void  testAnimationDVDQualityMethod() {
        assertEquals("This documentary DVD is not C", "C", myAnimationDVD.getQuality());
    }

    @Test
    public void  testAnimationDVDRuntimeMethod() {
        assertEquals("This documentary DVD is not 4 minutes.", 4, myAnimationDVD.getRuntime());
    }
}
