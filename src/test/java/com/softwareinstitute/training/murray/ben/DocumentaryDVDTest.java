package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.DocumentaryDVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DocumentaryDVDTest {

    DocumentaryDVD myDocumentaryDVD = new DocumentaryDVD("A", "B", "C", 4);

    @Test
    public void  testDocumentaryDVDItemTitleMethod() {
        assertEquals("This documentary DVD is not A", "A", myDocumentaryDVD.getItemTitle());
    }

    @Test
    public void  testDocumentaryDVDWriterNameMethod() {
        assertEquals("This documentary DVD is not by B.", "B", myDocumentaryDVD.getWriterName());
    }

    @Test
    public void  testDocumentaryDVDQualityMethod() {
        assertEquals("This documentary DVD is not C", "C", myDocumentaryDVD.getQuality());
    }

    @Test
    public void  testDocumentaryDVDRuntimeMethod() {
        assertEquals("This documentary DVD is not 4 minutes.", 4, myDocumentaryDVD.getRuntime());
    }

    @Test
    public void  testDocumentaryDVDSetting() {
        assertEquals("This documentary DVD setting is not correct.", "Setting is the real world.", myDocumentaryDVD.getSetting());
    }

    @Test
    public void  testDocumentaryDVDTellsStory() {
        assertEquals("This documentary DVD story description is not correct.", "Tells story about real events.", myDocumentaryDVD.getTellStory());
    }

    @Test
    public void testSetting() {
    }

    @Test
    public void testTellStory() {
    }

    @Test
    public void testRealBeginning() {
    }

    @Test
    public void testRealMiddle() {
    }

    @Test
    public void testRealEnd() {
    }

    @Test
    public void testTestToString() {
    }
}