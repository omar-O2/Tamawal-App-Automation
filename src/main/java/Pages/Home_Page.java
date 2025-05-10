package Pages;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Home_Page {
    public AppiumDriver driver;
    private final By Logo_Tamawal = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]");
    private final By Start_Discovery_Button = By.xpath("//android.widget.Button[@content-desc=\"Start Discovery\"]");
    private final By Details_Button = By.xpath("(//android.widget.ImageView[@content-desc=\"Details\"])[3]");











    public Home_Page(AppiumDriver driver){

        this.driver= driver;
    }




public void Press_Start_Discovery_Button(){
    Utility.Click_On_Element(driver, Start_Discovery_Button);
}

public Product_Details Press_On_Details_Button(){
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Details_Button);
        return new Product_Details(driver);
}
}
