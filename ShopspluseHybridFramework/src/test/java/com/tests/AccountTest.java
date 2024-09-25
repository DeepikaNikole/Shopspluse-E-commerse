package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.AccountCreationPage;
import com.pages.HomePage;
import com.pages.Login;
import com.utilities.DriverUtils;
import com.utilities.ExcelUtils;

public class AccountTest extends BaseClass {
	
	
	
	
	  HomePage hp;
	    Login lp;

	    @BeforeMethod
	    public void setup() throws Exception {
	        initialization(); // Initialize WebDriver from BaseClass
	        lp = new Login(driver); // Initialize Login page object
	        hp = new HomePage(driver); // Initialize HomePage page object
	    }


    @Test
    public void createAccountTest() {
        // Initialize the page object
    	
    	
        AccountCreationPage accountPage = new AccountCreationPage(driver);
        
        // Step 1: Click on the registration link
        accountPage.clickRegisterLink();

        // Step 2: Fill in the registration form
        String filePath = "E:\\Selenium_ojt711\\ShopspluseHybridFramework\\AccountTestData.xlsx";
        String sheetName = "Sheet1";
        
        try {
            // Initialize ExcelUtils
            ExcelUtils excel = new ExcelUtils(filePath, sheetName);
            
            // Assuming data is in the first row
            String fName = excel.getCellData(1, 0);
            String lName = excel.getCellData(1, 1);
            String email = excel.getCellData(1, 2);
            String pwd = excel.getCellData(1, 3);
            
            // Fill the account creation form with data from Excel
            accountPage.fillAccountCreationForm(fName, lName, email, pwd);
            
            // Close the workbook
            excel.closeWorkbook();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
