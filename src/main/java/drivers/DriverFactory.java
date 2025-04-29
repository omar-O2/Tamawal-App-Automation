package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverFactory{
    public static AppiumDriver getNewInstance(String platform) throws MalformedURLException {
        //AppiumDriver driver;
        DesiredCapabilities caps = new DesiredCapabilities();
        String appiumServerURL = "http://127.0.0.1:4723/";
        String appPath = "/Users/mac/Desktop/ApplicationsFile/Runner 2.app";
        String appBundleId = "sa.tamawal.app";
        switch (platform.toLowerCase()) {
            case "android":
                caps.setCapability("appium:platformName", "Android"); // Platform name
                caps.setCapability("appium:deviceName", "R8YXB0D907H-dVOf6M"); // Device name (use `adb devices` to find)
                caps.setCapability("appium:platformVersion", "14"); // Android version
                caps.setCapability("appium:app", "C:\\Users\\Production\\Downloads\\Tamawal (2).apk"); // Path to your app
                caps.setCapability("appium:automationName", "UiAutomator2"); // Automation engine
                caps.setCapability("appium:appPackage", "sa.tamawal.capp"); // App package name
                caps.setCapability("appium:appActivity", "sa.tamawal.capp.MainActivity");
                //caps.setCapability("shouldTerminateApp",true);
                return new AndroidDriver(new URL(appiumServerURL), caps);
            case "iOS":
                // Set desired capabilities for iOS
                caps.setCapability("appium : platformName", "iOS");
                caps.setCapability("appium:platformVersion", "18.2"); // Replace with your iOS version
                caps.setCapability("appium:deviceName", "iPhone 15 Pro Max"); // Replace with your device name
                caps.setCapability("appium:app", appPath);
                caps.setCapability("appium:automationName", "XCUITest");
                caps.setCapability("appium:udid","B10EACBA-24CC-4BB6-B82B-7F4E24760578");
                caps.setCapability("appium:bundleId",appBundleId);
                return new IOSDriver(new URL(appiumServerURL), caps);
            default:
                // Set desired capabilities for iOS
                caps.setCapability("appium:platformName", "Android"); // Platform name
                caps.setCapability("appium:deviceName", "R8YXB0D907H-dVOf6M"); // Device name (use `adb devices` to find)
                caps.setCapability("appium:platformVersion", "14"); // Android version
                caps.setCapability("appium:app", "C:\\Users\\Production\\Downloads\\Tamawal (2).apk"); // Path to your app
                caps.setCapability("appium:automationName", "UiAutomator2"); // Automation engine
                caps.setCapability("appium:appPackage", "sa.tamawal.capp"); // App package name
                caps.setCapability("appium:appActivity", "sa.tamawal.capp.MainActivity");
                //caps.setCapability("shouldTerminateApp",true);
                return new IOSDriver(new URL(appiumServerURL), caps);
        }
    }
}