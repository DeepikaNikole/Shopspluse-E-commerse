package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashBoardPage;
import com.pages.HomePage;
import com.pages.Login;
import com.pages.MyaccountPage;

public class MyaccountTest extends BaseClass {

	
	    MyaccountPage mp;
	
	    HomePage hp;
	    Login lp;
	    DashBoardPage dp;
	    

//	    @BeforeMethod
//	    public void setup() throws Exception {
//	      
//	        lp = new Login(driver); // Initialize Login page object
//	        hp = new HomePage(driver); // Initialize HomePage page object
//	        mp= new  MyaccountPage(driver);
//	    }
//

	    @BeforeClass
	    public void setup() {
	        try {
	            initialization();  // Initialize WebDriver
	            lp = new Login(driver);  // Initialize the Login page with driver
	            dp = lp.validLogin();  // Perform login and navigate to Dashboard
	            hp = new HomePage(driver);  // Initialize HomePage after login
	            
	            mp = new MyaccountPage(driver);
	            //homePage= new ChromeDriver(driver);
	            Assert.assertNotNull(hp, "HomePage should not be null after initialization.");
	        } catch (Exception e) {
	            System.err.println("Setup failed: " + e.getMessage());
	            e.printStackTrace();
	        }
	    
	    }
	    
  @Test
  public void  MyaccountTest() {
  
	  
 
	  mp.clickMyAccountLink();
	  
	  
	
	
	
}
}
