package Pages;

import Order_Flow.Disclosures.Personal_Details;
import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Product_Details {
    public AppiumDriver driver;
    private final By Tamawal_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Product_Details_Locators", "Tamawal_Button"));







    public Product_Details(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }


    public Personal_Details Press_On_Tamawal_Button() throws FileNotFoundException {
        Utility.Click_On_Element(driver, Tamawal_Button);
        return new Personal_Details(driver);

    }



}
