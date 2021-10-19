package com.softwareinstitute.training.murray.ben.cucumber;


import com.softwareinstitute.training.murray.ben.FantasyBook;
import com.softwareinstitute.training.murray.ben.LibraryItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

class Check {
    static String check(String title) {
        return "Two Towers".equals(title) ? "Yes" : "No";
    }
}

public class FantasyBookTitleTest {
    private String itemTitle;
    private String actualAnswer;

    LibraryItem myFantasyBook = new FantasyBook("", "Tolkien", "Paperback", 352);

    @Given("Title is {string}")
    public void title_is_Two_Towers(String title) {
        itemTitle = title;
        myFantasyBook.setItemTitle(itemTitle);
    }

    @When("I ask if title is Two Towers")
    public void i_ask_if_title_is_Two_Towers() {
        actualAnswer = Check.check(myFantasyBook.getItemTitle());
    }

    @Then("I should be told {string}")
    public void i_should_be_told_title_is(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}