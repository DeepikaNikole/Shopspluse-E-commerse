package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashBoardPage;
import com.pages.HomePage;
import com.pages.Login;
import com.pages.LogoutPage;

public class LogoutTest extends BaseClass {
	  HomePage homePage;
	    private Login lp;
	    private DashBoardPage dp;
	    LogoutPage logout;
//public void setup() throws Exception {
//    initialization();
//    loginPage = new Login(driver);
//    dashboardPage = loginPage.validLogin();
//    
//    logout = new LogoutPage(driver);
//}


@BeforeClass
public void setup() {
    try {
        initialization();  // Initialize WebDriver
        lp = new Login(driver);  // Initialize the Login page with driver
        dp = lp.validLogin();  // Perform login and navigate to Dashboard
        homePage = new HomePage(driver);  // Initialize HomePage after login
        
        logout = new LogoutPage(driver);
        //homePage= new ChromeDriver(driver);
        Assert.assertNotNull(homePage, "HomePage should not be null after initialization.");
    } catch (Exception e) {
        System.err.println("Setup failed: " + e.getMessage());
        e.printStackTrace();
    }
}
@Test
public void testSignOut() {
    //logout = new LogoutPage(driver);
    logout.clickSignOut();
    
   
    String pageTitle = driver.getTitle();
    System.out.println("Page Title: " + pageTitle);

    // Add assertions here to verify sign-out was successful
}
//
//@AfterMethod
//public void tearDown() {
//    if (driver != null) {
//        driver.quit();
//    }
//}
}