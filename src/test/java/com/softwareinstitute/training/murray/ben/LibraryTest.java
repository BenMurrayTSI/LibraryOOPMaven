package com.softwareinstitute.training.murray.ben;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void testGetItems() {
        Library allContents;
        allContents = new Library();
        List<LibraryItem> list = allContents.getItems();

        assertTrue(allContents instanceof Library);
    }
}
