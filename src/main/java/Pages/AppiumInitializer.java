package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumInitializer {
public AppiumDriver driver;
    public static AppiumDriver initializeDriver(String platform) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");

        switch (platform.toLowerCase()) {
            case "ios":
                caps.setCapability("platformName", "iOS");
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("deviceName", "iPhone 15");
                caps.setCapability("platformVersion", "17.0");
                // Add other iOS capabilities as needed
                return new IOSDriver(appiumServerURL, caps);

            case "android":

                caps.setCapability("appium:platformName", "Android");
                caps.setCapability("appium:deviceName", "R8YXB0D907H-dVOf6M");
                caps.setCapability("appium:platformVersion", "14");
                caps.setCapability("appium:app", "C:\\Users\\Production\\Downloads\\Tamawal (2).apk");
                caps.setCapability("appium:automationName", "UiAutomator2");
                caps.setCapability("appium:appPackage", "sa.tamawal.capp");
                caps.setCapability("appium:appActivity", "sa.tamawal.capp.MainActivity");
                // Add other Android capabilities as needed
                return new AndroidDriver(appiumServerURL, caps);

            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}