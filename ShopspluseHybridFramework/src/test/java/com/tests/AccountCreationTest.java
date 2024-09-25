package com.tests;
//
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//
import com.base.BaseClass;
import com.pages.AccountCreationPage;
import com.pages.Login;
import com.utilities.PropertyUtils;

public class AccountCreationTest extends BaseClass {
//
    AccountCreationPage accountCreationPage;
    Login lp;
//
    
    @BeforeMethod
    public void setup() throws Exception {
        System.out.println("Running setup method");
        initialization();  // Initialize WebDriver
        reportInit();      // Initialize reporting (if necessary)
        lp = new Login(driver); 
        accountCreationPage = new AccountCreationPage(driver); // Initialize AccountCreationPage object
//        
    }
//
//    
//    
    @Test(priority = 1)
    public void testClickRegisterLink() {
        System.out.println("Starting test for clicking the register link");

        try {
            // Navigate to the appropriate page where the registration link is located
            driver.get(PropertyUtils.readProperty("url"));

            // Click the registration link
            accountCreationPage.clickRegisterLink();

            // Add an assertion to verify that the registration form is displayed
//            boolean isFormDisplayed = accountCreationPage.firstName.isDisplayed();
//            Assert.assertTrue(isFormDisplayed, "The registration form was not displayed after clicking the register link.");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }


    @Test(priority = 2)
    public void testAccountCreation() {
        System.out.println("Starting account creation test");
        
      //
        
        
//        
        
        
      
        try {
            // Fetch data from properties file
            String firstName = PropertyUtils.readProperty("firstName");
            String lastName = PropertyUtils.readProperty("lastName");
            String email = PropertyUtils.readProperty("email");
            String password = PropertyUtils.readProperty("password");
            String birthdate = PropertyUtils.readProperty("birthdate");
            String expectedTitle = PropertyUtils.readProperty("expectedTitle");

            // Fill the account creation form
            accountCreationPage.fillAccountCreationForm(firstName, lastName, email, password);

            // Add an assertion to verify successful account creation
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Account creation was not successful!");

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }
//
  @Test(priority = 3)
    public void testAccountCreationSkipExample() {
        System.out.println("Starting account creation skip example test");
       throw new SkipException("Skipping account creation test case");
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    
}

