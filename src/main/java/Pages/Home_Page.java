package Pages;

import Utilities.Json_Data;
import Utilities.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class Home_Page {
    public AppiumDriver driver;
    private final By Logo_Tamawal = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.ImageView[2]");
    private final By Start_Discovery_Button = AppiumBy.accessibilityId(Json_Data.Get_json_Data("Home_Page_Locators", "Start_Discovery_Button"));
    private final By Details_Button = By.xpath(Json_Data.Get_json_Data("Home_Page_Locators" , "Details_Button"));
    // AppiumBy.accessibilityId(Json_Data.Get_json_Data("Home_Page_Locators", "Details_Button"));
    private final By personal_R= By.xpath("//android.view.View[@content-desc=\"Personal Finance\n" + "APR From\n" + "4.33%\n" +
            "Monthly From\n" +
            "6,666.00\n" +
            "You saved\n" +
            "653.37\n" +
            " <1% \n" +
            "No Rating for now\n" +
            "Personals Finance\n" +
            "APR From\n" +
            "4.33%\n" +
            "Monthly From\n" +
            "6,666.00\n" +
            "You saved\n" +
            "653.37\n" +
            " <1% \n" +
            "4.0\n" +
            "Buyout Debt Repayment Product\n" +
            "APR From\n" +
            "4.33%\n" +
            "Monthly From\n" +
            "6,666.00\n" +
            "You saved\n" +
            "653.37\n" +
            " <1% \n" +
            "No Rating for now\n" +
            "Personal Refinance\n" +
            "APR From\n" +
            "4.33%\n" +
            "Monthly From\n" +
            "6,666.00\n" +
            "You saved\n" +
            "653.37\n" +
            " <1% \n" +
            "No Rating for now\n" +
            "Personal Finance\n" +
            "APR From\n" +
            "4.33%\n" +
            "Monthly From\n" +
            "6,666.00\n" +
            "You saved\n" +
            "653.37\n" +
            " <1% \n" +
            "No Rating for now\"]");











    public Home_Page(AppiumDriver driver) throws FileNotFoundException {

        this.driver= driver;
    }




public void Press_Start_Discovery_Button(){
    Utility.Click_On_Element(driver, Start_Discovery_Button);
}

public Product_Details Press_On_Details_Button() throws FileNotFoundException, InterruptedException {

    //Utility.Scroll_Down(driver);
    Utility.Scroll_Vertical_To_Element(driver,true,Details_Button,20);
        Utility.Click_On_Element(driver, Details_Button);
        return new Product_Details(driver);
}

}
