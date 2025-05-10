package Pages;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Products_List {
    public AppiumDriver driver;
    private final By Home_Page_Icon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
    private final By Close_Compare_Tour_Guide_Icon = By.xpath("//android.widget.ImageView[@content-desc=\"Comparison new feature \uD83D\uDC4B\n" +
            "Would you like to walkthrough our product comparison feature?\"]/android.view.View[1]");







    public Products_List(AppiumDriver driver){

        this.driver = driver;
    }

    public Products_List Press_On_Home_Page_Icon(){
        Utility.Click_On_Element(driver, Home_Page_Icon);
        return this;

    }


    public Products_List Press_On_Close_Compare_Tour_Guide_Icon(){
        Utility.Click_On_Element(driver,
                Close_Compare_Tour_Guide_Icon);
        return this;

    }
}
