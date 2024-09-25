package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import com.base.BaseClass;

public class DriverUtils extends BaseClass {

    public static String captureScreenshot(String name) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/src/test/resourses/screenshots/" + name + ".jpg";
        File dest = new File(path);
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    // Wait for element to be visible
//    public static void waitForElement(WebDriver driver, WebElement element) {
//        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
//        
//        
//    }

    
    public static void waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 60); // Adjust timeout as needed
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
    
    
//
//    // Updated Wait for element to be clickable
//    public static void waitForElement(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50)); // Using getDriver() from BaseClass
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }




//    // Wait for element with timeout
//    public static void waitForElement(WebDriver driver, WebElement element, int timeout) {
//        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
//    }
    
//    
//    public static void waitForElement(WebDriver driver, WebElement element) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//            wait.until(ExpectedConditions.visibilityOf(element));
//        } catch (TimeoutException e) {
//            System.err.println("Element not visible after 100 seconds: " + element);
//            throw e;
//        }
//    }


