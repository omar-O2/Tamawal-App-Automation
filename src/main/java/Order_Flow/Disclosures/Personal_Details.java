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
    private final By Cancel_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Cancel_Button"));
    private final By Ok_Confirm_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Ok_Confirm_Button"));
    private final By Back_To_Summary_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "Back_To_Summary_Button"));
    private final By Accept_Terms_And_Conditions_Checkbox = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Accept_Terms_And_Conditions_Checkbox"));
    private final By Acknowledge_And_Undertake_That_All_My_Information_Is_Correct_And_My_Order_Will_Be_Canceled_In_Case_The_Information_Is_Incorrect = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Acknowledge_And_Undertake_That_All_My_Information_Is_Correct_And_My_Order_Will_Be_Canceled_In_Case_The_Information_Is_Incorrect_Checkbox"));
    //private final By I_Hereby_Declare_That_The_NationalID_Date_Of_Birth_I_Have_Provided_Is_Correct_Allow_Tamawal_to_Verify_It_If_ID_Is_Not_Correct_I_Will_Go_To_Profile_To_Disable_This_Account_Create_New_Account_With_Correct_ID_If_DoB_Is_Not_Correct_I_Will_Change_DoB_From_Profile_Checkbox
          //  = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", " I_Hereby_Declare_That_The_NationalID_Date_Of_Birth_I_Have_Provided_Is_Correct_Allow_Tamawal_to_Verify_It_If_ID_Is_Not_Correct_I_Will_Go_To_Profile_To_Disable_This_Account_Create_New_Account_With_Correct_ID_If_DoB_Is_Not_Correct_I_Will_Change_DoB_From_Profile_Checkbox"));
    private final By Confirm_Data_Provided_Is_Accurate = By.xpath(Json_Data.Get_json_Data("Application_Data_Locators", "Confirm_Data_Provided_Is_Accurate"));
    private final By TAMAWAL_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Application_Data_Locators", "TAMAWAL_Button"));
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
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Yes_Button);
        return this;

    }

    public Personal_Details Press_On_Ok_Button_In_Amount_Entry_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Ok_Button_In_Amount_Entry_Field);
        return this;

    }




    public Personal_Details Press_On_Next_Button() {
        Utility.Click_On_Element(driver, Confirm_And_Next_Button);
        return this;

    }

    public Personal_Details Press_On_Sector_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Sector_DDL);
        return this;


    }

    public Personal_Details Enter_Sector_Data(String Sector) {
        Utility.Send_Data(driver, Sector_DDL, Sector);
        Utility.Click_On_Element(driver, Government_In_Sector_DDL);
        return this;


    }

    public Personal_Details Press_On_Entity_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Personal_Details Enter_Entity_Data(String Entity) {
        Utility.Send_Data(driver, Entity_DDL, Entity);
        Utility.Click_On_Element(driver, MinistryOfTransportation_In_Entity_DDL);
        return this;

    }

    public Personal_Details Press_On_Job_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
        return this;

    }

    public Personal_Details Enter_Job_Data(String Job) {
        Utility.Send_Data(driver, Job_DDL, Job);
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
        return this;

    }

    public Personal_Details Press_On_City_DDL() throws InterruptedException {
        Thread.sleep(2000);
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


    public Personal_Details Press_On_Hiring_Date_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Date_Field);
        return this;

    }


    public Personal_Details Choose_Date() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Year_Button_Calender);
        Utility.Click_On_Element(driver, Year_2020);
        return this;


    }

    public Personal_Details Press_Ok_In_Date() throws InterruptedException {
        Thread.sleep(2000);

        Utility.Click_On_Element(driver, OK_Button_In_Date_Field);
        return this;

    }

    public Personal_Details Press_Ok_Confirm_Button() {
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Ok_Confirm_Button);
        return this;

    }

    public Personal_Details Press_Back_To_Summary_Button() {
        Utility.Click_On_Element(driver, Back_To_Summary_Button);
        return this;

    }


    public Personal_Details Press_Confirm_Data_Provided_Is_Accurate() throws InterruptedException {

        Utility.Click_On_Element(driver, Confirm_Data_Provided_Is_Accurate);
        return this;

    }



    public Personal_Details Press_On_TAMAWAL_Button() throws FileNotFoundException {
        Utility.Click_On_Element(driver, TAMAWAL_Button);
        return this;

    }

    public Personal_Details Enter_Bank_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
        return this;

    }


}















