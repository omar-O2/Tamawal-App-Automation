import Authentication.Login_Flow_Page;
import Pages.TestBase;
import Utilities.Json_Data;
import Utilities.Slider;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Testslide extends TestBase {
    By text = AppiumBy.accessibilityId("288,504");
    @Test
    public void Valid_Login_With_NationalID() throws InterruptedException, FileNotFoundException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Login", "NationalIDText")).Press_On_Title().Press_Continue_Button().Press_Number_One().Press_Number_Two()
                .Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"icon1\"]/android.widget.ImageView")).click();
        Thread.sleep(6000);
        //Slider.slideUntilElementAppears(driver);
        Slider.slideUntilElementAppears(driver);
        Assert.assertEquals(
                driver.findElements(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]")).isEmpty(),
                false,
                "No EditText elements found"
        );
    }
}
