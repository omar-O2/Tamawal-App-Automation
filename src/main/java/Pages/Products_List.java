package Pages;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;

public class Products_List {
    public AppiumDriver driver;
    private final By Home_Page_Icon = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Products_List_Locators", "Home_Page_Icon"));
    private final By Close_Compare_Tour_Guide_Icon = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Products_List_Locators", "Close_Compare_Tour_Guide_Icon"));


    public Products_List(AppiumDriver driver) throws FileNotFoundException {

        this.driver = driver;
    }

    public Products_List Press_On_Home_Page_Icon() {
        Utility.Click_On_Element(driver, Home_Page_Icon);
        return this;

    }



    public Products_List Press_On_Close_Compare_Tour_Guide_Icon() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(Close_Compare_Tour_Guide_Icon));

            if (driver.findElement(Close_Compare_Tour_Guide_Icon).isDisplayed()) {
                Utility.Click_On_Element(driver, Close_Compare_Tour_Guide_Icon);
                Utility.Click_On_Element(driver,Home_Page_Icon);
            }
        } catch (TimeoutException | NoSuchElementException e) {
            // Element not found within timeout, click home icon
            Utility.Click_On_Element(driver, Home_Page_Icon);
        }
        return this;
    }
}
