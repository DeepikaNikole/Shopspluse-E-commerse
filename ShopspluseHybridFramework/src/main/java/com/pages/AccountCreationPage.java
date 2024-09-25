package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.DriverUtils;
import com.utilities.DriverUtils.*;

public class AccountCreationPage {
    WebDriver driver;

    // Constructor
    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "field-id_gender-1")
    WebElement titleMr;

    @FindBy(id = "field-id_gender-2")
    WebElement titleMrs;

    @FindBy(xpath = "//input[@name='firstname']")
	
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='birthday']")
    WebElement birthdate;

    @FindBy(xpath = "//input[@name='optin']")
    WebElement offersCheckbox;
    
    @FindBy(xpath = "//input[@name='psgdpr']")
    WebElement termsCheckbox;  

    @FindBy(xpath = "//input[@name='customer_privacy']")
    WebElement privacyCheckbox;

    @FindBy(xpath = "//input[@name='newsletter']")
    WebElement newsletterCheckbox;
    
//   @FindBy(xpath = "//input[@name='psgdpr']")
//  WebElement termsCheckbox;  

    @FindBy(xpath = "//button[@data-link-action='save-customer']")
    WebElement submitButton;

    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
    WebElement registerLink;
 // Method to click the registration link
    public void clickRegisterLink() {
        
        DriverUtils.waitForElement(driver,driver.findElement(By.xpath("//a[@data-link-action='display-register-form']")));
        
        // Click the registration link
        registerLink.click();
    }

    // Method to fill in the account creation form
    public void fillAccountCreationForm(String fName, String lName, String mail, String pwd) {
        try {
            // Wait for the page to load and the firstName field to be visible
            DriverUtils.waitForElement(driver, firstName);  // Increased timeout

            // Fill in the form
            //titleMrs.click();
            titleMr.click();
            firstName.sendKeys(fName);
            lastName.sendKeys(lName);
            email.sendKeys(mail);
            password.sendKeys(pwd);
           // birthdate.sendKeys(bdate);

////            // Select checkboxes
////            if (!offersCheckbox.isSelected()) {
////                offersCheckbox.click();
////                
////               
////                
////            }
////            
////            
////            if (!offersCheckbox.isSelected()) {
////                termsCheckbox.click();
////            }
////            if (!privacyCheckbox.isSelected()) {
////                privacyCheckbox.click();
////            }
////            if (!newsletterCheckbox.isSelected()) {
////                newsletterCheckbox.click();
////            }
//
//            
//            
            // Select checkboxes
            if (!offersCheckbox.isSelected()) {
                offersCheckbox.click();
            }
            if (!privacyCheckbox.isSelected()) {
                privacyCheckbox.click();
            }
            if (!newsletterCheckbox.isSelected()) {
                newsletterCheckbox.click();
            }
            if (!termsCheckbox.isSelected()) {  // Ensure terms and conditions are checked
                termsCheckbox.click();
            }
            
            submitButton.click();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to fill the account creation form due to: " + e.getMessage());
        }
    }

	public void fillAccountCreationForm(String firstName2, String lastName2, String email2, String password2,
			String password3) {
		// TODO Auto-generated method stub
		
	}
}
//package com.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.utilities.DriverUtils;
//
//public class AccountCreationPage {
//    WebDriver driver;
//
//    // Constructor
//    public AccountCreationPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    // Locators
//    @FindBy(id = "field-id_gender-1")
//    WebElement titleMr;
//
////    @FindBy(id = "field-id_gender-2")
////    WebElement titleMrs;
//
//    @FindBy(xpath = "//input[@name='firstname']")
//    WebElement firstName;
//
//    @FindBy(xpath = "//input[@name='lastname']")
//    WebElement lastName;
//
//    @FindBy(xpath = "//input[@name='email']")
//    WebElement email;
//
//    @FindBy(xpath = "//input[@name='password']")
//    WebElement password;
//
//    @FindBy(xpath = "//input[@name='optin']")
//    WebElement offersCheckbox;
//    
//    @FindBy(xpath = "//input[@name='psgdpr']")
//    WebElement termsCheckbox;
//
//    @FindBy(xpath = "//input[@name='customer_privacy']")
//    WebElement privacyCheckbox;
//
//    @FindBy(xpath = "//input[@name='newsletter']")
//    WebElement newsletterCheckbox;
//
//    @FindBy(xpath = "//button[@data-link-action='save-customer']")
//    WebElement submitButton;
//
//    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
//    WebElement registerLink;
//
//    // Method to click the registration link
//    public void clickRegisterLink() {
//        DriverUtils.waitForElement(driver, registerLink); // Simplified call
//        registerLink.click();
//    }
//
//    // Method to fill in the account creation form
//    public void fillAccountCreationForm(String fName, String lName, String mail, String pwd) {
//        try {
//            // Wait for the page to load and the firstName field to be visible
//            DriverUtils.waitForElement(driver, firstName, 60);  // Increased timeout
//
//            // Fill in the form
//            titleMr.click();
//            firstName.sendKeys(fName);
//            lastName.sendKeys(lName);
//            email.sendKeys(mail);
//            password.sendKeys(pwd);
//
//            // Select checkboxes
//            if (!offersCheckbox.isSelected()) {
//                offersCheckbox.click();
//            }
//            if (!privacyCheckbox.isSelected()) {
//                privacyCheckbox.click();
//            }
//            if (!newsletterCheckbox.isSelected()) {
//                newsletterCheckbox.click();
//            }
//            if (!termsCheckbox.isSelected()) {
//                termsCheckbox.click();
//            }
//
//            // Submit the form
//            submitButton.click();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("Failed to fill the account creation form due to: " + e.getMessage());
//        }
//    }
//}
