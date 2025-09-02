package Order_Flow;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Checkout{
public AppiumDriver driver;

private final By Confirmation_Checkbox = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Checkout_Locators","Confirmation_Checkbox"));
    private final By Pay_Now_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Checkout_Locators","Pay_Now_Button"));
    private final By Pay_With_Credit = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Checkout_Locators", "Pay_With_Credit"));















public Checkout (AppiumDriver driver) throws FileNotFoundException {
    this.driver = driver;
}

public Checkout Press_On_Confirmation_Checkbox(){
    Utility.Click_On_Element(driver,Confirmation_Checkbox);
    return this;
}

    public Checkout Press_On_Pay_Now_Button() {
        Utility.Click_On_Element(driver, Pay_Now_Button);
        return this;
    }
    public Payment Press_Pay_With_Credit() throws FileNotFoundException {
        Utility.Click_On_Element(driver, Pay_With_Credit);
        return new Payment(driver);

    }
}
