import Authentication.Login_Flow_Page;
import Authentication.OTP;
import Order_Flow.Accurate_Results;
import Order_Flow.Walkthrough;
import Pages.Allow_Notification_Popup;
import Pages.Home_Page;
import Pages.Products_List;
import Pages.TestBase;
import Utilities.Json_Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Engine_Test extends TestBase {
    @BeforeMethod
    public void Reach_Login() throws InterruptedException, FileNotFoundException {

        new Allow_Notification_Popup(driver).Press_Allow_Button();
        new Login_Flow_Page(driver).Press_Continue_Button();
        new Login_Flow_Page(driver).Press_Allow_Location();
        new Login_Flow_Page(driver).Press_Skip_Button();
        new Login_Flow_Page(driver).Press_Join_Button();
    }

    //TODO: User salary equal and commitment equal and application data questions are
   @Test
    public void User_one_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User1.NationalID")).Press_On_Title().Press_Continue_Button().Press_Number_One().
                Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User1.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_No_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User1.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User1.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_On_TAMAWAL_Button().Press_Pay_With_Credit()
                .Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
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
