package Utilities;


import Pages.AppiumInitializer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility {



    public static void Click_On_Element(AppiumDriver driver, By locator){


        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }




    public static void Send_Data(AppiumDriver driver, By locator, String Text){


        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(Text);
    }
    public static void Scroll_Down(AppiumDriver driver) {


            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setMaxSearchSwipes(10)" +
                            ".scrollIntoView(new UiSelector().textContains(\"Congratulations!\"))"));
        }





    public static void scrollToText(AppiumDriver driver, String targetText) {
        String scrollCommand =
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().descriptionContains(\"" + targetText + "\"))";

        driver.findElement(AppiumBy.androidUIAutomator(scrollCommand));
    }
    public class AppiumTest {

        public static void main(String[] args) {
            AppiumDriver iosDriver = null;
            AppiumDriver androidDriver = null;

            try {
                // Initialize iOS driver
                iosDriver = AppiumInitializer.initializeDriver("ios");
                System.out.println("iOS driver initialized successfully");

                // Initialize Android driver
                androidDriver = AppiumInitializer.initializeDriver("android");
                System.out.println("Android driver initialized successfully");

                // Your test code here...

            } catch (Exception e) {
                System.err.println("Driver initialization failed: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // Quit drivers when done
                if (iosDriver != null) {
                    iosDriver.quit();
                }
                if (androidDriver != null) {
                    androidDriver.quit();
                }
            }
        }
    }
    public static void Return_To_Previous_App(AppiumDriver driver, String appPackage) {
        try {
            // Cast the driver to AndroidDriver (if using Android)
            if (driver instanceof AndroidDriver) {
                AndroidDriver androidDriver = (AndroidDriver) driver;
                androidDriver.activateApp(appPackage); // Activate the previous app
                System.out.println("Returned to the previous app: " + appPackage);
            } else {
                System.out.println("This method is only supported for Android.");
            }
        } catch (Exception e) {
            System.out.println("Failed to return to the previous app: " + e.getMessage());
        }

    }

}
