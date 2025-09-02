package Utilities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Utili {

    public static void Click(AppiumDriver driver, By locator)  {

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();


    }

    public static void SEnd(AppiumDriver driver, By locator, String sss){

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(sss);
    }

    public static void Send(AppiumDriver driver,By locator, String sss){

        new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(sss);

    }
    public static void Wait(AppiumDriver driver,By locator,Boolean Expected,String Message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals(
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).isEmpty(),
                Expected,Message);

    }
}
