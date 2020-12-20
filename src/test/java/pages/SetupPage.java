package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.DriverManager;
import util.Utils;

public class SetupPage {
    private final Utils util;

    public SetupPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void completeSetup() {
        util.getButtonWithPartialText("Próximo").click();
        util.getButtonWithPartialText("Entendi").click();
        util.waitUntilElementWithPartialTextIsDisplayed("Termos de uso");
        util.scrollUntilTheEnd();
        util.getButtonWithPartialText("Li").click();
    }
}

