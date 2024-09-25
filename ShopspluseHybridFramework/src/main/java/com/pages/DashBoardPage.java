package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	
	
	WebDriver driver = null;
	
	
	
	 @FindBy(css = "a.logout.hidden-sm-down")
	    WebElement signOutLink;
	 
	 
    public DashBoardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	 this.driver = driver;
         PageFactory.initElements(driver, this);
     }

    
    
    // Method to click on the "Sign out" link
    public LogoutPage clickSignOutLink() {
        signOutLink.click();
        return new LogoutPage(driver);
    }
}

