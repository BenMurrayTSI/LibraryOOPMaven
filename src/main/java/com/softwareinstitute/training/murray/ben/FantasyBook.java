package com.softwareinstitute.training.murray.ben;

public class FantasyBook extends Book implements TellsFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public FantasyBook() {
        this("Fantasy_Book_Title");
    }

    public FantasyBook(String itemTitle) {
        this(itemTitle, "John Doe");
    }

    public FantasyBook(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Paperback");
    }

    public FantasyBook(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 400);
    }

    public FantasyBook(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }




    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting is goblins and stuff.");
    }

    public void tellStory() {
        System.out.println("Tells story with magic.");
    }

    public String getSetting() {
        return "Setting is goblins and stuff.";
    }

    public String getTellStory() {
        return "Tells story with magic.";
    }

    @Override
    public void beginning() {
        //beginning
    }

    @Override
    public void middle() {
        //middle
    }

    @Override
    public void end() {
        //end
    }

    @Override
    public String toString() {
        return "Class: Book-Fantasy" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nCoverType: " + getCoverType() + "\nNumber of pages: " + getPages() + "\n" + getStoryMedium() + "\n" + getSetting() + "\n" + getTellStory();
    }

}
