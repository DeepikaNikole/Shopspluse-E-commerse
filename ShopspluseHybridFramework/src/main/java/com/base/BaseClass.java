package com.base;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertyUtils;

public class BaseClass {
    public static WebDriver driver = null;
    public static ExtentReports report = null;
    public static ExtentSparkReporter spark = null;
    public static ExtentTest test = null;

    Logger log = Logger.getLogger(BaseClass.class);

    public void initialization() throws Exception {
        System.out.println("Reading property file for browser");
        
        reportInit();
        log.info("Reading property file for browser");

        String browserName = PropertyUtils.readProperty("browser");

        if (browserName == null) {
            throw new Exception("Browser name is not specified in the properties file.");
        }

        System.out.println("Browser name: " + browserName); // Debugging
        log.info("Browser name: " + browserName);

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            default:
                throw new Exception("Unsupported browser: " + browserName);
        }

        driver.manage().window().maximize();
        driver.get(PropertyUtils.readProperty("url"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void reportInit() {
        report = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReports.html");
        report.attachReporter(spark);
    }
    
    
 
    }


