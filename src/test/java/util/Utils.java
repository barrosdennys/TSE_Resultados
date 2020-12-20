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

    /**
     * Waits for a element with a given text to be displayed
     *
     * @param text text of the element to be displayed
     */
    public void waitUntilElementWithPartialTextIsDisplayed(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    /**
     * Returns the element by a given resourceId
     *
     * @param resourceId resourceId of the element
     */
    public MobileElement getElementByResourceId(String resourceId) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"" + resourceId + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    /**
     * Returns the element with the class Android.widget.Button
     * but with a given text present in the button
     *
     * @param text text of the button element
     */
    public MobileElement getButtonWithPartialText(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")" +
                ".className(\"android.widget.Button\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    /**
     * Returns the element with a given text
     *
     * @param text text of the element
     */
    public MobileElement getElementByPartialText(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element);
    }

    /**
     * scrolls until the end of the screen with maxTries of 20
     */
    public void scrollUntilTheEnd() {
        int maxTries = 20;
        By scrollElement = MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).flingToEnd(" + maxTries + ")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(scrollElement));
        driver.findElement(scrollElement);
    }

    /**
     * scrolls until the top of the screen with maxTries of 20
     */
    public void scrollUntilTheTop() {
        int maxTries = 20;
        By scrollElement = MobileBy.AndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true)).flingToBeginning(" + maxTries + ")");
        wait.until(ExpectedConditions.visibilityOfElementLocated(scrollElement));
        driver.findElement(scrollElement);
    }

    /**
     * Checks if a element is present on the screen. Returns true if exists. false if not.
     *
     * @param text text of the element to be checked
     */
    public boolean isElementPresent(String text) {
        By element = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")");
        return driver.findElements(element).size() != 0;
    }

    /**
     * scrolls forward once
     */
    public void scrollForward() {
        By element = MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()");
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element);
    }

    /**
     * Scrolls forward until find an element with a given text
     *
     * @param text text of the element to be checked
     */
    public void scrollForwardUntilText(String text) {
        while (!isElementPresent(text)) {
            scrollForward();
        }
        scrollForward();
    }

    public void clickOnBackButton() {
        String backButton = "back";
        getButtonWithPartialText(backButton).click();
    }
}
