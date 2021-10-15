import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        System.out.println();

        LibraryItem defaultFantasyBook = new FantasyBook();
        LibraryItem defaultBiographyBook = new com.softwareinstitute.training.murray.ben.BiographyBook();
        LibraryItem defaultDocumentaryDVD = new com.softwareinstitute.training.murray.ben.DocumentaryDVD();
        LibraryItem defaultAnimationDVD = new AnimationDVD();
        LibraryItem myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);

        items.add(defaultFantasyBook);
        items.add(defaultBiographyBook);
        items.add(defaultDocumentaryDVD);
        items.add(defaultAnimationDVD);
        items.add(myFantasyBook);

        for (LibraryItem i:items) {
            System.out.println("\n" + i);
        }

        System.out.println();
        System.out.println();
        com.softwareinstitute.training.murray.ben.Library allLibrary = new com.softwareinstitute.training.murray.ben.Library(items);

        System.out.println(allLibrary);


    }

}
