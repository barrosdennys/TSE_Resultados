package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import util.Utils;

public class SetupPage {

    private final Utils util;
    private final By nextButton = By.className("android.widget.Button");

    public SetupPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void completeSetup() {
        util.waitAndClick(nextButton);
        util.waitAndClick(nextButton);
        util.scrollUntilTheEnd();
        util.waitAndClick(nextButton);
    }


}

