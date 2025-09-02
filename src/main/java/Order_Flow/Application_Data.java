package Order_Flow;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Application_Data {
    public AppiumDriver driver;
    private final By Lets_Go_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Lets_Go_Button"));

    private final By Job_Information_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Job_Information_Field"));
    private final By Yes_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Yes_Button"));
    private final By No_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "No_Button"));
    private final By Sector_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Sector_DDL"));
    private final By Government_In_Sector_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Government_In_Sector_DDL"));
    private final By Entity_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Entity_DDL"));
    private final By MinistryOfTransportation_In_Entity_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "MinistryOfTransportation_In_Entity_DDL"));
    private final By Job_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Job_DDL"));
    private final By Security_Man_In_Job_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Security_Man_In_Job_DDL"));
    private final By City_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "City_DDL"));
    private final By Abha_In_City_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Abha_In_City_DDL"));
    private final By Bank_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Bank_DDL"));
    private final By Alinma_In_Bank_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Alinma_In_Bank_DDL"));
    private final By Date_Field = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Date_Field"));
    private final By Specific_Date = By.xpath("//android.widget.Button[@content-desc=\"22, Tuesday, April 22, 2025, Today\"]");
    private final By Year_Button_Calender = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_Button_Calender"));
    private final By Year_2020 = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_2020"));


    private final By OK_Button_In_Date_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "OK_Button_In_Date_Field"));
    private final By Next_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Next_Button"));
    private final By Cancel_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Cancel_Button"));
    private final By Ok_Confirm_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Ok_Confirm_Button"));
    private final By Back_To_Summary_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Back_To_Summary_Button"));
    private final By Accept_Terms_And_Conditions_Checkbox = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Accept_Terms_And_Conditions_Checkbox"));
    private final By Acknowledge_And_Undertake_That_All_My_Information_Is_Correct_And_My_Order_Will_Be_Canceled_In_Case_The_Information_Is_Incorrect = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Acknowledge_And_Undertake_That_All_My_Information_Is_Correct_And_My_Order_Will_Be_Canceled_In_Case_The_Information_Is_Incorrect_Checkbox"));
    //private final By I_Hereby_Declare_That_The_NationalID_Date_Of_Birth_I_Have_Provided_Is_Correct_Allow_Tamawal_to_Verify_It_If_ID_Is_Not_Correct_I_Will_Go_To_Profile_To_Disable_This_Account_Create_New_Account_With_Correct_ID_If_DoB_Is_Not_Correct_I_Will_Change_DoB_From_Profile_Checkbox
          //  = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", " I_Hereby_Declare_That_The_NationalID_Date_Of_Birth_I_Have_Provided_Is_Correct_Allow_Tamawal_to_Verify_It_If_ID_Is_Not_Correct_I_Will_Go_To_Profile_To_Disable_This_Account_Create_New_Account_With_Correct_ID_If_DoB_Is_Not_Correct_I_Will_Change_DoB_From_Profile_Checkbox"));
    private final By Confirm_Data_Provided_Is_Accurate = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Confirm_Data_Provided_Is_Accurate"));
    private final By TAMAWAL_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "TAMAWAL_Button"));






    public Application_Data(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }

    public Application_Data Press_On_Lets_Go_Button() {
        Utility.Click_On_Element(driver, Lets_Go_Button);
        return this;

    }


    public Application_Data Press_On_Job_Information_Field() {
        Utility.Click_On_Element(driver, Job_Information_Field);
        return this;

    }

    public Application_Data Press_On_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Yes_Button);
        return this;

    }

    public Application_Data Press_On_Next_Button() {
        Utility.Click_On_Element(driver, Next_Button);
        return this;

    }

    public Application_Data Press_On_Sector_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Sector_DDL);
        return this;


    }

    public Application_Data Enter_Sector_Data(String Sector) {
        Utility.Send_Data(driver, Sector_DDL, Sector);
        Utility.Click_On_Element(driver, Government_In_Sector_DDL);
        return this;


    }

    public Application_Data Press_On_Entity_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Application_Data Enter_Entity_Data(String Entity) {
        Utility.Send_Data(driver, Entity_DDL, Entity);
        Utility.Click_On_Element(driver, MinistryOfTransportation_In_Entity_DDL);
        return this;

    }

    public Application_Data Press_On_Job_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Application_Data Enter_Job_Data(String Job) {
        Utility.Send_Data(driver, Job_DDL, Job);
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
        return this;

    }

    public Application_Data Press_On_City_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, City_DDL);
        return this;

    }

    public Application_Data Enter_City_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }


    public Application_Data Press_On_Bank_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Bank_DDL);
        return this;

    }


    public Application_Data Enter_Bank_Data(String Bank) {
        Utility.Send_Data(driver, Job_DDL, Bank);
        Utility.Click_On_Element(driver, Alinma_In_Bank_DDL);
        return this;

    }


    public Application_Data Press_On_Hiring_Date_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Date_Field);
        return this;

    }


    public Application_Data Choose_Date() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Year_Button_Calender);
        Utility.Click_On_Element(driver, Year_2020);
        return this;


    }

    public Application_Data Press_Ok_In_Date() throws InterruptedException {
        Thread.sleep(2000);

        Utility.Click_On_Element(driver, OK_Button_In_Date_Field);
        return this;

    }

    public Application_Data Press_Ok_Confirm_Button() {
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Ok_Confirm_Button);
        return this;

    }

    public Application_Data Press_Back_To_Summary_Button() {
        Utility.Click_On_Element(driver, Back_To_Summary_Button);
        return this;

    }


    public Application_Data Press_Confirm_Data_Provided_Is_Accurate() throws InterruptedException {

        Utility.Click_On_Element(driver, Confirm_Data_Provided_Is_Accurate);
        return this;

    }



    public Application_Data Press_On_TAMAWAL_Button() throws FileNotFoundException {
        Utility.Click_On_Element(driver, TAMAWAL_Button);
        return this;

    }


}















