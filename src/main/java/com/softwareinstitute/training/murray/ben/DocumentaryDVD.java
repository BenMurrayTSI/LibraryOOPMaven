package com.softwareinstitute.training.murray.ben;

public class DocumentaryDVD extends DVD implements TellsNonFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public DocumentaryDVD() {
        this("Documentary_DVD_Title");
    }

    public DocumentaryDVD(String itemTitle) {
        this(itemTitle, "Jane Doe");
    }

    public DocumentaryDVD(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public DocumentaryDVD(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 110);
    }

    public DocumentaryDVD(String itemTitle, String writerName, String quality, int runtime) {
        super(itemTitle, writerName, quality, runtime);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    @Override
    public String nonFictionStory(){
        return "Tells a non-fictional story.";
    }

    @Override
    public String toString() {
        return "Class: DVD-Documentary" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nQuality: " + getQuality() + "\nRuntime: " + getRuntime() + "\n" + nonFictionStory();
    }

}
