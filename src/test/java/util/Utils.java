package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;

    public Utils(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        this.wait = DriverManager.getWait();
    }

    public void waitAndClick(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).click();
    }

    public void waitAndClickByTextContains(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\""+text+"\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).click();
    }

    public MobileElement getElementByPartialText(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\""+text+"\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    public void scrollUntilTheEnd(){
        int maxTries = 10;
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).flingToEnd("+maxTries+")"));
    }
}
