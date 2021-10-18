package com.softwareinstitute.training.murray.ben;

public abstract class DVD extends LibraryItem {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private int runtime;
    private String quality;

    /////////////////////////////////////////Constructors///////////////////////////////////////////

    protected DVD(String itemTitle, String writerName, String quality, int runtime) {
        super(itemTitle, writerName);
        this.quality = quality;
        this.runtime = runtime;
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

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
