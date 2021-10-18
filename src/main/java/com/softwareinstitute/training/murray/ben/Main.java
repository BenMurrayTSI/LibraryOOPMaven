package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library allContents = new Library();
        List<LibraryItem> list = allContents.getItems();
        for (LibraryItem i:list) {
            System.out.println("\n" + i);
        }

        System.out.println();

    }

}
