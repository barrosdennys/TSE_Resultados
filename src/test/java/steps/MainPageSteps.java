package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import util.DriverManager;
import util.Utils;

public class MainPageSteps {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final MainPage mainPage = new MainPage(driver);
    private final Utils util = new Utils(driver);

    @Given("I click on {string}")
    public void selectOptionInMainPage(String option) {
        mainPage.clickOnMenuOption(option);
    }

    @When("I select the first leg of the election")
    public void selectFirstLeg() {
        mainPage.selectFirstLeg();
    }

    @Then("I should see the message {string}")
    public void validateMessage(String message) {
        assert util.getElementByPartialText(message).isDisplayed();
    }

    @And("I select {string} button")
    public void selectVereadorButton(String vereador) {
        mainPage.selectVereador(vereador);
    }

    @And("I select {string}")
    public void selectElectionButton(String electionButton) {
        mainPage.selectElectionFilter(electionButton);
    }

    @Given("I am on the tab Resultados")
    public void clickOnResultadosTab() throws InterruptedException {
        mainPage.selectResultadosTab();
    }
}
