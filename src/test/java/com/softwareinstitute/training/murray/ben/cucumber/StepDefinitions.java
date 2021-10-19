package com.softwareinstitute.training.murray.ben.cucumber;

import com.softwareinstitute.training.murray.ben.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    FantasyBook myFantasyBook = new FantasyBook("", "", "", 0);
    BiographyBook myBiographyBook = new BiographyBook("", "", "", 0);
    DocumentaryDVD myDocumentaryDVD = new DocumentaryDVD("", "", "", 0);
    AnimationDVD myAnimationDVD = new AnimationDVD("", "", "", 0);

    private String actualAnswer;
    private String itemTitle;
    private String writerName;
    private String coverType;
    private int pages;
    private String quality;
    private int runtime;

    @Given("title is {string}")
    public void titleIs(String title) {
        itemTitle = title;
    }

    @Given("writer is {string}")
    public void writerIs(String writer) {
        writerName = writer;
    }

    @Given("cover type is {string}")
    public void coverTypeIs(String cover) {
        coverType = cover;
    }

    @Given("number of pages is {int}")
    public void numberOfPagesIs(int numOfPages) {
        pages = numOfPages;
    }


    @When("I ask if title is Two Towers")
    public void iAskIfTitleIsTwoTowers() {
        myFantasyBook.setItemTitle(itemTitle);
        actualAnswer = StringCheck.check("Two Towers", myFantasyBook.getItemTitle());
    }

    @When("I ask if writer is Tolkien")
    public void iAskIfWriterIsTolkien() {
        myFantasyBook.setWriterName(writerName);
        actualAnswer = StringCheck.check("Tolkien", myFantasyBook.getWriterName());
    }

    @When("I ask if cover is paperback")
    public void iAskIfCoverIsPaperback() {
        myFantasyBook.setCoverType(coverType);
        actualAnswer = StringCheck.check("paperback", myFantasyBook.getCoverType());
    }

    @When("I ask if number of pages is 352")
    public void iAskIfNumberOfPagesIs() {
        myFantasyBook.setPages(pages);
        actualAnswer = IntCheck.check(352, myFantasyBook.getPages());
    }


    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }



}
