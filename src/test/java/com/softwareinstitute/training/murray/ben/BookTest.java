package com.softwareinstitute.training.murray.ben;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    BiographyBook myBiographyBook = new BiographyBook("A", "B", "F", 5);

    @Test
    public void  testBookSetPages() {
        myBiographyBook.setPages(4);
        assertEquals("Number of pages is incorrect.", 4, myBiographyBook.getPages());
    }

    @Test
    public void  testBookSetCoverType() {
        myBiographyBook.setCoverType("C");
        assertEquals("Book cover is incorrect.", "C", myBiographyBook.getCoverType());
    }

}
