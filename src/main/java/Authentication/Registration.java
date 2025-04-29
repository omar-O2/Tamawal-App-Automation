package Authentication;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Registration {
    public AppiumDriver driver;
    private final By Continue_Button = By.xpath(Json_Data.Get_json_Data("Login_Locators"
            , "Continue_Button"));
    private final By Allow_Location = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Allow_Location"));
    private final By Skip_Button = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    private final By Join_Button = By.xpath("//android.widget.Button[@content-desc=\"Join\"]");
    private final By National_ID_Field = By.xpath("//android.widget.EditText");
    private final By Continue_Button_Login = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
    private final By Mobile_Number_Field = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.EditText[2]");
    private final By Title = By.xpath("//android.view.View[@content-desc=\"Log in or Sign up\"]");

    public Registration(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }

    public Registration Press_Continue_Button() {

        Utility.Click_On_Element(driver, Continue_Button);
        return this;
    }

    public Registration Press_Allow_Location() {

        Utility.Click_On_Element(driver, Allow_Location);
        return this;
    }

    public Registration Press_Skip_Button() {

        Utility.Click_On_Element(driver, Skip_Button);
        return this;
    }

    public Registration Press_Join_Button() {

        Utility.Click_On_Element(driver, Join_Button);
        return this;

    }

    public Registration Press_On_NationalID() {
        Utility.Click_On_Element(driver, National_ID_Field);

        return this;
    }

    public Registration Enter_NationalID(String NationalIDText) {
        Utility.Send_Data(driver, National_ID_Field, NationalIDText);
        return this;

    }

    public Registration Press_On_Title() {
        Utility.Click_On_Element(driver, Title);

        return this;
    }

    public Registration Press_On_Mobile_Number_Field() {
        Utility.Click_On_Element(driver, Mobile_Number_Field);
        return this;
    }

    public void Enter_Mobile_Number(String Mobile_Number) {
       Utility.Send_Data(driver, Mobile_Number_Field, Mobile_Number);

    }




}