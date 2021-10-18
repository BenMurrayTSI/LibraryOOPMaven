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


    @Override
    public String nonFictionStory(){
        return "Tells a non-fictional story.";
    }

    @Override
    public String toString() {
        return "Class: Book-Biography" + "\nItem title: " + getItemTitle() + "\nWriter: " + getWriterName() + "\nCoverType: " + getCoverType() + "\nNumber of pages: " + getPages() + "\n" + nonFictionStory();
    }

}
