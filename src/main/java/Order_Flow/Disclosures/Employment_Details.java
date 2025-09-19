package Order_Flow.Disclosures;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Employment_Details {


    public AppiumDriver driver;
    private final By Sector_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Sector_DDL"));
    private final By Government_In_Sector_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Government_In_Sector_DDL"));
    private final By Entity_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Entity_DDL"));
    private final By MinistryOfTransportation_In_Entity_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "MinistryOfTransportation_In_Entity_DDL"));
    private final By Job_DDL = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Job_DDL"));
    private final By Security_Man_In_Job_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Security_Man_In_Job_DDL"));
    private final By City_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "City_DDL"));
    private final By Abha_In_City_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Abha_In_City_DDL"));
    private final By Bank_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Bank_DDL"));
    private final By Albilad_In_Bank_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Albilad_In_Bank_DDL"));
    private final By Date_Field = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Date_Field"));
    private final By Specific_Date = By.xpath("//android.widget.Button[@content-desc=\"22, Tuesday, April 22, 2025, Today\"]");
    private final By Year_Button_Calender = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_Button_Calender"));
    private final By Year_2020 = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_2020"));


    private final By OK_Button_In_Date_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "OK_Button_In_Date_Field"));
    private final By Confirm_And_Next_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Confirm_And_Next_Button"));






    public Employment_Details(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }







    public Employment_Details Press_On_Next_Button() {
        Utility.Click_On_Element(driver, Confirm_And_Next_Button);
        return this;

    }

    public Employment_Details Press_On_Sector_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Sector_DDL);
        return this;


    }

    public Employment_Details Enter_Sector_Data(String Sector) {
        Utility.Send_Data(driver, Sector_DDL, Sector);
        Utility.Click_On_Element(driver, Government_In_Sector_DDL);
        return this;


    }

    public Employment_Details Press_On_Entity_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Employment_Details Enter_Entity_Data(String Entity) {
        Utility.Send_Data(driver, Entity_DDL, Entity);
        Utility.Click_On_Element(driver, MinistryOfTransportation_In_Entity_DDL);
        return this;

    }

    public Employment_Details Press_On_Job_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Employment_Details Enter_Job_Data(String Job) {
        Utility.Send_Data(driver, Job_DDL, Job);
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
        return this;

    }

    public Employment_Details Press_On_City_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, City_DDL);
        return this;

    }

    public Employment_Details Enter_City_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }

    public Employment_Details Choose_Abha_City() {
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }


    public Employment_Details Press_On_Bank_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Bank_DDL);
        return this;

    }


    public Employment_Details Choose_Bank_Albilad() {
        Utility.Click_On_Element(driver, Albilad_In_Bank_DDL);
        return this;

    }


    public Employment_Details Press_On_Hiring_Date_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Date_Field);
        return this;

    }


    public Employment_Details Choose_Date() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Year_Button_Calender);
        Utility.Click_On_Element(driver, Year_2020);
        return this;


    }

    public Employment_Details Press_Ok_In_Date() throws InterruptedException {
        Thread.sleep(2000);

        Utility.Click_On_Element(driver, OK_Button_In_Date_Field);
        return this;

    }


}
