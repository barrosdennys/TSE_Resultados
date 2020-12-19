package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class MainPage {
    private final Utils util;
    private String firstLegResourceId = "alert-input-5-0";

    public MainPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void clickOnMenuOption(String option) {
        util.getElementByPartialText(option).click();
    }

    public void selectFirstLeg() {
        util.getButtonWithPartialText("TURNO").click();
        util.getElementByResourceId(firstLegResourceId).click();
        util.getButtonWithPartialText("CONFIRMAR").click();
    }
}
