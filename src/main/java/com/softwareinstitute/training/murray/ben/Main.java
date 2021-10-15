package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        System.out.println();

        LibraryItem defaultFantasyBook = new FantasyBook();
        LibraryItem defaultBiographyBook = new BiographyBook();
        LibraryItem defaultDocumentaryDVD = new DocumentaryDVD();
        LibraryItem defaultAnimationDVD = new AnimationDVD();
        LibraryItem myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);
        LibraryItem myDocumentaryDVD = new DocumentaryDVD("A", "B", "C", 4);

        items.add(defaultFantasyBook);
        items.add(defaultBiographyBook);
        items.add(defaultDocumentaryDVD);
        items.add(defaultAnimationDVD);
        items.add(myFantasyBook);
        items.add(myDocumentaryDVD);

        for (LibraryItem i:items) {
            System.out.println("\n" + i);
        }

        System.out.println();
        System.out.println();
        Library allLibrary = new Library(items);

        System.out.println(allLibrary);


    }

}
