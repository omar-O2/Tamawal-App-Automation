package Order_Flow.Disclosures;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Employment_Details {


    public AppiumDriver driver;
    private final  By Section_Employment_Details = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Section_Employment_Details"));
    private final By Sector_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Sector_DDL"));
    private final By Government_In_Sector_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Government_In_Sector_DDL"));
    private final By Entity_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Entity_DDL"));
    private final By MinistryOfTransportation_In_Entity_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "MinistryOfTransportation_In_Entity_DDL"));
    private final By Job_Title_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Job_Title_DDL"));
    private final By Security_Man_In_Job_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Security_Man_In_Job_DDL"));
    private final By Date_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Date_Field"));
    private final By Specific_Date = By.xpath("//android.widget.Button[@content-desc=\"22, Tuesday, April 22, 2025, Today\"]");
    private final By Year_Button_Calender = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_Button_Calender"));
    private final By Year_2020 = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Year_2020"));


    private final By OK_Button_In_Date_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "OK_Button_In_Date_Field"));






    public Employment_Details(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }




    public Employment_Details Press_On_Section_Employment_Details() {
        Utility.Click_On_Element(driver, Section_Employment_Details);
        return this;

    }



    public Employment_Details Press_On_Sector_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Sector_DDL);
        return this;


    }

    public Employment_Details Enter_Sector_Data(String Sector) {
        Utility.Send_Data(driver, Sector_DDL, Sector);
        Utility.Click_On_Element (driver, Government_In_Sector_DDL);
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

    public Employment_Details Press_On_Job_Title_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Job_Title_DDL);
        return this;

    }

    public Employment_Details Enter_Job_Data(String Job) {
        Utility.Send_Data(driver, Job_Title_DDL, Job);
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
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
