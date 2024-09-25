package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;

public class MyaccountPage {
	
	 WebDriver driver = null;

	    // Constructor for HomePage class
	    public MyaccountPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    
	    

	    // Locating elements using the @FindBy annotation
	    
	    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/my-account'])[1]")
	     WebElement myAccountLink;


	    @FindBy (xpath ="(//a[@href='https://javabykiran.in/other/shopsplus/identity'])[1]")
	    WebElement inforMation;
	    
//	    @FindBy(xpath = "//span[@class='link-item' and contains(text(), 'Addresses')]")
//	     WebElement addressesLink;
//	    
	 // Locate the anchor element by href using XPath
	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/addresses']")
	    WebElement addressesLink;
	    
	    
	    @FindBy(xpath= "(//a[@href='https://javabykiran.in/other/shopsplus/order-history'])[1]")
	    WebElement orderHistory;
	   
	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/credit-slip']")
	     WebElement creditSlipLink;
	    
	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/module/blockwishlist/lists']")
	    WebElement wishlistLink;
	    
//	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/module/psgdpr/gdpr']")
//	    WebElement gdprLink;
	    
	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/module/psgdpr/gdpr']")
	    WebElement gdprLink;

	    
	    @FindBy(xpath = "//a[@href='//javabykiran.in/other/shopsplus/module/ps_emailalerts/account']")
	     WebElement emailAlertsLink;
	    
	    // Method to click on the 'My Account' link
	    public void clickMyAccountLink() {
	    	
	    	DriverUtils.waitForElement(driver, myAccountLink);
	        myAccountLink.click();
	         DriverUtils.waitForElement(driver, inforMation);
	        inforMation.click();
	        
	        
	        DriverUtils.waitForElement(driver, addressesLink);
	        addressesLink.click();
	        
	        
	        DriverUtils.waitForElement(driver, orderHistory);
	        
	        orderHistory.click();
	        
	        DriverUtils.waitForElement(driver, creditSlipLink);
	        creditSlipLink.click();
	        
	        DriverUtils.waitForElement(driver, wishlistLink);
	        wishlistLink.click();
	        
	        
	        
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gdprLink);

	        DriverUtils.waitForElement(driver, gdprLink);
	        gdprLink.click();
	        
	        
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailAlertsLink);

	        
	        DriverUtils.waitForElement(driver, emailAlertsLink);
	        emailAlertsLink.click();
	    }





}
