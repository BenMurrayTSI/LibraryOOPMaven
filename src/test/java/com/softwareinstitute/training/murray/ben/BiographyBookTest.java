package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.BiographyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BiographyBookTest {

    BiographyBook myBiographyBook = new BiographyBook("A", "B", "C", 4);

    @Test
    public void  testBiographyBookItemTitleMethod() {
        assertEquals("This biography book is not A", "A", myBiographyBook.getItemTitle());
    }

    @Test
    public void  testBiographyBookWriterNameMethod() {
        assertEquals("This biography book is not by B.", "B", myBiographyBook.getWriterName());
    }

    @Test
    public void  testBiographyBookCoverTypeMethod() {
        assertEquals("This biography book is not a C", "C", myBiographyBook.getCoverType());
    }

    @Test
    public void  testBiographyBookPagesMethod() {
        assertEquals("This biography book is not 4 pages.", 4, myBiographyBook.getPages());
    }

    @Test
    public void  testBiographyBookGetSetting() {
        assertEquals("This biography book setting is not correct.", "Setting is the real world.", myBiographyBook.getSetting());
    }

    @Test
    public void  testBiographyBookGetTellStory() {
        assertEquals("This biography book story description is not correct.", "Tells story of a real person.", myBiographyBook.getTellStory());
    }

    @Test
    public void testTestToString() {
        assertEquals("Wrong output.", "Class: Book-Biography\nItem title: A\nWriter: B\nCoverType: C\nNumber of pages: 4\nSetting is the real world.\nTells story of a real person.", myBiographyBook.toString());
    }

}
