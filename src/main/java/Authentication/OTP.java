package Authentication;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class OTP {
    public AppiumDriver driver;
    private final By OTP_Field= By.xpath("//android.widget.EditText");
    private final By Resend_Button= By.xpath("//android.widget.Button[@content-desc=\"Resend code?\"]");













    public OTP (AppiumDriver driver){

        this.driver = driver;
    }

    public OTP Press_On_OTP_Field(){
        Utility.Click_On_Element(driver,OTP_Field);
        return this;
    }

    public void Enter_OTP(){
        Utility.Send_Data(driver,OTP_Field,"1234");
    }



}
