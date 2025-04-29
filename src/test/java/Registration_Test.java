import Authentication.Login_Flow_Page;
import Authentication.OTP;
import Authentication.Registration;
import Pages.Allow_Notification_Popup;
import Pages.TestBase;
import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Registration_Test extends TestBase {
    @BeforeMethod
    public void Reach_Login() throws InterruptedException, FileNotFoundException {




        new Allow_Notification_Popup(driver).Press_Allow_Button();
        new Registration(driver).Press_Continue_Button();
        new Registration(driver).Press_Allow_Location();
        new Registration(driver).Press_Skip_Button();
        new Registration(driver).Press_Join_Button();
    }

@Test
        public void Valid_Registration_With_NationalID() throws FileNotFoundException, InterruptedException {
            new Registration(driver).Press_On_NationalID().Enter_NationalID("1011111166").Press_On_Title_Login().Press_Continue_Button().Press_On_Mobile_Number_Field();
new Registration(driver).Enter_Mobile_Number("512345678").Press_On_Title_Registration().Press_On_Join_Now_Button().Press_On_Terms_And_Conditions_Check_Box().Press_Continue_Button();
new OTP(driver).Press_On_OTP_Field().Enter_OTP();new Registration(driver).Press_Continue_Button().Press_On_Go_To_Nafath_Button().Return_To_App().Press_On_Set_PIN_Button().Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().
Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
new Registration(driver).Press_On_Tamawal_Contract_Checkbox_1().Press_On_Tamawal_Contract_Checkbox_2().Press_Continue_Button();
    Thread.sleep(3000);
            Assert.assertEquals(
                    driver.findElements(By.xpath("//android.view.View[@content-desc=\"Log in or Sign up\"]")).isEmpty(),
                    false,
                    "No EditText elements found"
            );
        }

    }

