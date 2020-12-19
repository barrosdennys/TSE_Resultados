package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class SelectStatePage {
    private final Utils util;

    public SelectStatePage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void selectState(String state) {
        util.getElementByPartialText("Escolher local").click();
        util.getElementByPartialText("Selecione o estado").click();
        util.getElementByPartialText(state).click();
        util.getButtonWithPartialText("Confirmar").click();
    }

    public void selectCity(String city) {
        util.getElementByPartialText("Selecione o município").click();
        util.getElementByPartialText(city).click();
        util.getButtonWithPartialText("Confirmar").click();
        util.getButtonWithPartialText("Confirmar").click();

    }
}
