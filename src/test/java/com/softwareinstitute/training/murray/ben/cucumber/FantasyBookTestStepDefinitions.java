package com.softwareinstitute.training.murray.ben.cucumber;


import com.softwareinstitute.training.murray.ben.FantasyBook;
import com.softwareinstitute.training.murray.ben.LibraryItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FantasyBookTestStepDefinitions {
    private String itemTitle;
    private String actualAnswer;

    LibraryItem myFantasyBook = new FantasyBook("", "", "", 0);

    @Given("fantasy book title is {string}")
    public void fantasyBookTitleIs(String title) {
        itemTitle = title;
        myFantasyBook.setItemTitle(itemTitle);
    }

    @When("I ask if fantasy book title is Two Towers")
    public void iAskIfFantasyBookTitleIsTwoTowers() {
        actualAnswer = Check.check("Two Towers", myFantasyBook.getItemTitle());
    }

    @Then("I should be told {string}, fantasy book title isn't Two Towers")
    public void iShouldBeToldFantasyBookTitleIsnTTwoTowers(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}