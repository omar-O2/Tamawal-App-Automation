package Pages;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Product_Details {
    public AppiumDriver driver;
    private final By Tamawal_Button = By.xpath("//android.widget.Button[@content-desc=\"Tamawal\"]");







    public Product_Details(AppiumDriver driver){
        this.driver = driver;
    }


    public void Press_On_Tamawal_Button(){
        Utility.Click_On_Element(driver, Tamawal_Button);
    }



}
