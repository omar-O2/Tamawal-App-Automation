import Authentication.Login_Flow_Page;
import Authentication.OTP;
import Order_Flow.Accurate_Results;
import Order_Flow.Application_Data;
import Order_Flow.Payment;
import Order_Flow.Walkthrough;
import Pages.*;
import Utilities.Json_Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Order_Flow_Test extends TestBase {

    @BeforeMethod
    public void Reach_Login() throws InterruptedException, FileNotFoundException {

        new Allow_Notification_Popup(driver).Press_Allow_Button();
        new Login_Flow_Page(driver).Press_Continue_Button();
        new Login_Flow_Page(driver).Press_Allow_Location();
        new Login_Flow_Page(driver).Press_Skip_Button();
        new Login_Flow_Page(driver).Press_Join_Button();
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Login", "NationalIDText")).Press_On_Title().Press_Continue_Button().Press_Number_One().
                Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();

    }
    @Test //TODO: When user is logged in to app for first time after registration
    public void Valid_Order_Flow() throws FileNotFoundException, InterruptedException {
         new Walkthrough(driver).Press_Start_Discovery_Button();
        new Walkthrough(driver).Press_Lets_Begin_Button1();
        new Walkthrough(driver).Press_On_Salary_Field();
        new Walkthrough(driver).Enter_Salary("20000");
        new Walkthrough(driver).Press_Next_Button();
        new Walkthrough(driver).Press_On_Select_Loan_Purpose();
        new Walkthrough(driver).Select_Home_Improvement();
        new Walkthrough(driver).Press_Next_Button();
        new Walkthrough(driver).Press_No_Button();
        new Walkthrough(driver).Press_Next_Button();
        new Walkthrough(driver).Press_No_Button();
        new Walkthrough(driver).Press_Next_Button();
        new Walkthrough(driver).Press_Preferred_Amount_Field();
        new Walkthrough(driver).Enter_Preferred_Amount("367104");
        new Walkthrough(driver).Press_Credit_Limit_Title();
        new Walkthrough(driver).Press_Ok_And_Continue_Button();
       new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
       new Products_List(driver).Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Application_Data(driver).Press_On_Lets_Go_Button();
        new Application_Data(driver).Press_On_Job_Information_Field();
        new Application_Data(driver).Press_On_Yes_Button();
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Sector_DDL();
        new Application_Data(driver).Enter_Sector_Data("Government");
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Entity_DDL();
        new Application_Data(driver).Enter_Entity_Data("Ministry of Transportation");
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Job_DDL();
        new Application_Data(driver).Enter_Job_Data("Security Jobs");
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Yes_Button();
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_City_DDL();
        new Application_Data(driver).Enter_City_Data("Abha");
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Bank_DDL();
        new Application_Data(driver).Enter_Bank_Data("Alinma");
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_On_Hiring_Date_Field();
        new Application_Data(driver).Choose_Date();
        new Application_Data(driver).Press_Ok_In_Date();
        new Application_Data(driver).Press_On_Next_Button();
        new Application_Data(driver).Press_Ok_Confirm_Button();
        new Application_Data(driver).Press_Back_To_Summary_Button();
        new Application_Data(driver).Press_On_Confirm_All_Data_Button();
         new Application_Data(driver).Press_On_Pay_Now_Button();
        new Application_Data(driver).Press_On_TAMAWAL_Button();
        new Application_Data(driver).Press_Pay_With_Credit();
        new Payment(driver).Press_On_Name_On_Card_Field();
        new Payment(driver).Enter_Name_On_Card("Omar Radwan");
        new Payment(driver).Press_On_Card_Number_Field();
        new Payment(driver).Enter_Card_Number("4111111111111111");
        new Payment(driver).Press_On_Month_Of_Card();
        new Payment(driver).Enter_Month_Of_Card("0828");
        new Payment(driver).Press_On_CVV_Of_Card();
        new Payment(driver).Enter_CVV_Of_Card("123");
        new Payment(driver).Press_On_Pay_SAR_20_Button();
       new Payment(driver).Press_On_Submit_Button();
        new Payment(driver).Press_On_Continue_Button();
        new Accurate_Results(driver).Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Thread.sleep(3000);
        Assert.assertEquals(
                driver.findElements(By.xpath("//android.view.View[@content-desc=\"Tracking\"]")).isEmpty(),
                false,
                "No EditText elements found"
        );


    }
}
