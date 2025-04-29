package Order_Flow;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Walkthrough {
    public AppiumDriver driver;
    private final By Start_Discovery_Button = By.xpath("//android.widget.Button[@content-desc=\"Start Discovery\"]");
    private final By Lets_Begin_Button1 = By.xpath("//android.widget.ImageView[@content-desc=\"Let's Begin\"]");
    private final By Salary_Field = By.xpath("//android.widget.EditText");
    private final By Next_Button = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    private final By Select_Loan_Purpose = By.xpath("//android.widget.EditText");
    private final By Loan_Purpose_DDL = By.xpath("//android.view.View[@content-desc=\"Home Improvement\"]");
    private final By Yes_Button = By.xpath("//android.view.View[@content-desc=\"Yes\"]");
    private final By No_Button = By.xpath("//android.view.View[@content-desc=\"No\"]");
    private final By Commitment_Field = By.xpath("//android.widget.EditText");
    private final By Preferred_Amount_Field = By.xpath("//android.widget.EditText");
    private final By Ok_And_Continue_Button = By.xpath("//android.widget.Button[@content-desc=\"Ok, Commit And Continue\"]");
    private final By Products_Search_Page_Title = By.xpath("//android.widget.ImageView[@content-desc=\"Products for you\n" +
            "Change\"]");
    private final By Credit_Limit_Title = By.xpath("//android.view.View[@content-desc=\"The Credit Limit\"]");





    public Walkthrough(AppiumDriver driver){
        this.driver= driver;
    }

    public Walkthrough Press_Start_Discovery_Button(){

        Utility.Click_On_Element(driver, Start_Discovery_Button);
        return this;
    }


    public void Press_Lets_Begin_Button1(){

        Utility.Click_On_Element(driver, Lets_Begin_Button1);
    }

    public void Press_On_Salary_Field(){

        Utility.Click_On_Element(driver, Salary_Field);
    }
    public void Press_On_Select_Loan_Purpose(){

        Utility.Click_On_Element(driver, Select_Loan_Purpose);
    }
    public void Select_Home_Improvement(){

        Utility.Click_On_Element(driver, Loan_Purpose_DDL);
    }


    public void Enter_Salary(String Amount){

        Utility.Send_Data(driver, Salary_Field,Amount);
    }
    public void Press_Next_Button(){

        Utility.Click_On_Element(driver, Next_Button);
    }
    public void Press_No_Button(){

        Utility.Click_On_Element(driver, No_Button);
    }
    public void Press_Preferred_Amount_Field(){

        Utility.Click_On_Element(driver, Preferred_Amount_Field);
        driver.findElement(Preferred_Amount_Field).clear();    }
    public void Enter_Preferred_Amount(String Preferred_Amount){

        Utility.Send_Data(driver, Preferred_Amount_Field, Preferred_Amount);
    }

    public void Press_Ok_And_Continue_Button(){

        Utility.Click_On_Element(driver, Ok_And_Continue_Button);
    }
    public void Press_Credit_Limit_Title(){

        Utility.Click_On_Element(driver, Credit_Limit_Title);
    }








}
