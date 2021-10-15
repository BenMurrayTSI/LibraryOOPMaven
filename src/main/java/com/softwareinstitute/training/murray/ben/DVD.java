package com.softwareinstitute.training.murray.ben;

public abstract class DVD extends LibraryItem {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private int runtime;
    private String quality;

    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public DVD(String itemTitle, String writerName, String quality, int runtime) {
        super(itemTitle, writerName);
        this.quality = quality;
        this.runtime = runtime;
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void storyMedium() {
        System.out.println("You watch it.");
    }

    public String getStoryMedium() {
        return "You watch it.";
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int length) {
        this.runtime = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
