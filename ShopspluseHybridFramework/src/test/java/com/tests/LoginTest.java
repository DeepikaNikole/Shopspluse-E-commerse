//package com.tests;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import com.base.BaseClass;
//import com.pages.DashBoardPage;
//import com.pages.Login;
//import com.pages.LogoutPage;
//
//public class LoginTest extends BaseClass {
//    private Login lp;
//    private DashBoardPage dp;
//    private LogoutPage logoutPage;
//
//    @BeforeClass
//    public void setup() throws Exception {
//        initialization();  // Initialize WebDriver
//        lp = new Login(driver);  // Initialize the Login page
//    }
//
//    @Test(priority = 1)
//    public void testValidLogin() throws Exception {
//        dp = lp.validLogin();  
//        Assert.assertEquals(driver.getTitle(), "My Store", "Login was not successful");
//    }
//
//    //@Test(priority = 2, dependsOnMethods = "testValidLogin")
//    @Test(priority = 2)
//    public void testLogout() {
//      logoutPage = dp.clickSignOutLink();
//    	//logoutPage=lp.clickSignOutLink();
//        Assert.assertTrue(logoutPage.isLoggedOut(), "Logout was not successful");
//    }
//
//    @AfterClass
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();  
//        }
//    }
//}

package com.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.DashBoardPage;
import com.pages.Login;

public class LoginTest extends BaseClass {
    private Login lp;
    private DashBoardPage dp;
   // private LogoutPage;

    @BeforeClass
    public void setup() throws Exception {
        initialization();  // Initialize WebDriver
        lp = new Login(driver);  // Initialize the Login page
    }

    @Test(priority = 1)
    public void testValidLogin() throws Exception {
        dp = lp.validLogin();  
        //Assert.assertNotNull(dp, "Dashboard page is not initialized");
        Assert.assertEquals(driver.getTitle(), "My Store", "Login was not successful");
    }

    
    
    
    
//    @Test(priority = 2, dependsOnMethods = "testValidLogin")
//    public void testLogout() {
//        Assert.assertNotNull(dp, "Dashboard page is not initialized");
//        logoutPage = dp.clickSignOutLink();
//        Assert.assertNotNull(logoutPage, "Logout page is not initialized");
//        Assert.assertTrue(logoutPage.isLoggedOut(), "Logout was not successful");
//    }
//
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();  
        }
    }
}

