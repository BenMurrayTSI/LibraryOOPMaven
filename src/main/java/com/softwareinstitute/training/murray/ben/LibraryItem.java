package com.softwareinstitute.training.murray.ben;

public abstract class LibraryItem {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private String itemTitle;
    private String writerName;

/////////////////////////////////////////Constructors///////////////////////////////////////////

    protected LibraryItem(String itemTitle, String writerName){
        this.itemTitle = itemTitle;
        this.writerName = writerName;
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

}
