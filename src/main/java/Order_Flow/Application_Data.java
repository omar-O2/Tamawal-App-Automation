package Order_Flow;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Application_Data {
    public AppiumDriver driver;
    private final By Lets_Go_Button = By.xpath("//android.widget.Button[@content-desc=\"Ok, let’s go!\"]");

    private final By Job_Information_Field = By.xpath("//android.view.View[@content-desc=\"Job info\n" +
            "Need to fill\"]");
    private final By Yes_Button = By.xpath("//android.view.View[@content-desc=\"Yes\"]");
    private final By No_Button = By.xpath("//android.view.View[@content-desc=\"No\"]");
    private final By Sector_DDL = By.xpath("//android.widget.EditText");
    private final By Government_In_Sector_DDL = By.xpath("//android.view.View[@content-desc=\"Government\"]");
    private final By Entity_DDL = By.xpath("//android.widget.EditText");
    private final By MinistryOfTransportation_In_Entity_DDL = By.xpath("//android.view.View[@content-desc=\"Ministry of Transportation\"]");
    private final By Job_DDL = By.xpath("//android.widget.EditText");
    private final By Security_Man_In_Job_DDL = By.xpath("//android.view.View[@content-desc=\"Security Jobs - Security Man\"]");
    private final By City_DDL = By.xpath("//android.widget.EditText");
    private final By Abha_In_City_DDL = By.xpath("//android.view.View[@content-desc=\"Abha\"]");
    private final By Bank_DDL = By.xpath("//android.widget.EditText");
    private final By Alinma_In_Bank_DDL = By.xpath("//android.view.View[@content-desc=\"Alinma Bank\"]");
    private final By Date_Field = By.xpath("//android.widget.EditText");
    private final By Specific_Date = By.xpath("//android.widget.Button[@content-desc=\"22, Tuesday, April 22, 2025, Today\"]");
    private final By Year_Button_Calender = By.xpath("//android.widget.Button[@content-desc=\"Select year\"]");
    private final By Year_2020 = By.xpath("//android.widget.Button[@content-desc=\"2020\"]");


    private final By OK_Button_In_Date_Field = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    private final By Next_Button = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    private final By Cancel_Button = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
    private final By Ok_Confirm_Button = By.xpath("//android.widget.Button[@content-desc=\"Ok, Confirm\"]");
    private final By Back_To_Summary_Button = By.xpath("//android.view.View[@content-desc=\"Back to Summary\"]");
    private final By Confirm_All_Data_Button = By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]");
    private final By Pay_Now_Button = By.xpath("//android.widget.Button[@content-desc=\"Pay Now!\"]");
    private final By Pay_With_Credit = By.xpath("//android.view.View[@content-desc=\"International / Credit Cards\"]");
    private final By TAMAWAL_Button = By.xpath("//android.widget.Button[@content-desc=\"TAMAWAL\"]");






    public Application_Data(AppiumDriver driver) {
        this.driver = driver;
    }

    public void Press_On_Lets_Go_Button() {
        Utility.Click_On_Element(driver, Lets_Go_Button);
    }


    public void Press_On_Job_Information_Field() {
        Utility.Click_On_Element(driver, Job_Information_Field);
    }

    public void Press_On_Yes_Button() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Yes_Button);
    }

    public void Press_On_Next_Button() {
        Utility.Click_On_Element(driver, Next_Button);
    }

    public void Press_On_Sector_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Sector_DDL);

    }

    public void Enter_Sector_Data(String Sector) {
        Utility.Send_Data(driver, Sector_DDL, Sector);
        Utility.Click_On_Element(driver, Government_In_Sector_DDL);

    }

    public void Press_On_Entity_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
    }

    public void Enter_Entity_Data(String Entity) {
        Utility.Send_Data(driver, Entity_DDL, Entity);
        Utility.Click_On_Element(driver, MinistryOfTransportation_In_Entity_DDL);
    }

    public void Press_On_Job_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Entity_DDL);
    }

    public void Enter_Job_Data(String Job) {
        Utility.Send_Data(driver, Job_DDL, Job);
        Utility.Click_On_Element(driver, Security_Man_In_Job_DDL);
    }

    public void Press_On_City_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, City_DDL);
    }

    public void Enter_City_Data(String City) {
        Utility.Send_Data(driver, City_DDL, City);
        Utility.Click_On_Element(driver, Abha_In_City_DDL);
    }


    public void Press_On_Bank_DDL() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Bank_DDL);
    }


    public void Enter_Bank_Data(String Bank) {
        Utility.Send_Data(driver, Job_DDL, Bank);
        Utility.Click_On_Element(driver, Alinma_In_Bank_DDL);
    }


    public void Press_On_Hiring_Date_Field() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Date_Field);
    }


    public void Choose_Date() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Click_On_Element(driver, Year_Button_Calender);
        Utility.Click_On_Element(driver, Year_2020);

    }

    public void Press_Ok_In_Date() throws InterruptedException {
        Thread.sleep(2000);

        Utility.Click_On_Element(driver, OK_Button_In_Date_Field);
    }

    public void Press_Ok_Confirm_Button() {
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Ok_Confirm_Button);
    }

    public void Press_Back_To_Summary_Button() {
        Utility.Click_On_Element(driver, Back_To_Summary_Button);
    }


    public void Press_On_Confirm_All_Data_Button() {
        Utility.Scroll_Down(driver);
        Utility.Click_On_Element(driver, Confirm_All_Data_Button);
    }

    public void Press_On_Pay_Now_Button(){
        Utility.Click_On_Element(driver, Pay_Now_Button);
    }

    public void Press_Pay_With_Credit(){
        Utility.Click_On_Element(driver, Pay_With_Credit);
    }

    public void Press_On_TAMAWAL_Button() {
        Utility.Click_On_Element(driver, TAMAWAL_Button);
    }


}















