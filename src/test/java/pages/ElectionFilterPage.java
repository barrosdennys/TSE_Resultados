package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.DriverManager;
import util.Utils;

public class ElectionFilterPage {

    private final Utils util;

    public ElectionFilterPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void clickOnUFList(String ufList) {
        util.scrollUntilTheTop();
        util.getElementByPartialText(ufList).click();
    }

    public void selectUF(String state) {
        util.getElementByPartialText(state).click();
        util.getButtonWithPartialText("OK").click();
    }

    public void selectFirstLeg(String firstLeg) {
        util.getButtonWithPartialText(firstLeg).click();
    }

    public void selectFirstCandidate(String text) {
        util.getButtonWithPartialText(text).click();
    }

    public void selectFavoritarCandidato(String text) {
        util.getButtonWithPartialText(text).click();
        util.getButtonWithPartialText("Fechar").click();
    }
}

