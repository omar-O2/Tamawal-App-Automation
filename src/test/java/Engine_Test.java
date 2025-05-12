import Authentication.Login_Flow_Page;
import Authentication.OTP;
import Authentication.PIN_Page_AND_Biometrics;
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
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User1.NationalID")).Press_On_Title().Press_Continue_Button();
       new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User1.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_No_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User1.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User1.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User2.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User2.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_No_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User2.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User2.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User3.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User3.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_No_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User3.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User3.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User4.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User4.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User4.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User4.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User5.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User5.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User5.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User1.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User6.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User6.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User6.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User6.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User7.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User8.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User8.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User8.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User8.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User9.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User9.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User9.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User9.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Ten_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User10.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User10.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User10.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User10.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eleven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User11.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User11.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User11.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User11.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User11.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User11.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User11.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User11.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twelve_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User12.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User12.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User12.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User12.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User12.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User12.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User12.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User12.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User13.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User13.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User13.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User13.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User13.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User13.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User13.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User13.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fourteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User14.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User14.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User14.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User14.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User14.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User14.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User14.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User14.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fifteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User15.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User15.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User15.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User15.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User15.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User15.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User15.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User15.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Sixteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User16.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User16.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User16.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User16.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User16.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User16.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User16.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User16.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Seventeen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User17.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User17.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User17.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User17.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User17.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User17.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User17.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User17.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eighteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User18.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User18.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User18.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User18.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User18.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User18.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User18.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User18.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Nineteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User19.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User19.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User19.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User19.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User19.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User19.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User19.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User19.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User20.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User20.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User20.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User20.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User20.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User20.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User20.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User20.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_one_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User21.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User21.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User21.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User21.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User21.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User21.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User21.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User21.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User22.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User22.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User22.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User22.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User22.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User22.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User22.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User22.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User23.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User23.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User23.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User23.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User23.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User23.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User23.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User23.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User24.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User24.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User24.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User24.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User24.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User24.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User24.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User24.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User25.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User25.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User25.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User25.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User25.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User25.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User25.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User25.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User26.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User26.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User26.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User26.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User26.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User26.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User26.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User26.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User27.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User27.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User27.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User27.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User27.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User27.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User27.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User27.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User28.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User28.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User28.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User28.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User28.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User28.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User28.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User28.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User29.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User29.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User29.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User29.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User29.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User29.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User29.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User29.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User30.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User30.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User30.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User30.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User30.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User30.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User30.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User30.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_One_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User31.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User31.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User31.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User31.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User31.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User31.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User31.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User31.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User32.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User32.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User32.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User32.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User32.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User32.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User32.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User32.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User33.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User33.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User33.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User33.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User33.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User33.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User33.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User33.Bank")).Press_On_Next_Button()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User33.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User33.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User34.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User34.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User34.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User34.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User34.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User34.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User34.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User34.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User35.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User35.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User35.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User35.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User35.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User35.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User35.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User35.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User36.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User36.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User36.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User36.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User36.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User36.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User36.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User36.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User37.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User37.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User37.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User37.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User37.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User37.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User37.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User37.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User38.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User38.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User38.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User38.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User38.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User38.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User38.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User38.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User39.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User39.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User39.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User39.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User39.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User39.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User39.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User39.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User40.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User40.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User40.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User40.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User40.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User40.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User40.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User40.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_One_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User41.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User41.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User41.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User41.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User41.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User41.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User41.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User41.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User42.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User42.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User42.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User42.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User42.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User42.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User42.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User42.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User43.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User43.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User43.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User43.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User43.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User43.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User43.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User43.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User44.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User44.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User44.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User44.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User44.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User44.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User44.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User44.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User45.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User45.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User45.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User45.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User45.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User45.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User45.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User45.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User46.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User46.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User46.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User46.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User46.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User46.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User46.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User46.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User47.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User47.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User47.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User47.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User47.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User47.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User47.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User47.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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

    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User48.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User48.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User48.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User48.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User48.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User48.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User48.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User48.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User49.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User49.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User49.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User49.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User49.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User49.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User49.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User49.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fifty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User50.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four().Press_Ignore_Button();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_Lets_Begin_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User50.Salary")).Press_Next_Button().Press_On_Select_Loan_Purpose().Select_Home_Improvement()
                .Press_Next_Button().Press_No_Button().Press_Next_Button().Press_No_Button().Press_Next_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User50.Preferred_Amount")).Press_Credit_Limit_Title().Press_Ok_And_Continue_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon().Press_On_Home_Page_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Lets_Go_Button().Press_On_Job_Information_Field().Press_On_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User50.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User50.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User50.Job"))
                .Press_On_Next_Button().Press_On_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User50.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User50.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_On_Confirm_All_Data_Button().Press_On_Pay_Now_Button().Press_Pay_With_Credit()
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
