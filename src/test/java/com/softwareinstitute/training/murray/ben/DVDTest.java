package com.softwareinstitute.training.murray.ben;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {

    DocumentaryDVD myDocumentaryDVD = new DocumentaryDVD("A", "B", "F", 5);


    @Test
    public void  testBookSetQuality() {
        myDocumentaryDVD.setQuality("C");
        assertEquals("Quality is incorrect.", "C", myDocumentaryDVD.getQuality());
    }

    @Test
    public void  testBookSetRuntime() {
        myDocumentaryDVD.setRuntime(4);
        assertEquals("Book cover is incorrect.", 4, myDocumentaryDVD.getRuntime());
    }
}
