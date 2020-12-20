package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FAQPage;
import pages.MainPage;
import util.DriverManager;
import util.Utils;


public class FAQSteps {

    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final MainPage mainPage = new MainPage(driver);
    private final Utils util = new Utils(driver);
    private final FAQPage faqPage = new FAQPage(driver);

    @Given("I select the tab Informações")
    public void iSelectTab() {
        mainPage.selectInformationTab();
    }

    @And("I click on {string} option")
    public void iClickOnOption(String faqString) {
        faqPage.clickOnFAQButton(faqString);
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        assert util.getElementByPartialText(message).isDisplayed();
        util.clickOnBackButton();
    }
}

