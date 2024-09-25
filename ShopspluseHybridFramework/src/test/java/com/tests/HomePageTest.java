package com.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.ClothesPage;
import com.pages.DashBoardPage;
import com.pages.HomePage;
import com.pages.Login;
import com.utilities.DriverUtils;

public class HomePageTest extends BaseClass {

    HomePage homePage;
    private Login lp;
    private DashBoardPage dp;

    @BeforeClass
    public void setup() {
        try {
            initialization();  // Initialize WebDriver
            lp = new Login(driver);  // Initialize the Login page with driver
            dp = lp.validLogin();  // Perform login and navigate to Dashboard
            homePage = new HomePage(driver);  // Initialize HomePage after login
            //homePage= new ChromeDriver(driver);
            Assert.assertNotNull(homePage, "HomePage should not be null after initialization.");
        } catch (Exception e) {
            System.err.println("Setup failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
//  @Test
//    public void testClothesLink() {
//        ClothesPage clothesPage = homePage.clickClothesLink();  
//        Assert.assertNotNull(clothesPage, "Clothes page should not be null after clicking the link.");
//        DriverUtils.waitForElement(driver, homePage.clickMenLink());
////        homePage.clickMenLink();
        
//    @Test
//    public void testClothesLink() {
//        ClothesPage clothesPage = homePage.completePurchaseProcess();  
//        Assert.assertNotNull(clothesPage, "Clothes page should not be null after clicking the link.");
//        
//        // Wait for the Men link to be visible and clickable
//      //  DriverUtils.waitForElement(driver, homePage.getMenLinkElement()); // Assuming getMenLinkElement() returns the WebElement for the MenLink
//        homePage.completePurchaseProcess();
//        
//        
        
    @Test(priority = 1)
   public void testCompletePurchaseProcess() throws Throwable {
          try {
              // Call the method to complete the purchase process
        	//  DriverUtils.waitForElement(driver,null );
              homePage.completePurchaseProcess();
//              homePage.clickCashOnDelivery();
//              homePage.completePurchaseProcess();
  
              String actualUrl = driver.getCurrentUrl();

              // Define a regex pattern to match the base URL with dynamic query parameters
              String urlPattern = "https://javabykiran.in/other/shopsplus/order";

              // Print the actual URL for debugging
              System.out.println("Actual URL: " + actualUrl);

              // Assert that the actual URL matches the expected pattern
              Assert.assertTrue(actualUrl.matches(urlPattern), "Order confirmation URL does not match the expected pattern.");

              System.out.println("Test passed: URL matches the expected pattern.");
          } catch (Exception e) {
              // Capture any unexpected errors and print the stack trace
              e.printStackTrace();
              System.err.println("Test failed: An error occurred during the purchase process - " + e.getMessage());
              Assert.fail("Test failed due to unexpected exception: " + e.getMessage());
          }
      }
  
////        
 
 @Test(priority = 2)
 public void testWomensClothesLink() {
     try {
         // Perform actions to complete the purchase process
         homePage.womensCloths();

         // Retrieve the actual URL after completing the purchase process
         String actualUrl = driver.getCurrentUrl();

         // Define a regex pattern to match the base URL with dynamic query parameters
         String urlPattern = "https://javabykiran.in/other/shopsplus/order";

         // Print the actual URL for debugging
         System.out.println("Actual URL: " + actualUrl);

         // Assert that the actual URL matches the expected pattern
         Assert.assertTrue(actualUrl.matches(urlPattern), "Order confirmation URL does not match the expected pattern.");

         System.out.println("Test passed: URL matches the expected pattern.");
     } catch (Exception e) {
         // Capture any unexpected errors and print the stack trace
         e.printStackTrace();
         System.err.println("Test failed: An error occurred during the purchase process - " + e.getMessage());
         Assert.fail("Test failed due to unexpected exception: " + e.getMessage());
     }
 }

// 
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();  // Close the browser after the test
//        }
//    }
//}

@Test(priority = 3)
public void assesorisStationaryLink() throws Exception {
	
	homePage.clickAccessoriesLink();
	
}

@Test(priority = 4)
public void assesorisHomeLink() throws Exception {
	
	homePage.clickHomeAccessoriesLink();
	
}

	
@Test(priority = 5)
public void artHomeLink() throws Exception {
	
	homePage.artAssoseries();
	
}

}

