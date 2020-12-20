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
    private final Utils util = new Utils(driver);
    private final ElectionFilterPage electionFilterPage = new ElectionFilterPage(driver);

    @And("I select {string} in UF option")
    public void selectUFOption(String ufList) {
        electionFilterPage.clickOnUFList(ufList);
    }

    @And("I select {string} state")
    public void selectUFState(String state) {
        electionFilterPage.selectUF(state);
    }

    @And("I click {string} button")
    public void clickOnFirstLeg(String firstLeg) throws InterruptedException {
        electionFilterPage.selectFirstLeg(firstLeg);
    }

    @Given("I select {string} candidate")
    public void selectCandidate(String string) throws InterruptedException {
        util.scrollUntilTheTop();
        Thread.sleep(3000);
        electionFilterPage.selectFirstCandidate(string);
    }

    @And("I select {string} option")
    public void selectFavoriteOption(String string) {
        electionFilterPage.selectFavoritarCandidato(string);
    }

    @When("I select the favorite page")
    public void selectFavoriteTab() {
        electionFilterPage.selectFavoritoTab();
    }

    @Then("I should see {string} candidate")
    public void validateCandidateIsDisplayed(String name) throws InterruptedException {
        Thread.sleep(2000);
        assert util.getElementByPartialText(name).isDisplayed();
    }



}