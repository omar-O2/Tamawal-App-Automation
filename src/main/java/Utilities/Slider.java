package Utilities;
import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import Pages.AppiumInitializer;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.*;

import java.time.Duration;
import java.util.Collections;

import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;

public class Slider {


    /*  public static void SlideToSpecificNumber(AppiumDriver driver, boolean scrollRight, By elementLocator, int maxSwipes) {

          for (int i = 0; i < maxSwipes; i++) {
              try {
                  if (driver.findElement(elementLocator).isDisplayed()) {
                      System.out.println("Element found after " + i + " swipes!");
                      return;
                  }
              } catch (NoSuchElementException e) {

  // Locate the slider element
                  WebElement slider = driver.findElement(AppiumBy.xpath(
                          "//android.view.View[@content-desc=\"Loan Amount Slider\"]"));

  // Get the location and size of the slider
                  Point sliderLocation = slider.getLocation();
                  Dimension sliderSize = slider.getSize();

  // Calculate start and end points
                  int startX = sliderLocation.getX() + 10;
                  int endX = sliderLocation.getX() + sliderSize.getWidth() - 10;
                  int y = sliderLocation.getY() + (sliderSize.getHeight() / 2);

  // Create the sliding action sequence
                  PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

                  Sequence swipe = new Sequence(finger, 0)
                          .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, y))
                          .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                          .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, y))
                          .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

  // Perform the action
                  driver.perform(Collections.singletonList(swipe));


              }
          }
      }*/
    public static void slideUntilElementAppears(AppiumDriver driver) {
       /* // Slider element
        WebElement slider = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@content-desc=\"Loan Amount Slider\"]"));

        // Slider dimensions
        Point sliderLocation = slider.getLocation();
        Dimension sliderSize = slider.getSize();

        int originalStartX = sliderLocation.getX() + 10;
        int endX = sliderLocation.getX() + sliderSize.getWidth() - 10;
        int y = sliderLocation.getY() + (sliderSize.getHeight() / 2);

        int swipeDuration = 8000; // 1 second swipe
        int maxAttempts = 30;
        int partialSwipeDistance = (endX - originalStartX) / 5;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int startX = originalStartX;

        for (int i = 0; i < maxAttempts; i++) {
            // Perform swipe
            int partialEndX = Math.min(startX + partialSwipeDistance, endX);
            Sequence swipe = new Sequence(finger, 0)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, y))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(finger.createPointerMove(Duration.ofMillis(swipeDuration),
                            PointerInput.Origin.viewport(), partialEndX, y))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Collections.singletonList(swipe));

            // Wait for UI to update
            try {
                Thread.sleep(1000); // Adjust if needed based on animation delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Check for dynamic element with target content-desc
            List<WebElement> views = driver.findElements(AppiumBy.className("android.view.View"));
            for (WebElement view : views) {
                String desc = view.getAttribute("content-desc");
                if ("367,104".equals(desc)) {
                    System.out.println("Element with value 367,104 appeared after " + (i + 1) + " swipes");
                    return;
                }
            }

            // Prepare for next swipe
            startX = partialEndX;

            if (startX >= endX) {
                System.out.println("Reached end of slider, resetting to start.");
                startX = originalStartX;
            }
        }

        throw new RuntimeException("Element with content-desc '367,104' not found after " + maxAttempts + " swipes.");
    }*/
        // Wait for slider to be present
        WebElement slider = driver.findElement(AppiumBy.accessibilityId("100.0, Loan Amount Slider"));

// Get slider dimensions
        Point sliderLocation = slider.getLocation();
        Dimension sliderSize = slider.getSize();
        int startX = sliderLocation.getX() + (int)(sliderSize.getWidth() * 0.1); // 10% from left
        int endX = sliderLocation.getX() + (int)(sliderSize.getWidth() * 0.9); // 90% from left
        int y = sliderLocation.getY() + (sliderSize.getHeight() / 2); // vertical center

// Swipe until ¥200,000 appears
        String currentValue;
        String cleanValue = ""; // Declare outside loop
        int maxAttempts = 30;
        int attempts = 0;

        do {
            // Perform swipe (right to increase value)
            new TouchAction((PerformsTouchActions) driver)
                    .press(PointOption.point(startX, y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                    .moveTo(PointOption.point(endX, y))
                    .release()
                    .perform();

            // Get and clean current value
            currentValue = slider.getAttribute("content-desc").split(",")[0];
            cleanValue = currentValue.replaceAll("[^0-9]", "").replaceAll("\\.0$", "");

            System.out.println("Current slider value: " + cleanValue);

            attempts++;
            if (attempts >= maxAttempts) {
                throw new RuntimeException("Failed to reach ¥200,000 after " + maxAttempts + " swipes");
            }

        } while (!cleanValue.equals("200000")); // Now cleanValue is accessible here

        System.out.println("Successfully set loan amount to ¥200,000");
    }
}



