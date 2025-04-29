package Authentication;

import Pages.Home_Page;
import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.*;
import org.openqa.selenium.By;



public class PIN_Page_AND_Biometrics {
    public AppiumDriver driver;
    private final By Number_One = By.xpath("//android.view.View[@content-desc=\"1\"]");
    private final By Number_Two = By.xpath("//android.view.View[@content-desc=\"2\"]");
    private final By Number_Three = By.xpath("//android.view.View[@content-desc=\"3\"]");
    private final By Number_Four = By.xpath("//android.view.View[@content-desc=\"4\"]");
    private final By Number_Five = By.xpath("//android.view.View[@content-desc=\"5\"]");
    private final By Number_Six = By.xpath("//android.view.View[@content-desc=\"6\"]");
    private final By Number_Seven = By.xpath("//android.view.View[@content-desc=\"7\"]");
    private final By Number_Eight = By.xpath("//android.view.View[@content-desc=\"8\"]");
    private final By Number_Nine = By.xpath("//android.view.View[@content-desc=\"9\"]");
    private final By Number_Zero= By.xpath("//android.view.View[@content-desc=\"0\"]");
    private final By Enable_Biometrics_Button= By.xpath("//android.widget.Button[@content-desc=\"Enable\"]");
    private final By Ignore_Biometrics_Button= By.xpath("//android.widget.Button[@content-desc=\"Ignore\"]");










    public PIN_Page_AND_Biometrics(AppiumDriver driver){
        this.driver= driver;
    }

    public PIN_Page_AND_Biometrics Press_Number_Zero(){
        Utility.Click_On_Element(driver, Number_Zero);
        return this;
    }

    public PIN_Page_AND_Biometrics Press_Number_One(){
        Utility.Click_On_Element(driver, Number_One);
        return this;
    }

    public PIN_Page_AND_Biometrics Press_Number_Two(){
        Utility.Click_On_Element(driver, Number_Two);
        return this;
    }
    public PIN_Page_AND_Biometrics Press_Number_Three(){
        Utility.Click_On_Element(driver, Number_Three);
        return this;
    }
    public PIN_Page_AND_Biometrics Press_Number_Four(){
        Utility.Click_On_Element(driver, Number_Four);
        return this;
    }

    public PIN_Page_AND_Biometrics Press_Number_Five(){
        Utility.Click_On_Element(driver, Number_Five);
        return this;
    }
    public PIN_Page_AND_Biometrics Press_Number_Six(){
        Utility.Click_On_Element(driver, Number_Six);
        return this;
    }
    public PIN_Page_AND_Biometrics Press_Number_Seven(){
        Utility.Click_On_Element(driver, Number_Seven);
        return this;
    }
    public PIN_Page_AND_Biometrics Press_Number_Eight(){
        Utility.Click_On_Element(driver, Number_Eight);
        return this;
    } public PIN_Page_AND_Biometrics Press_Number_Nine(){
        Utility.Click_On_Element(driver, Number_Nine);
        return this;
    }
    public Home_Page Press_Enable_Button(){
        Utility.Click_On_Element(driver, Enable_Biometrics_Button);
        return new Home_Page(driver) ;
    }
    public Home_Page Press_Ignore_Button(){
        Utility.Click_On_Element(driver, Ignore_Biometrics_Button);
        return new Home_Page(driver);
    }





}
