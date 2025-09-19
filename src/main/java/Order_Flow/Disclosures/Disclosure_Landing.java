package Order_Flow.Disclosures;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Disclosure_Landing {
    public AppiumDriver driver;
    private final By Confirm_Data_Provided_Is_Accurate = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Confirm_Data_Provided_Is_Accurate"));
    private final By TAMAWAL_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "TAMAWAL_Button"));






    public Disclosure_Landing(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }



    public Disclosure_Landing Press_On_Confirm_Data_Provided_Is_Accurate() {
        Utility.Click_On_Element(driver, Confirm_Data_Provided_Is_Accurate);
        return this;

    }

    public Disclosure_Landing Press_On_TAMAWAL_Button() throws InterruptedException {
        Utility.Click_On_Element(driver, TAMAWAL_Button);
        return this;


    }



}
