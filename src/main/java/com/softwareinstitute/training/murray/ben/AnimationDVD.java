package com.softwareinstitute.training.murray.ben;

public class AnimationDVD extends DVD implements TellsFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public AnimationDVD() {
        this("Animation_DVD_Title");
    }

    public AnimationDVD(String itemTitle) {
        this(itemTitle, "Jane Doe");
    }

    public AnimationDVD(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public AnimationDVD(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 90);
    }

    public AnimationDVD(String itemTitle, String writerName, String quality, int runtime) {
        super(itemTitle, writerName, quality, runtime);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    @Override
    public String fictionStory() {
        return "Tells a fictional story.";
    }

    @Override
    public String toString() {
        return "Class: DVD-Animation" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nQuality: " + getQuality() + "\nRuntime: " + getRuntime() + "\n" + fictionStory();
    }

}
