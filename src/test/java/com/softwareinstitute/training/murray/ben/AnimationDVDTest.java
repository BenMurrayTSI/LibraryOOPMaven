package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.AnimationDVD;
import com.softwareinstitute.training.murray.ben.Book;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimationDVDTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("A", "B", "C", 5);

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
    public void  testAnimationDVDGetSetting() {
        assertEquals("This animation DVD setting is not correct.", "Setting could be anything.", myAnimationDVD.getSetting());
    }

    @Test
    public void  testAnimationDVDGetTellStory() {
        assertEquals("This animation DVD story description is not correct.", "Tells story with animated characters.", myAnimationDVD.getTellStory());
    }

    @Test
    public void testTestToString() {
        assertEquals("Wrong output.", "Class: DVD-Animation\nItem title: A\nWriter: B\nQuality: C\nRuntime: 4\nYou watch it.\nSetting could be anything.\nTells story with animated characters.", myAnimationDVD.toString());
    }
}
