package com.softwareinstitute.training.murray.ben.cucumber;

import com.softwareinstitute.training.murray.ben.BiographyBook;
import com.softwareinstitute.training.murray.ben.LibraryItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BiographyBookTestStepDefinitions {

    private String itemTitle;
    private String actualAnswer;

    LibraryItem myBiographyBook = new BiographyBook("", "", "", 0);

    @Given("biography book title is {string}")
    public void biographyBookTitleIs(String title) {
        itemTitle = title;
        myBiographyBook.setItemTitle(itemTitle);

    }

    @When("I ask if biography book title is Becoming")
    public void iAskIfBiographyBookTitleIsBecoming() {
        actualAnswer = Check.check("Becoming", myBiographyBook.getItemTitle());
    }

    @Then("I should be told {string}, biography book title isn't Becoming")
    public void iShouldBeToldBiographyBookTitleIsnTBecoming(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
