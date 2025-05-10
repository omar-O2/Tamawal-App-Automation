package Order_Flow;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Accurate_Results {
    public AppiumDriver driver;
    private final By TAMAWAL_Button_In_Accurate = By.xpath("//android.widget.Button[@content-desc=\"TAMAWAL\"]");
    private final By Track_Order_Button = By.xpath("//android.widget.Button[@content-desc=\"Track order\"]");















    public Accurate_Results(AppiumDriver driver){
        this.driver=driver;
    }
    public Accurate_Results Press_On_TAMAWAL_In_Accurate(){
        Utility.scrollToText(driver, "TAMAWAL");
        Utility.Click_On_Element(driver, TAMAWAL_Button_In_Accurate);
        return this;

    }
    public Accurate_Results Press_Track_Order_Button(){
        Utility.Click_On_Element(driver, Track_Order_Button);
        return this;

    }
}
