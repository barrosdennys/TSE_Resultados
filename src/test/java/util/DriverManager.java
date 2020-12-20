package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    protected static AppiumDriver<MobileElement> driver;
    protected static WebDriverWait wait;

    public static AppiumDriver<MobileElement> getDriver() {

        if (driver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 28");
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "9.0");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, Constants.APK_PATH);
            //User to auto grant permissions to the apk
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");

            try {
                driver = new AndroidDriver<>(new URL(Constants.APPIUM_URL_SERVER), desiredCapabilities);
            } catch (MalformedURLException exception) {
                exception.printStackTrace();
            }

        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Constants.DEFAULT_TIMEOUT);
        }
        return wait;
    }
}
