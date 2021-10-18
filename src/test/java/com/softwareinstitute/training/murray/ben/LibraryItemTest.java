package com.softwareinstitute.training.murray.ben;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryItemTest {

    AnimationDVD myAnimationDVD = new AnimationDVD("F", "Z", "C", 4);

    @Test
    public void testSetItemTitle() {
        myAnimationDVD.setItemTitle("A");
        assertEquals("This animation DVD is not A", "A", myAnimationDVD.getItemTitle());
    }

    @Test
    public void testSetWriterName() {
        myAnimationDVD.setWriterName("B");
        assertEquals("This animation DVD is not written by B", "B", myAnimationDVD.getWriterName());
    }

}
