package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.Utils;

public class FAQPage {
    private final Utils util;

    public FAQPage(AppiumDriver<MobileElement> driver) {
        this.util = new Utils(driver);
    }

    public void clickOnFAQButton(String faqTitle) {
        util.getElementByPartialText(faqTitle).click();
    }

}