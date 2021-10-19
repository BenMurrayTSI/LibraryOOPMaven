package com.softwareinstitute.training.murray.ben;


import com.softwareinstitute.training.murray.ben.FantasyBook;
import com.softwareinstitute.training.murray.ben.LibraryItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private String itemTitle;
    private String actualItemTitle;

    LibraryItem myFantasyBook = new FantasyBook("", "Tolkien", "Paperback", 352);

    @Given("Title is Two Towers")
    public void title_is_Two_Towers() {
        itemTitle = "Two Towers";
        myFantasyBook.setItemTitle(itemTitle);
    }

    @When("I ask if title is Two Towers")
    public void i_ask_if_title_is_Two_Towers() {
        actualItemTitle = myFantasyBook.getItemTitle();
    }

    @Then("I should be told title is {string}")
    public void i_should_be_told_title_is(String expectedItemTitle) {
        assertEquals(expectedItemTitle, actualItemTitle);
    }

}
