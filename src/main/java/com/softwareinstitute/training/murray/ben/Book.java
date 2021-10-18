package com.softwareinstitute.training.murray.ben;

public abstract class Book extends LibraryItem {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private int pages;
    private String coverType ;

    /////////////////////////////////////////Constructors///////////////////////////////////////////

    protected Book(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName);
        this.coverType = coverType;
        this.pages = pages;
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
}
