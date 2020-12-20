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

    public Utils(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = DriverManager.getWait();
    }

    public void waitUntilElementWithPartialTextIsDisplayed(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public MobileElement getElementByResourceId(String resourceId) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"" + resourceId + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    public MobileElement getButtonWithPartialText(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")" +
                ".className(\"android.widget.Button\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    public MobileElement getElementByPartialText(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    public void scrollUntilTheEnd() {
        int maxTries = 20;
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).flingToEnd(" + maxTries + ")"));
    }

    public void scrollUntilTheTop() {
        int maxTries = 5;
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).flingToBeginning(" + maxTries + ")"));
    }

    public void scrollUntilText(String text) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+text+"\").className(\"android.view.View\"))"));

        }


}
