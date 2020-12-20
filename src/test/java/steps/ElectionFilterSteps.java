package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElectionFilterPage;
import pages.MainPage;
import util.DriverManager;
import util.Utils;

import io.cucumber.java.en.Given;

public class ElectionFilterSteps {

    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final MainPage mainPage = new MainPage(driver);
    private final Utils util = new Utils(driver);
    private final ElectionFilterPage electionFilterPage = new ElectionFilterPage(driver);


    @Given("I select {string}")
    public void iSelect(String electionButton) {
        electionFilterPage.selectElectionFilter(electionButton);
    }

    @And("I select {string} in UF option")
    public void iSelectInUFOption(String ufList) {

        electionFilterPage.clickOnUFList(ufList);
    }

    @And("I select {string} state")
    public void iSelectState(String state) {
        electionFilterPage.selectUF(state);
    }

    @And("I click {string} button")
    public void iClickButton(String firstLeg) throws InterruptedException {
        electionFilterPage.selectFirstLeg(firstLeg);
    }

    @And("I select {string} button")
    public void iSelectButton(String vereador) {
        electionFilterPage.selectVereador(vereador);
    }

    @Then("I should check that {string} is the most voted Vereador in Macapa")
    public void MostVotedVereadorInMacapa(String string) {
        electionFilterPage.verifyMostVoted(string);
    }


    @And("I select {string} candidate")
    public void iSelectCandidate(String string) {
        electionFilterPage.selectFirstCandidate(string);
    }

    @And("I select {string} option")
    public void iSelectOption(String string) {
        electionFilterPage.selectFavoritarCandidato(string);
    }

    @When("I select the favorite page")
    public void iSelectTheFavoritePage() {
        electionFilterPage.selectFavoritoTab();
    }

    @Then("I should see {string} candidate")
    public void iShouldSeeCandidate(String name) {
        assert util.getElementByPartialText(name).isDisplayed();
    }



}