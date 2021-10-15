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
}
