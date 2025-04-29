import Authentication.Login_Flow_Page;
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




        new Registration(driver).Press_Allow_Location();
        new Registration(driver).Press_Continue_Button();
        new Registration(driver).Press_Allow_Location();
        new Registration(driver).Press_Skip_Button();
        new Registration(driver).Press_Join_Button();
    }


        public void Valid_Registration_With_NationalID() throws FileNotFoundException, InterruptedException {
            new Registration(driver).Press_On_NationalID().Enter_NationalID("1005530090").Press_On_Title().Press_Continue_Button().Press_On_Mobile_Number_Field().Enter_Mobile_Number("516161616");
            Thread.sleep(3000);
            Assert.assertEquals(
                    driver.findElements(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]")).isEmpty(),
                    false,
                    "No EditText elements found"
            );
        }

    }

