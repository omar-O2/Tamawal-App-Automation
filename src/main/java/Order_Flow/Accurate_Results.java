package Order_Flow;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Accurate_Results {
    public AppiumDriver driver;
    private final By TAMAWAL_Button_In_Accurate = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Accurate_Results_Locators", "TAMAWAL_Button_In_Accurate"));
    private final By Track_Order_Button = By.xpath("//android.widget.Button[@content-desc=\"Track order\"]");















    public Accurate_Results(AppiumDriver driver) throws FileNotFoundException {
        this.driver=driver;
    }
    public Accurate_Results Press_On_TAMAWAL_In_Accurate(){
        Utility.scroll_To_Text(driver, "TAMAWAL");
        Utility.Click_On_Element(driver, TAMAWAL_Button_In_Accurate);
        return this;

    }
    public Accurate_Results Press_Track_Order_Button(){
        Utility.Click_On_Element(driver, Track_Order_Button);
        return this;

    }
}
