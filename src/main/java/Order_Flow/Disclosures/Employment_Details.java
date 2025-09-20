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
    private final By Basic_Salary_Amount_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Basic_Salary_Amount_Field"));
    private final By Basic_Salary_Amount_Text = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Basic_Salary_Amount_Text"));
    private final By Add_Amount_Field = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Add_Amount_Field"));
    private final By Add_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Add_Button"));
    private final By Do_Not_Have_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Do_Not_Have_Button"));
    private final By Housing_Allowance_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Housing_Allowance_Field"));
    private final By Transportation_Allowance_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Transportation_Allowance_Field"));
    private final By Housing_Allowance_Text = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Housing_Allowance_Text"));
    private final By Transportation_Allowance_Text = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Transportation_Allowance_Text"));








    public Employment_Details(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }




    public Employment_Details Press_On_Section_Employment_Details() {
        Utility.Click_On_Element(driver, Section_Employment_Details);
        return this;

    }



    public Employment_Details Press_On_Sector_DDL()  {
        Utility.Click_On_Element(driver, Sector_DDL);
        return this;


    }

    public Employment_Details Choose_Government_In_Sector_DDL() {
        Utility.Click_On_Element (driver, Government_In_Sector_DDL);
        return this;




    }

    public Employment_Details Press_On_Entity_DDL() {
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Employment_Details Choose_MinistryOfTransportation_In_Entity_DDL() {
        Utility.Click_On_Element(driver, MinistryOfTransportation_In_Entity_DDL);
        return this;

    }

    public Employment_Details Press_On_Job_Title_DDL() {
        Utility.Click_On_Element(driver, Job_Title_DDL);
        return this;

    }

    public Employment_Details Choose_Security_Man_In_Job_DDL() {
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
        return this;

    }



    public Employment_Details Press_On_Hiring_Date_Field() {
        Utility.Click_On_Element(driver, Date_Field);
        return this;

    }


    public Employment_Details Choose_Date() {
        Utility.Click_On_Element(driver, Year_Button_Calender);
        Utility.Click_On_Element(driver, Year_2020);
        return this;


    }

    public Employment_Details Press_Ok_In_Date() {

        Utility.Click_On_Element(driver, OK_Button_In_Date_Field);
        return this;

    }

    public Employment_Details Press_On_Basic_Salary_Amount_Field() {

        Utility.Click_On_Element(driver, Basic_Salary_Amount_Field);
        return this;

    }


    public Employment_Details Add_Salary_Amount(String Salary_Amount){
        Utility.Send_Data(driver,Add_Amount_Field,Salary_Amount);
        Utility.Click_On_Element(driver,Basic_Salary_Amount_Text);
        Utility.Click_On_Element(driver,Add_Button);
        return this;
    }

    public Employment_Details Press_On_Do_Not_Have_Button() {

        Utility.Click_On_Element(driver, Do_Not_Have_Button);
        return this;

    }

    public Employment_Details Press_On_Housing_Allowance_Field() {

        Utility.Click_On_Element(driver, Housing_Allowance_Field);
        return this;

    }

    public Employment_Details Add_Housing_Allowance(String Housing_Allowance){
        Utility.Send_Data(driver,Add_Amount_Field,Housing_Allowance);
        Utility.Click_On_Element(driver,Housing_Allowance_Text);
        Utility.Click_On_Element(driver,Add_Button);
        return this;
    }



    public Employment_Details Press_On_Transportation_Allowance_Field() {

        Utility.Click_On_Element(driver, Transportation_Allowance_Field);
        return this;

    }

    public Personal_Details Add_Transportation_Allowance(String Transportation_Allowance) throws FileNotFoundException {
        Utility.Send_Data(driver,Add_Amount_Field,Transportation_Allowance);
        Utility.Click_On_Element(driver,Transportation_Allowance_Field);
        Utility.Click_On_Element(driver,Add_Button);
        return new Personal_Details(driver);
    }


}
