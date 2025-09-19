import Authentication.Login_Flow_Page;
import Authentication.OTP;
import Authentication.PIN_Page_AND_Biometrics;
import Order_Flow.Accurate_Results;
import Order_Flow.Checkout;
import Order_Flow.Payment;
import Order_Flow.Walkthrough;
import Pages.*;
import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
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
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User1.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User1.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User1.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

               new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");



    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User2.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User2.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User2.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User2.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User2.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User3.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User3.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User3.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User3.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User3.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User4.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User4.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User4.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User4.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User4.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");



    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User5.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User5.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User5.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User1.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User5.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User5.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User6.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User6.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User6.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User6.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User6.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User7.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User8.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User8.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User8.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User8.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User8.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User9.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User9.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User9.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User9.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User9.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Ten_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User10.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User10.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User10.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User10.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User10.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eleven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User11.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twelve_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User12.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User13.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fourteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User14.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fifteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User15.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Sixteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User16.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Seventeen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User17.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Eighteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User18.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Nineteen_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User19.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User20.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_one_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User21.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User22.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User23.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User24.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User25.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    @Test
    //TODO: User salary equal and commitment equal and application data questions are
    public void User_Twenty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User26.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User27.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User28.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Twenty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User29.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User30.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_One_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User31.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User32.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User33.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User34.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test

    public void User_Thirty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User35.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User36.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User37.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User38.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Thirty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User39.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User40.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_One_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User41.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Two_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User42.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Three_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User43.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Four_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User44.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Five_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User45.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");



    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Six_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User46.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Seven_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User47.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }

    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Eight_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User48.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Forty_Nine_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User49.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");

    }
    //TODO: User salary equal and commitment equal and application data questions are
    @Test
    public void User_Fifty_Case() throws FileNotFoundException, InterruptedException {
        new Login_Flow_Page(driver).Press_On_NationalID().Enter_NationalID(Json_Data.Get_json_Data("Engine_Test", "User50.NationalID")).Press_On_Title().Press_Continue_Button();
        new OTP(driver).Press_On_OTP_Field().Enter_OTP();
        new PIN_Page_AND_Biometrics(driver).Press_Number_One().Press_Number_Two().Press_Number_Three().Press_Number_Four();
        new Walkthrough(driver).Press_Start_Discovery_Button().Press_On_Salary_Field().Enter_Salary(Json_Data.Get_json_Data("Engine_Test", "User7.Salary")).Press_No_Button().Press_On_Select_Loan_Purpose().Choose_Loan_Purpose().Scroll_To_Tamawal_Button().Press_Preferred_Amount_Field().Enter_Preferred_Amount(Json_Data.Get_json_Data("Engine_Test", "User7.Preferred_Amount")).Choose_Loan_Period();
        new Product_Details(driver).Press_On_Tamawal_Button();
        new Products_List(driver).Press_On_Close_Compare_Tour_Guide_Icon();
        new Home_Page(driver).Press_On_Details_Button().Press_On_Tamawal_Button().Press_On_Job_Information_Field().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_Sector_DDL()
                .Enter_Sector_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Sector")).Press_On_Next_Button().Press_On_Entity_DDL().Enter_Entity_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Entity")).Press_On_Next_Button().Press_On_Job_DDL().Enter_Job_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Job"))
                .Press_On_Next_Button().Press_On_Fifth_Yes_Button().Press_On_Next_Button().Press_On_City_DDL().Enter_City_Data(Json_Data.Get_json_Data("Engine_Test", "User7.City")) .Press_On_Next_Button().Press_On_Bank_DDL().Enter_Bank_Data(Json_Data.Get_json_Data("Engine_Test", "User7.Bank")).Press_On_Next_Button()
                .Press_On_Hiring_Date_Field().Choose_Date().Press_Ok_In_Date().Press_On_Next_Button().Press_Ok_Confirm_Button().Press_Back_To_Summary_Button().Press_Confirm_Data_Provided_Is_Accurate().Press_On_TAMAWAL_Button();
        new Checkout(driver).Press_On_Confirmation_Checkbox().Press_On_Pay_Now_Button().Press_Pay_With_Credit();

        new Payment(driver).Press_On_Name_On_Card_Field().Enter_Name_On_Card("Omar Radwan").Press_On_Card_Number_Field().Enter_Card_Number("4111111111111111").Press_On_Month_Of_Card().Enter_Month_Of_Card("0828").Press_On_CVV_Of_Card().Enter_CVV_Of_Card("123").Press_On_Pay_SAR_20_Button().Press_On_Submit_Button()
                .Press_On_Continue_Button().Press_On_TAMAWAL_In_Accurate();
        new OTP(driver).Press_On_OTP_Field();
        new OTP(driver).Enter_OTP();
        new Accurate_Results(driver).Press_Track_Order_Button();

        Utility.Assert(driver,By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]"),false,"Yess");


    }



}
