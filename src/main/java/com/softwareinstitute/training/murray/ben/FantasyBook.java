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

    @Override
    public String fictionStory() {
        return "A fantasy is fictional.";
    }

    @Override
    public String toString() {
        return "Class: Book-Fantasy" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nCoverType: " + getCoverType() + "\nNumber of pages: " + getPages();
    }

}
