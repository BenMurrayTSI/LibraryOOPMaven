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
    public void testTestToString() {
        assertEquals("Wrong output.", "Class: Book-Biography\nItem title: A\nWriter: B\nCoverType: C\nNumber of pages: 4\nTells a non-fictional story.", myBiographyBook.toString());
    }

    @Test
    public void testNonFictional() {
        assertEquals("Wrong output.", "Tells a non-fictional story.", myBiographyBook.nonFictionStory());
    }

}
