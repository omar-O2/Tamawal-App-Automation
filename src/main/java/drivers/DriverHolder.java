package drivers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class DriverHolder {
    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(AppiumDriver driver) {
        DriverHolder.driver.set(driver);
    }
}