package Authentication;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class OTP {
    public AppiumDriver driver;
    private final By OTP_Field= By.xpath(Json_Data.Get_json_Data("OTP_locators", "OTP_Field"));
    private final By Resend_Button= AppiumBy.accessibilityId(Json_Data.Get_json_Data("OTP_Locators", "Resend_Button"));













    public OTP (AppiumDriver driver) throws FileNotFoundException {

        this.driver = driver;
    }

    public OTP Press_On_OTP_Field(){
        Utility.Click_On_Element(driver,OTP_Field);
        return this;
    }

    public OTP Enter_OTP(){
        Utility.Send_Data(driver,OTP_Field,"1234");
        return this;
    }



}
