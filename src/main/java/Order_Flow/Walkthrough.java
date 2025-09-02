package Order_Flow;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Walkthrough {
    public AppiumDriver driver;
    private final By Start_Discovery_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Home_Page_Locators", "Start_Discovery_Button"));
    private final By Salary_Field = By.xpath("//android.widget.EditText");
    private final By Select_Loan_Purpose = By.xpath("//android.widget.ScrollView/android.widget.ImageView[1]");
    private final By Loan_Purpose_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Walkthrough_Locators", "Loan_Purpose_DDL"));
    private final By Yes_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Walkthrough_Locators", "Yes_Button"));
    private final By No_Button = By.xpath(Json_Data.Get_json_Data("Walkthrough_Locators", "No_Button"));
    private final By Commitment_Field = By.xpath("//android.widget.EditText");
    private final By Preferred_Amount_Field = By.xpath("//android.widget.EditText");
    private final By Products_Search_Page_Title = By.xpath("//android.widget.ImageView[@content-desc=\"Products for you\n" +
            "Change\"]");
    private final By Loan_Period = By.xpath(Json_Data.Get_json_Data("Walkthrough_Locators","Loan_Period"));
    private final By Tamawal_Button = By.xpath("//android.widget.Button[@content-desc=\"Tamawal\"]");





    public Walkthrough(AppiumDriver driver) throws FileNotFoundException {
        this.driver= driver;
    }

    public Walkthrough Press_Start_Discovery_Button(){

        Utility.Click_On_Element(driver, Start_Discovery_Button);
        return this;
    }




    public Walkthrough Press_On_Salary_Field(){

        Utility.Click_On_Element(driver, Salary_Field);
        return this;

    }
    public Walkthrough Press_On_Select_Loan_Purpose(){

        Utility.Click_On_Element(driver, Select_Loan_Purpose);
        return this;

    }
    public Walkthrough Choose_Loan_Purpose(){

        Utility.Click_On_Element(driver, Loan_Purpose_DDL);
        return this;

    }


    public Walkthrough Enter_Salary(String Amount){

        Utility.Send_Data(driver, Salary_Field,Amount);
        return this;

    }

    public Walkthrough Press_No_Button(){
        Utility.Click_On_Element(driver, By.xpath("//android.view.View[@content-desc=\"Do you have active loans?\"]"));
        Utility.Click_On_Element(driver, No_Button);
        return this;

    }
    public Walkthrough Press_Preferred_Amount_Field(){

        Utility.Click_On_Element(driver, Preferred_Amount_Field);
        driver.findElement(Preferred_Amount_Field).clear();
        return this;
    }
    public Walkthrough Enter_Preferred_Amount(String Preferred_Amount){

        Utility.Send_Data(driver, Preferred_Amount_Field, Preferred_Amount);
        return this;

    }



    public Walkthrough Choose_Loan_Period() {

        Utility.Click_On_Element(driver, Loan_Period);
        return this;


    }
    public Walkthrough Scroll_To_Tamawal_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Scroll_Vertical_To_Element(driver,true,Tamawal_Button,3);
        return this;


    }

}
