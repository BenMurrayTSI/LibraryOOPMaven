package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibraryItem> items = new ArrayList<>();

    LibraryItem defaultFantasyBook = new FantasyBook();
    LibraryItem defaultBiographyBook = new BiographyBook();
    LibraryItem defaultDocumentaryDVD = new DocumentaryDVD();
    LibraryItem defaultAnimationDVD = new AnimationDVD();
    LibraryItem myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);
    LibraryItem myDocumentaryDVD = new DocumentaryDVD("A", "B", "C", 4);

    {
        items.add(defaultFantasyBook);
        items.add(defaultBiographyBook);
        items.add(defaultDocumentaryDVD);
        items.add(defaultAnimationDVD);
        items.add(myFantasyBook);
        items.add(myDocumentaryDVD);
    }

    public List<LibraryItem> getItems() {
        return items;
    }

}
