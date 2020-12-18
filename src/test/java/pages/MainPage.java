package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class MainPage {
    private final Utils util;

    public MainPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public MobileElement getResultadosButton() {
        return util.getElementByPartialText("Resultados");
    }
}
