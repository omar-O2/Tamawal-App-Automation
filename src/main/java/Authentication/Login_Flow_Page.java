package Authentication;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;



import java.io.FileNotFoundException;

public class Login_Flow_Page {

    public AppiumDriver driver;
    //private final By Continue_Button = By.xpath(Json_Data.Get_json_Data("Login_Locators"
          //  ,"Continue_Button"));
    private final By Continue_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators"
            ,"Continue_Button"));
    private final By Allow_Location = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Allow_Location"));
    private final By Skip_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators", "Skip_Button"));
    private final By Join_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators", "Join_Button"));
    private final By National_ID_Field = By.xpath(Json_Data.Get_json_Data("Login_Locators", "National_ID_Field"));
    private final By Continue_Button_Login = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Login_Locators"
            ,"Continue_Button_Login"));
    private final By Title = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Title"));







    public Login_Flow_Page(AppiumDriver driver) throws FileNotFoundException {

        this.driver = driver;


    }



    public PIN_Page_AND_Biometrics Press_Continue_Button() throws FileNotFoundException {

        Utility.Click_On_Element(driver, Continue_Button);
        return new PIN_Page_AND_Biometrics(driver);
    }

    public void Press_Allow_Location() {

        Utility.Click_On_Element(driver, Allow_Location);
    }

    public void Press_Skip_Button() {

        Utility.Click_On_Element(driver, Skip_Button);
    }

    public void Press_Join_Button() {

        Utility.Click_On_Element(driver, Join_Button);

    }

    public Login_Flow_Page Press_On_NationalID() {
        Utility.Click_On_Element(driver, National_ID_Field);

        return this;

    }


    public Login_Flow_Page Enter_NationalID(String NationalIDText) {
        Utility.Send_Data(driver, National_ID_Field, NationalIDText);
        return this;

    }

    public void Press_Continue_Login() {
        driver.findElement(Continue_Button_Login).click();


    }

    public Login_Flow_Page Press_On_Title() {
       Utility.Click_On_Element(driver, Title);

return this;
    }
}
