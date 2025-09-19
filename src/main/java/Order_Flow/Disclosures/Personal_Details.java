package Order_Flow.Disclosures;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Personal_Details {
    public AppiumDriver driver;
    private final  By Section_Personal_Details = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Section_Personal_Details"));
    private final  By Social_Status_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Social_Status_DDL"));
    private final  By Single_Social_Status = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Single_Social_Status"));
    private final  By Family_Members_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Family_Members_DDL"));
    private final  By Number_1_in_DDLs = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Number_1_in_DDLs"));
    private final  By Number_Of_Dependents_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Number_Of_Dependents_DDL"));
    private final  By Monthly_Education_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Monthly_Education_Field"));
    private final  By Amount_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Amount_Field"));
    private final  By Amount_Entry_Field = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators","Amount_Entry_Field"));
    private final  By Title_Of_Amount_Entry_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Title_Of_Amount_Entry_Field"));
    private final By Ok_Button_In_Amount_Entry_Field = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Ok_Button_In_Amount_Entry_Field"));

    private final  By Education_Level_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Education_Level_DDL"));
    private final  By Option_In_Education_Level_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Option_In_Education_Level_DDL"));
    private final  By Source_Of_Income_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Source_Of_Income_DDL"));
    private final  By Option_In_Source_Of_Income_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Option_In_Source_Of_Income_DDL"));
    private final  By Net_Worth_Category_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Net_Worth_Category_DDL"));
    private final  By Option_In_Net_Worth_Category_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Option_In_Net_Worth_Category_DDL"));
    private final  By Current_Job_Professions_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Current_Job_Professions_DDL"));
    private final  By Option_In_Current_Job_Professions_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators","Option_In_Current_Job_Professions_DDL"));
    private final By Job_Information_Field = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Job_Information_Field"));
    private final By First_Yes_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "First_Yes_Button"));
    private final By Second_Yes_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Second_Yes_Button"));
    private final By Third_Yes_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Third_Yes_Button"));
    private final By Fourth_Yes_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Fourth_Yes_Button"));
    private final By Fifth_Yes_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Fifth_Yes_Button"));
    private final By First_No_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "First_No_Button"));
    private final By Second_No_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Second_No_Button"));
    private final By Third_No_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Third_No_Button"));
    private final By Fourth_No_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Fourth_No_Button"));
    private final By Fifth_No_Button = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Fifth_No_Button"));

    private final By City_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "City_DDL"));
    private final By Abha_In_City_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Abha_In_City_DDL"));
    private final By Bank_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Bank_DDL"));
    private final By Albilad_In_Bank_DDL = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Albilad_In_Bank_DDL"));

    private final By Confirm_And_Next_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Confirm_And_Next_Button"));
    private final By Ok_Confirm_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Ok_Confirm_Button"));
    private final By No_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "No_Button"));
    private final By Yes_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Yes_Button"));
    private final By Ok_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Ok_Button"));






    public Personal_Details(AppiumDriver driver) throws FileNotFoundException {
        this.driver = driver;
    }

    public Personal_Details Click_On_Section_Personal_Details (){
        Utility.Click_On_Element(driver, Section_Personal_Details);
        return this;
    }

    public Personal_Details Click_On_Social_Status_DDL (){
        Utility.Click_On_Element(driver, Social_Status_DDL);
        return this;
    }

    public Personal_Details Choose_Single_In_Social_Status_DDL(){

        Utility.Click_On_Element(driver, Single_Social_Status);
        return this;
    }


    public Personal_Details Click_On_Family_Members_DDL (){
        Utility.Click_On_Element(driver, Family_Members_DDL);
        return this;
    }


    public Personal_Details Click_On_Number_1_in_DDLs (){
        Utility.Click_On_Element(driver, Number_1_in_DDLs);
        return this;
    }


    public Personal_Details Click_On_Number_Of_Dependents_DDL (){
        Utility.Click_On_Element(driver, Number_Of_Dependents_DDL);
        return this;
    }

    public Personal_Details Click_On_Monthly_Education_Field (){
        Utility.Click_On_Element(driver, Monthly_Education_Field);
        return this;
    }

    public Personal_Details Enter_Monthly_Education_Field (){

        Utility.Send_Data(driver,Monthly_Education_Field,"1200");
        return this;
    }

    public Personal_Details Click_On_Education_Level_DDL (){

        Utility.Click_On_Element(driver, Education_Level_DDL);
        return this;
    }

    public Personal_Details Choose_Option_In_Education_Level_DDL(){

        Utility.Click_On_Element(driver, Option_In_Education_Level_DDL);
        return this;
    }

    public Personal_Details Click_On_Source_Of_Income_DDL (){

        Utility.Click_On_Element(driver, Source_Of_Income_DDL);
        return this;
    }

    public Personal_Details Choose_Option_In_Source_Of_Income_DDL(){

        Utility.Click_On_Element(driver, Option_In_Source_Of_Income_DDL);
        return this;
    }

    public Personal_Details Click_On_Net_Worth_Category_DDL (){

        Utility.Click_On_Element(driver, Net_Worth_Category_DDL);
        return this;
    }

    public Personal_Details Choose_Option_In_Net_Worth_Category_DDL(){

        Utility.Click_On_Element(driver, Option_In_Net_Worth_Category_DDL);
        return this;
    }

    public Personal_Details Click_On_Current_Job_Professions_DDL (){

        Utility.Click_On_Element(driver, Current_Job_Professions_DDL);
        return this;
    }


    public Personal_Details Choose_Option_In_Current_Job_Professions_DDL(){

        Utility.Click_On_Element(driver, Option_In_Current_Job_Professions_DDL);
        return this;
    }

    public Personal_Details Click_On_Amount_Field(){

        Utility.Click_On_Element(driver, Amount_Field);
        return this;
    }
    public Personal_Details Click_On_Amount_Entry_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Amount_Entry_Field);
        return this;
    }


    public Personal_Details Enter_Education_Amount(){

        Utility.Send_Data(driver,Amount_Entry_Field,"10000");
        return this;
    }

    public Personal_Details Press_On_Title_Of_Amount_Entry_Field(){

        Utility.Click_On_Element(driver, Title_Of_Amount_Entry_Field);
        return this;
    }


    public Personal_Details Press_On_Job_Information_Field() {
        Utility.Click_On_Element(driver, Job_Information_Field);
        return this;

    }

    public Personal_Details Press_On_First_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, First_Yes_Button);
        return this;

    }
    public Personal_Details Press_On_Second_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Second_Yes_Button);
        return this;

    }
    public Personal_Details Press_On_Third_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Third_Yes_Button);
        return this;

    }
    public Personal_Details Press_On_Fourth_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Fourth_Yes_Button);
        return this;

    }public Personal_Details Press_On_Fifth_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Fifth_Yes_Button);
        return this;

    }


    public Personal_Details Press_On_First_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, First_No_Button);
        return this;

    }

    public Personal_Details Press_On_Second_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Second_No_Button);
        return this;

    }

    public Personal_Details Press_On_Third_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Third_No_Button);
        return this;

    }

    public Personal_Details Press_On_Fourth_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Fourth_No_Button);
        return this;

    }
    public Personal_Details Press_On_Fifth_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Fifth_No_Button);
        return this;

    }


    public Personal_Details Press_On_No_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, No_Button);
        return this;

    }

    public Personal_Details Press_On_Yes_Button() throws InterruptedException {
        Utility.Click_On_Element(driver, Yes_Button);
        return this;

    }

    public Personal_Details Press_On_Ok_Button_In_Amount_Entry_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Ok_Button_In_Amount_Entry_Field);
        return this;

    }


    public Personal_Details Press_On_Confirm_And_Next_Button() {
        Utility.Click_On_Element(driver, Confirm_And_Next_Button);
        return this;

    }


    public Personal_Details Press_On_City_DDL() throws InterruptedException {
        Utility.Click_On_Element(driver, City_DDL);
        return this;

    }

    public Personal_Details Enter_City_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }

    public Personal_Details Choose_Abha_City() {
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }


    public Personal_Details Press_On_Bank_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Bank_DDL);
        return this;

    }


    public Personal_Details Choose_Bank_Albilad() {
        Utility.Click_On_Element(driver, Albilad_In_Bank_DDL);
        return this;

    }




    public Personal_Details Press_Ok_Confirm_Button() {
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Ok_Confirm_Button);
        return this;

    }


    public Personal_Details Enter_Bank_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }


}















