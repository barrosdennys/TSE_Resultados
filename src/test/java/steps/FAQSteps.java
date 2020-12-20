package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.FAQPage;
import pages.MainPage;
import util.DriverManager;

public class FAQSteps {

    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final MainPage mainPage = new MainPage(driver);
    private final FAQPage faqPage = new FAQPage(driver);

    @Given("I select the tab Informações")
    public void selectInformationTab() {
        mainPage.selectInformationTab();
    }

    @And("I click on {string} option")
    public void clickOnFAQButton(String faqString) {
        faqPage.clickOnFAQButton(faqString);
    }
}

