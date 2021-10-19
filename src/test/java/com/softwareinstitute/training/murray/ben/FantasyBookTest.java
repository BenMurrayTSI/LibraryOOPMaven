package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.FantasyBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyBookTest {

    FantasyBook myFantasyBook = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);

    @Test
    public void testTestToString() {
        assertEquals("Wrong output.", "Class: Book-Fantasy\nItem title: Two Towers\nWriter: Tolkien\nCoverType: Paperback\nNumber of pages: 352\nTells a fictional story.", myFantasyBook.toString());
    }
}
