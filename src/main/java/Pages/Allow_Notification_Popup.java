package Pages;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Allow_Notification_Popup {
    private AppiumDriver driver;
private final By Allow_Button= By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    private final By Do_Not_Allow_Button= By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]");







    public Allow_Notification_Popup(AppiumDriver driver){

        this.driver = driver;

    }


public void Press_Allow_Button(){

    Utility.Click_On_Element(driver, Allow_Button);
}

public void Press_Do_Not_Allow_Button() {

    driver.findElement(Do_Not_Allow_Button).click();
}

}
