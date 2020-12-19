package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.When;
import pages.SelectStatePage;
import util.DriverManager;

public class SelectStateSteps {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final SelectStatePage selectStatePage = new SelectStatePage(driver);

    @When("I select the state {string}")
    public void selectState(String state) {
        selectStatePage.selectState(state);
    }

    @When("I select the city {string}")
    public void selectCity(String city) {
        selectStatePage.selectCity(city);
    }
}
