package Order_Flow;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Payment {
    public AppiumDriver driver;
    private final By Name_On_Card_Field = By.xpath("//android.widget.EditText[@resource-id=\"mysr-cc-name\"]");
    private final By Card_Number_Field = By.xpath("//android.widget.EditText[@resource-id=\"mysr-cc-number\"]");
    private final By Month_Of_Card = By.xpath("//android.view.View[@resource-id=\"mysr-form-form-el\"]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.EditText[1]");
    private final By CVV_Of_Card = By.xpath("//android.view.View[@resource-id=\"mysr-form-form-el\"]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.EditText[2]");
    private final By Pay_SAR_20_Button = By.xpath("//android.widget.Button[@text=\"Pay SAR 20.00\"]");
    private final By Submit_Button = By.xpath("//android.widget.Button[@text=\"Submit\"]");
    private final By Continue_Button = By.xpath(Json_Data.Get_json_Data("Login_Locators"
            ,"Continue_Button"));













    public Payment (AppiumDriver driver) throws FileNotFoundException {

        this.driver = driver;
    }


    public void Press_On_Name_On_Card_Field(){

        Utility.Click_On_Element(driver, Name_On_Card_Field);
    }
    public void Enter_Name_On_Card(String Name_On_Card){

        Utility.Send_Data(driver,Name_On_Card_Field, Name_On_Card);
    }


    public void Press_On_Card_Number_Field(){

        Utility.Click_On_Element(driver, Card_Number_Field);
    }
    public void Enter_Card_Number(String Card_Number){

        Utility.Send_Data(driver,Card_Number_Field, Card_Number);
    }

    public void Press_On_Month_Of_Card(){

        Utility.Click_On_Element(driver, Month_Of_Card);
    }
    public void Enter_Month_Of_Card(String Month_Card){

        Utility.Send_Data(driver,Month_Of_Card, Month_Card);
    }

    public void Press_On_CVV_Of_Card(){

        Utility.Click_On_Element(driver, CVV_Of_Card);
    }

    public void Enter_CVV_Of_Card(String Card_CVV){

        Utility.Send_Data(driver,CVV_Of_Card, Card_CVV);
    }

    public void Press_On_Pay_SAR_20_Button(){

        Utility.Click_On_Element(driver, Pay_SAR_20_Button);

    }

    public void Press_On_Submit_Button(){

        Utility.Click_On_Element(driver, Submit_Button);

    }

    public void Press_On_Continue_Button(){

        Utility.Click_On_Element(driver, Continue_Button);

    }








}
