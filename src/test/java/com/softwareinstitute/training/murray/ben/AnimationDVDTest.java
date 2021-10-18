package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.AnimationDVD;
import com.softwareinstitute.training.murray.ben.Book;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimationDVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 4);

    @Test
    public void testAnimationDVDItemTitleMethod() {
        assertEquals("This animation DVD is not A", "A", myAnimationDVD.getItemTitle());
    }

    @Test
    public void testAnimationDVDWriterNameMethod() {
        assertEquals("This animation DVD is not by B.", "B", myAnimationDVD.getWriterName());
    }

    @Test
    public void testAnimationDVDQualityMethod() {
        assertEquals("This animation DVD is not C", "C", myAnimationDVD.getQuality());
    }

    @Test
    public void testAnimationDVDRuntimeMethod() {
        assertEquals("This animation DVD is not 4 minutes.", 4, myAnimationDVD.getRuntime());
    }

    @Test
    public void testTestToString() {
        assertEquals("Wrong output.", "Class: DVD-Animation\nItem title: A\nWriter: B\nQuality: C\nRuntime: 4", myAnimationDVD.toString());
    }

    @Test
    public void testFictional() {
        assertEquals("Wrong output.", "An animation is fictional.", myAnimationDVD.fictionStory());
    }

}
