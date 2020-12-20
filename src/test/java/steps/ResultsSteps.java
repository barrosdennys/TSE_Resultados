package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import util.DriverManager;
import util.Utils;

public class ResultsSteps {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final Utils util = new Utils(driver);

    @Then("I should check that {string} is in the list of Vereadores voted")
    public void checkVereadoresList(String vereadorName) {
        util.scrollForwardUntilText(vereadorName);
        assert util.getElementByPartialText(vereadorName).isDisplayed();
        util.clickOnBackButton();
    }
}
