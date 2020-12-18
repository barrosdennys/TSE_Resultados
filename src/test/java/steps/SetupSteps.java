package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.SetupPage;
import util.DriverManager;

public class SetupSteps {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final SetupPage setupPage = new SetupPage(driver);
    private final MainPage mainPage = new MainPage(driver);

    @When("I complete the setup")
    public void complete_setup() {
        setupPage.completeSetup();
    }

    @Then("I reach the home page")
    public void reach_home_page() throws InterruptedException {
        assert mainPage.getResultadosButton().isDisplayed();
    }
}
