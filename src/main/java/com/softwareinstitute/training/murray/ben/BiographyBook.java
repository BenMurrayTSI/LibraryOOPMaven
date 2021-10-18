package com.softwareinstitute.training.murray.ben;

public class BiographyBook extends Book implements TellsNonFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public BiographyBook() {
        this("Biography_Book_Title");
    }

    public BiographyBook(String itemTitle) {
        this(itemTitle, "John Doe");
    }

    public BiographyBook(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Hardcover");
    }

    public BiographyBook(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 600);
    }

    public BiographyBook(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting is the real world.");
    }

    public void tellStory() {
        System.out.println("Tells story of a real person.");
    }

    public String getSetting() {
        return "Setting is the real world.";
    }

    public String getTellStory() {
        return "Tells story of a real person.";
    }

    @Override
    public String nonFictionStory(){
        return "A biography is not fictional.";
    }

    @Override
    public String toString() {
        return "Class: Book-Biography" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nCoverType: " + getCoverType() + "\nNumber of pages: " + getPages() + "\n" + getSetting() + "\n" + getTellStory();
    }

}
