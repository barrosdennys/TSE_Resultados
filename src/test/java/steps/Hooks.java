package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import pages.SetupPage;
import util.DriverManager;

public class Hooks {

    private final static AppiumDriver<MobileElement> driver = DriverManager.getDriver();
    private final static SetupPage setupPage = new SetupPage(driver);

    @Before("@skipMenu")
    public void completeMenu() {
        setupPage.completeSetup();
    }


}
