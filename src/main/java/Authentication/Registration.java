package Authentication;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Registration {
    public AppiumDriver driver;
    private final By Continue_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators"
            ,"Continue_Button"));
    private final By Allow_Location = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Allow_Location"));
    private final By Skip_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators", "Skip_Button"));
    private final By Join_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators", "Join_Button"));
    private final By National_ID_Field = By.xpath(Json_Data.Get_json_Data("Login_Locators", "National_ID_Field"));
    private final By Mobile_Number_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators","Mobile_Number_Field"));
    private final By Mobile_Number_Field_After_Press = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Mobile_Number_Field_After_Press"));
    private final By Title_Login = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Registration_Locators", "Title_Login"));
    private final By Title_Registration = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Registration_Locators", "Title_Registration"));
    private final By Join_Now_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Registration_Locators", "Join_Now_Button"));
    private final By Terms_And_Conditions_Check_Box = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Registration_Locators", "Terms_And_Conditions_Check_Box"));
    private final By Go_To_Nafath_Button = By.xpath(Json_Data.Get_json_Data("Registration_Locators","Go_To_Nafath_Button"));
    private final By Tamawal_Contract_Checkbox_1 = By.xpath(Json_Data.Get_json_Data("Registration_Locators","Tamawal_Contract_Checkbox_1"));
    private final By Tamawal_Contract_Checkbox_2 = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Tamawal_Contract_Checkbox_2"));
    private final By Disagree_And_Back_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Registration_Locators", "Disagree_And_Back_Button"));






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

    public Registration Press_On_Title_Login() {
        Utility.Click_On_Element(driver, Title_Login);

        return this;
    }
    public Registration Press_On_Title_Registration() {
        Utility.Click_On_Element(driver, Title_Registration);

        return this;
    }

    public Registration Press_On_Mobile_Number_Field() {
        Utility.Click_On_Element(driver, Mobile_Number_Field);
        return this;
    }

    public Registration Enter_Mobile_Number(String MobileNumber) {
       Utility.Send_Data(driver, Mobile_Number_Field_After_Press, MobileNumber);
        return this;
    }
    public Registration Press_On_Join_Now_Button() {
        Utility.Click_On_Element(driver, Join_Now_Button);
        return this;
    }
    public Registration Press_On_Terms_And_Conditions_Check_Box() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Terms_And_Conditions_Check_Box);
        return this;
    }
    public Registration Press_On_Go_To_Nafath_Button() {
        Utility.Click_On_Element(driver, Go_To_Nafath_Button);
        return this;
    }

    public PIN_Page_AND_Biometrics Return_To_App() throws FileNotFoundException {
        Utility.Return_To_Previous_App(driver, "sa.tamawal.capp");
    return new PIN_Page_AND_Biometrics(driver);
    }

    public Registration Press_On_Tamawal_Contract_Checkbox_1() throws InterruptedException {
        Thread.sleep(5000);
        Utility.Click_On_Element(driver, Tamawal_Contract_Checkbox_1);
        return this;
    }
    public Registration Press_On_Tamawal_Contract_Checkbox_2() {
        Utility.Click_On_Element(driver, Tamawal_Contract_Checkbox_2);
        return this;
    }





}