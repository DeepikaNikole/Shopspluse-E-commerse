//
//	
//	
//	
//	package com.pages;
//
//	import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.ElementClickInterceptedException;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.support.FindBy;
//	import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//
//import com.utilities.DriverUtils;
//
//	public class HomePage {
//	    WebDriver driver = null;
//
//	    // Constructor for HomePage class
//	    public HomePage(WebDriver driver) {
//	        this.driver = driver;
//	        PageFactory.initElements(driver, this);
//	    }
//
//	    // Locating the "Clothes" link using the @FindBy annotation
//	    @FindBy(css = "a.dropdown-item[href='https://javabykiran.in/other/shopsplus/3-clothes']")
//	    WebElement clothesLink;
//	    
//	    
//	    
//	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/4-men' and text()='Men']")
//	    WebElement menLink;
//            
//	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/brand/1-studio-design']") 
//	    WebElement studioDesignLink;
//
//	    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/1-home_default/hummingbird-printed-t-shirt.jpg']")
//	    WebElement hummingbirdTShirtImage;
//
//	  
//	    @FindBy(css = "button.btn.btn-primary.add-to-cart[data-button-action='add-to-cart']")
//	     WebElement addToCartButton;
//
//	    @FindBy(css = "a.btn.btn-primary[href*='cart?action=show']")
//	    private WebElement proceedToCheckoutButton;
//
//	    
//	    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/order']")
//	   WebElement orderLink;
//
//	    
//	    @FindBy(css = "button.btn.btn-primary.continue.float-xs-right[name='confirm-addresses']")
//	    WebElement continueButton;
//
//	    
//	    @FindBy(css = "button.continue.btn.btn-primary.float-xs-right[name='confirmDeliveryOption'][value='1']")
//	    WebElement continueDeliveryOptionButton;
//
//	    @FindBy(xpath = "//input[@id='payment-option-3']")
//	    WebElement cashOnDeliveryRadioButton;
//
//	    
//	    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
//	    WebElement termsAndConditionsCheckbox;
//	    
//	    @FindBy(css = "button.btn.btn-primary.center-block[type='submit']")
//	    WebElement placeOrderButton;
//
//
//	    
//	    public ClothesPage clickClothesLink() {
//	       
//	        DriverUtils.waitForElement(driver, clothesLink);
//	        
//	        // Click on the Clothes link
//	        clothesLink.click();
//	        
//	        // Return the next page object
//	        return new ClothesPage(driver);
//	    }
//	    
//	    
//	 // Method to get the "Men" link WebElement
//	    public WebElement getMenLinkElement() {
//	        return menLink;
//	    }
//	 
////	    public void clickMenLink() {
////	    //DriverUtils.waitForElement(driver, menLink);
////	        
////	     // DriverUtils.waitForElement(driver, clothesLink);
////	      DriverUtils.waitForElement(driver, menLink);
////	        menLink.click();
////	    }
//	    //public void clickMenLink() {
//	        // Debug: Output the page source to verify if the element is present
////	        String pageSource = ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML").toString();
////	        System.out.println("Page Source: " + pageSource);
////
////	        // Wait for the Men link element to be visible
////	        try {
////	            DriverUtils.waitForElement(driver, menLink);
////	        } catch (TimeoutException e) {
////	            System.err.println("Timeout while waiting for Men link to be visible.");
////	            throw e;
////	        }
////
////	        // Click on the Men link
////	       // menLink.click();
////	    }
//	    	
////	    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menLink);
////	         try {
////	             DriverUtils.waitForElement(driver, menLink);// Wait for the Men link to be clickable
////	             menLink.click();
////	         } catch (TimeoutException e) {
////	             System.err.println("Timeout while waiting for Men link to be visible and clickable.");
////	             throw e;
////	         }
//	    
//	    public void clickMenLink() {
//	        // Scroll into view if the "Men" link is not visible
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menLink);
//	        try {
//	            DriverUtils.waitForElement(driver, menLink); // Wait for the Men link to be clickable
//	            menLink.click();  // Click on the Men link
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for Men link to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//	    
//	    public void clickStudioDesignLink() {
//	        // Scroll into view if the "Studio Design" link is not visible
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", studioDesignLink);
//	        try {
//	            DriverUtils.waitForElement(driver, studioDesignLink); // Wait for the Studio Design link to be clickable
//	            studioDesignLink.click();  // Click on the Studio Design link
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for Studio Design link to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//           
//	    
//	    public void clickHummingbirdTShirtImage() {
//	        // Scroll into view if the image is not visible
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hummingbirdTShirtImage);
//	        try {
//	            DriverUtils.waitForElement(driver, hummingbirdTShirtImage); // Wait for the image to be clickable
//	            hummingbirdTShirtImage.click();  // Click on the image
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Hummingbird T-Shirt image to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//
//	    
//	    public void clickAddToCartButton() {
//	        try {
//	            DriverUtils.waitForElement(driver, addToCartButton); // Wait for the button to be clickable
//	            addToCartButton.click();  // Click on the Add to Cart button
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Add to Cart button to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//	    public void clickProceedToCheckout() {
//	        try {
//	            // Wait for the modal to be visible
//	            DriverUtils.waitForElement(driver, proceedToCheckoutButton);
//	            proceedToCheckoutButton.click();  // Click on the "Proceed to checkout" button
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Proceed to Checkout button in the modal.");
//	            throw e;  
//	        }
//	    }
//	    public void clickOrderLink() {
//	        try {
//	            DriverUtils.waitForElement(driver, orderLink); // Wait for the order link to be clickable
//	            orderLink.click();  // Click on the order link
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Order link to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	            
//	        }
//	        
//	        
//	    }
//
//	    public void clickContinueButton() {
//	        try {
//	            DriverUtils.waitForElement(driver, continueButton); // Wait for the Continue button to be clickable
//	            continueButton.click();  // Click on the Continue button
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Continue button to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//
//	    
//	    public void clickContinueDeliveryOptionButton() {
//	        try {
//	            // Scroll into view if necessary
//	        	
//	        	
//	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueDeliveryOptionButton);
//	            
//	            // Wait for the button to be clickable
//	            DriverUtils.waitForElement(driver, continueDeliveryOptionButton); 
//	            
//	            // Click on the Continue button
//	            continueDeliveryOptionButton.click();  
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Continue button to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
////	    public void selectCashOnDeliveryOption() {
////	        try {
////	            // Scroll into view if necessary
////	        	
////	        	WebElement cashOnDeliveryRadioButton = driver.findElement(By.id("payment-option-3"));
////	        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cashOnDeliveryRadioButton);
////
////	           // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cashOnDeliveryRadioButton);
////	            
////	            // Wait for the radio button to be clickable
////	           // DriverUtils.waitForElement(driver, cashOnDeliveryRadioButton); 
////	            DriverUtils.waitForElement(driver, cashOnDeliveryRadioButton);
////	            
////	            // Click on the radio button
////	            cashOnDeliveryRadioButton.click();  
////	        } catch (TimeoutException e) {
////	            System.err.println("Timeout while waiting for the Cash on Delivery radio button to be visible and clickable.");
////	            throw e;  // Throw exception to handle it in the calling test method
////	        }
////	    }
//
//	    
////
////	    public void selectCashOnDeliveryOption() {
////	        try {
////	            WebDriverWait wait = new WebDriverWait(driver, 500);
////	            DriverUtils.waitForElement(driver, cashOnDeliveryRadioButton);
////
////	            // Wait for the radio button to be visible and clickable
////	            wait.until(ExpectedConditions.visibilityOf(cashOnDeliveryRadioButton));
////	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cashOnDeliveryRadioButton);
////	            wait.until(ExpectedConditions.elementToBeClickable(cashOnDeliveryRadioButton));
////	            cashOnDeliveryRadioButton.click();
////	            
////	            System.out.println("Cash on Delivery radio button selected.");
////	        } catch (TimeoutException e) {
////	            System.err.println("Timeout while waiting for the Cash on Delivery radio button.");
////	            throw e;
////	        }
////	    }
////	    
////	   
//	    public void selectCashOnDeliveryOption() {
//	        try {
//	            // Increase the timeout to 10 seconds
//	        	  WebDriverWait wait = new WebDriverWait(driver, 50);
//	        	  DriverUtils.waitForElement(driver,cashOnDeliveryRadioButton);
//
//	            // Wait for the radio button to be visible and clickable
//	            WebElement codOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("payment-option-3")));
//	            wait.until(ExpectedConditions.elementToBeClickable(codOption));
//
//	            // Scroll into view using JavaScript
//	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", codOption);
//
//	            try {
//	                // Attempt to click normally
//	            	DriverUtils.waitForElement(driver, codOption);
//	                codOption.click();
//	                System.out.println("Cash on Delivery radio button clicked successfully.");
//	            } catch (ElementClickInterceptedException e) {
//	                System.err.println("Regular click failed. Trying JavaScript click.");
//	                // Use JavaScript click as a fallback
//	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", codOption);
//	                System.out.println("Cash on Delivery radio button clicked using JavaScript.");
//	            }
//
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Cash on Delivery radio button.");
//	            captureDebugInformation(); // Capture debug info for further inspection
//	            throw e; // Re-throw to propagate the failure
//	        } catch (Exception e) {
//	            System.err.println("An unexpected error occurred: " + e.getMessage());
//	            captureDebugInformation();
//	            throw e; // Propagate the exception
//	        }
//	    }
//
//	    // Capture debug information if an exception occurs
//	    private void captureDebugInformation() {
//	        try {
//	            // Print the current HTML source
//	            String pageSource = driver.getPageSource();
//	            System.out.println("Current page source captured for debugging: " + pageSource);
//
//	            // Capture a screenshot
//	            TakesScreenshot screenshot = (TakesScreenshot) driver;
//	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//	            // Update the path to a valid directory on your machine
//	            File destFile = new File("path/to/save/screenshot.png"); // Update with your path
//	            FileUtils.copyFile(srcFile, destFile);
//	            System.out.println("Screenshot captured and saved for debugging.");
//	        } catch (Exception e) {
//	            System.err.println("Failed to capture debug information: " + e.getMessage());
//	        }
//	    }
//	
//	
//	    public void clickPlaceOrderButton() {
//	        try {
//	            // Scroll into view if necessary
//	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
//	            
//	            // Wait for the button to be clickable
//	            DriverUtils.waitForElement(driver, placeOrderButton);
//	            
//	            // Click on the "Place order" button
//	            placeOrderButton.click();
//	        } catch (TimeoutException e) {
//	            System.err.println("Timeout while waiting for the Place Order button to be visible and clickable.");
//	            throw e;  // Throw exception to handle it in the calling test method
//	        }
//	    }
//
//
//	     }

package com.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.DriverUtils;

public class HomePage {
    WebDriver driver = null;

    // Constructor for HomePage class
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locating elements using the @FindBy annotation
    @FindBy(css = "a.dropdown-item[href='https://javabykiran.in/other/shopsplus/3-clothes']")
    WebElement clothesLink;

    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/4-men' and text()='Men']")
    WebElement menLink;

    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/brand/1-studio-design']")
    WebElement studioDesignLink;

    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/1-home_default/hummingbird-printed-t-shirt.jpg']")
    WebElement hummingbirdTShirtImage;

    @FindBy(css = "button.btn.btn-primary.add-to-cart[data-button-action='add-to-cart']")
    WebElement addToCartButton;

    @FindBy(css = "a.btn.btn-primary[href*='cart?action=show']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/order']")
    WebElement orderLink;

    @FindBy(css = "button.btn.btn-primary.continue.float-xs-right[name='confirm-addresses']")
    WebElement continueButton;

    @FindBy(css = "button.continue.btn.btn-primary.float-xs-right[name='confirmDeliveryOption'][value='1']")
    WebElement continueDeliveryOptionButton;

  @FindBy(xpath = "//input[@id='payment-option-3']")
   WebElement cashOnDeliveryRadioButton;
    
//    @FindBy(id = "payment-option-3")
//    WebElement cashOnDeliveryRadioButton;
//    
//    @FindBy(xpath = "//input[@id='payment-option-3']")
//    WebElement cashOnDeliveryRadioButton;
//    

  @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
  
   // @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement termsAndConditionsCheckbox;

    @FindBy(css = "button.btn.btn-primary.center-block[type='submit']")
    WebElement placeOrderButton;

    
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/5-women'])[2]")
     WebElement womenLink;
    
    
    
    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/6-accessories']")
     WebElement accessoriesLink;
    
    //Assories 
    
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/7-stationery'])[2]")
     WebElement secondStationeryLink;
    
    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/18-home_default/mountain-fox-notebook.jpg']")
     WebElement mountainFoxNotebookImage;
//    
//    @FindBy(className = "btn-primary add-to-cart")
//    WebElement addToCartBtn;

    
    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
     WebElement addToCartBtn;
    
    
    @FindBy(xpath = "(//a[@href='//javabykiran.in/other/shopsplus/cart?action=show'])[2]")
     WebElement secondCartLink;
   
    
    @FindBy(xpath = "//a[@href='https://javabykiran.in/other/shopsplus/order']")
    WebElement checkOut;

    
    @FindBy(xpath = "//button[@class='btn btn-primary continue float-xs-right']")
    private WebElement continueButton2;

    
    //Homeassoseries
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/8-home-accessories'])[2]")
     WebElement secondHomeAccessoriesLink;

    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/9-home_default/mountain-fox-cushion.jpg']")
    WebElement mountainFoxCushionImage;

    //Art
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/9-art'])[1]")
     WebElement artLink;
    
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/9-art'])[2]")
    private WebElement secondArtLink;

    
    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/3-home_default/the-best-is-yet-to-come-framed-poster.jpg']")
    WebElement framedPosterImage;
    
//    @FindBy(xpath = "//img[@src='https://javabykiran.in/other/shopsplus/3-home_default/the-best-is-yet-to-come-framed-poster.jpg' and @alt='The best is yet to come\' Framed poster']")
//    private WebElement framedPosterImage;



    // Unified method for the entire sequence of steps
    public void completePurchaseProcess() throws Throwable {
        try {
            // Step 1: Click on the Clothes link
            DriverUtils.waitForElement(driver, clothesLink);
            clothesLink.click();

            // Step 2: Click on the Men link
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menLink);
            DriverUtils.waitForElement(driver, menLink);
            menLink.click();

            // Step 3: Click on the Studio Design link
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", studioDesignLink);
            DriverUtils.waitForElement(driver, studioDesignLink);
            studioDesignLink.click();

            // Step 4: Click on the Hummingbird T-Shirt image
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hummingbirdTShirtImage);
            DriverUtils.waitForElement(driver, hummingbirdTShirtImage);
            hummingbirdTShirtImage.click();

            // Step 5: Click on the Add to Cart button
            DriverUtils.waitForElement(driver, addToCartButton);
            addToCartButton.click();

            // Step 6: Click on the Proceed to Checkout button in the modal
            DriverUtils.waitForElement(driver, proceedToCheckoutButton);
            proceedToCheckoutButton.click();

            // Step 7: Click on the Order link
            DriverUtils.waitForElement(driver, orderLink);
            orderLink.click();

            // Step 8: Click the first Continue button
            DriverUtils.waitForElement(driver, continueButton);
            continueButton.click();

            // Step 9: Click the Continue button for delivery options
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueDeliveryOptionButton);
            DriverUtils.waitForElement(driver, continueDeliveryOptionButton);
            continueDeliveryOptionButton.click();

//            // Step 10: Select the Cash on Delivery payment option
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cashOnDeliveryRadioButton);
//            DriverUtils.waitForElement(driver, cashOnDeliveryRadioButton);
//          //  DriverUtils.waitForElement(driver,);
//            cashOnDeliveryRadioButton.click();
            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    cashOnDeliveryRadioButton.click();
                    break; // exit loop if click is successful
                } catch (Exception e) {
                    System.out.println("Retrying click on Cash on Delivery option...");
                    Thread.sleep(1000); // Wait before retrying
                }
            }


         // Step 11: Accept terms and conditions
            
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", termsAndConditionsCheckbox);
//            DriverUtils.waitForElement(driver, termsAndConditionsCheckbox);
//
//            Thread.sleep(1000); // Wait for 1 second after the element is found
//            termsAndConditionsCheckbox.click(); // Attempt to click on the checkbox
            
            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    termsAndConditionsCheckbox.click();
                    break; // exit loop if click is successful
                } catch (Exception e) {
                    System.out.println("Retrying click on Cash on Delivery option...");
                    Thread.sleep(1000); // Wait before retrying
                }
            }
            
            


            // Step 12: Click on the Place Order button
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
            DriverUtils.waitForElement(driver, placeOrderButton);
            placeOrderButton.click();

            System.out.println("Purchase process completed successfully.");
        } catch (TimeoutException e) {
            System.err.println("Timeout occurred during one of the steps: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure
        } catch (ElementClickInterceptedException e) {
            System.err.println("Element click intercepted: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure
        }
    }

    // Capture debug information if an exception occurs
    private void captureDebugInformation() {
        try {
            // Print the current HTML source
            String pageSource = driver.getPageSource();
            System.out.println("Current page source captured for debugging: " + pageSource);

            // Capture a screenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            // Update the path to a valid directory on your machine
            File destFile = new File("path/to/save/screenshot.png"); // Update with your path
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot captured and saved for debugging.");
        } catch (Exception e) {
            System.err.println("Failed to capture debug information: " + e.getMessage());
        }
    }
    
    
    
    public void womensCloths() throws Exception {
    	
    	
    	   try {
    	        // Step 1: Click on the Clothes link
    	        DriverUtils.waitForElement(driver, clothesLink);
    	        clothesLink.click();

    	        // Step 2: Click on the Women link (change made here)
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenLink);
    	        DriverUtils.waitForElement(driver, womenLink);
    	        womenLink.click();
    	
    	
    	
    	        
    	        // Step 3: Click on the Studio Design link
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", studioDesignLink);
    	        DriverUtils.waitForElement(driver, studioDesignLink);
    	        studioDesignLink.click();

    	        // Step 4: Click on the Hummingbird T-Shirt image
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hummingbirdTShirtImage);
    	        DriverUtils.waitForElement(driver, hummingbirdTShirtImage);
    	        hummingbirdTShirtImage.click();

    	        // Step 5: Click on the Add to Cart button
    	        DriverUtils.waitForElement(driver, addToCartButton);
    	        addToCartButton.click();

    	        // Step 6: Click on the Proceed to Checkout button in the modal
    	        DriverUtils.waitForElement(driver, proceedToCheckoutButton);
    	        proceedToCheckoutButton.click();

    	        // Step 7: Click on the Order link
    	        DriverUtils.waitForElement(driver, orderLink);
    	        orderLink.click();

    	        // Step 8: Click the first Continue button
    	        DriverUtils.waitForElement(driver, continueButton);
    	        continueButton.click();

    	        // Step 9: Click the Continue button for delivery options
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueDeliveryOptionButton);
    	        DriverUtils.waitForElement(driver, continueDeliveryOptionButton);
    	        continueDeliveryOptionButton.click();

    	        // Step 10: Select the Cash on Delivery payment option
    	        for (int attempt = 0; attempt < 3; attempt++) {
    	            try {
    	                cashOnDeliveryRadioButton.click();
    	                break; // exit loop if click is successful
    	            } catch (Exception e) {
    	                System.out.println("Retrying click on Cash on Delivery option...");
    	                Thread.sleep(1000); // Wait before retrying
    	            }
    	        }

    	        // Step 11: Accept terms and conditions
    	        for (int attempt = 0; attempt < 3; attempt++) {
    	            try {
    	                termsAndConditionsCheckbox.click();
    	                break; // exit loop if click is successful
    	            } catch (Exception e) {
    	                System.out.println("Retrying click on Terms and Conditions checkbox...");
    	                Thread.sleep(1000); // Wait before retrying
    	            }
    	        }

    	        // Step 12: Click on the Place Order button
    	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
    	        DriverUtils.waitForElement(driver, placeOrderButton);
    	        placeOrderButton.click();

    	        System.out.println("Purchase process completed successfully for Women's section.");
    	    } catch (TimeoutException e) {
    	        System.err.println("Timeout occurred during one of the steps: " + e.getMessage());
    	        captureDebugInformation(); // Capture debug info for further inspection
    	        throw e; // Re-throw to propagate the failure
    	    } catch (ElementClickInterceptedException e) {
    	        System.err.println("Element click intercepted: " + e.getMessage());
    	        captureDebugInformation(); // Capture debug info for further inspection
    	        throw e; // Re-throw to propagate the failure
    	    } catch (Exception e) {
    	        System.err.println("An unexpected error occurred: " + e.getMessage());
    	        captureDebugInformation(); // Capture debug info for further inspection
    	        throw e; // Re-throw to propagate the failure
    	    }
    	
    	
    	
    }
    
    
    
    public void clickAccessoriesLink() throws Exception {
        // Wait until accessoriesLink is clickable before clicking
      //  WebDriverWait wait = new WebDriverWait(driver, 10);
        DriverUtils.waitForElement(driver, accessoriesLink);
       // accessoriesLinkElement = wait.until(ExpectedConditions.elementToBeClickable(accessoriesLink));
        
        accessoriesLink.click();
        
        // Wait until the secondStationeryLink is clickable before interacting
        //WebElement secondStationeryLinkElement = wait.until(ExpectedConditions.elementToBeClickable(secondStationeryLink));
        DriverUtils.waitForElement(driver, secondStationeryLink);
        // Scroll the secondStationeryLink into view using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", secondStationeryLink);
        
        // Click the secondStationeryLink after it is scrolled into view
        secondStationeryLink.click();
          DriverUtils.waitForElement(driver, mountainFoxNotebookImage);
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mountainFoxNotebookImage);
        mountainFoxNotebookImage.click();
        DriverUtils.waitForElement(driver, addToCartBtn);
        addToCartBtn.click();
        DriverUtils.waitForElement(driver, secondCartLink);
        secondCartLink.click();
        checkOut.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueButton2);
        continueButton2.click();
        
        DriverUtils.waitForElement(driver, continueDeliveryOptionButton);
        continueDeliveryOptionButton.click();
        
        
        
        // Step 10: Select the Cash on Delivery payment option
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                cashOnDeliveryRadioButton.click();
                break; // exit loop if click is successful
            } catch (Exception e) {
                System.out.println("Retrying click on Cash on Delivery option...");
                Thread.sleep(1000); // Wait before retrying
            }
        }

        // Step 11: Accept terms and conditions
        try {
            // Step 11: Accept terms and conditions with retry mechanism
            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    termsAndConditionsCheckbox.click();
                    break; // exit loop if click is successful
                } catch (ElementClickInterceptedException | NoSuchElementException e) {
                    System.out.println("Retrying click on Terms and Conditions checkbox...");
                    Thread.sleep(1000); // Wait before retrying
                }
            }

            // Step 12: Click on the Place Order button
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
            DriverUtils.waitForElement(driver, placeOrderButton);
            placeOrderButton.click();

            System.out.println("Purchase process completed successfully for Women's section.");

        } catch (TimeoutException e) {
            System.err.println("Timeout occurred during one of the steps: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (ElementClickInterceptedException e) {
            System.err.println("Element click intercepted: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (NoSuchElementException e) {
            System.err.println("Element not found: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure
        }


    }
    
    public void clickHomeAccessoriesLink() throws Exception {
        // Wait until accessoriesLink is clickable before clicking
      //  WebDriverWait wait = new WebDriverWait(driver, 10);
        DriverUtils.waitForElement(driver, accessoriesLink);
       // accessoriesLinkElement = wait.until(ExpectedConditions.elementToBeClickable(accessoriesLink));
        
        accessoriesLink.click();
        secondHomeAccessoriesLink.click();
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",mountainFoxCushionImage );
        DriverUtils.waitForElement(driver, mountainFoxCushionImage);
        mountainFoxCushionImage.click();
        
        
        
        DriverUtils.waitForElement(driver, addToCartBtn);
        addToCartBtn.click();
        DriverUtils.waitForElement(driver, secondCartLink);
        secondCartLink.click();
        checkOut.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueButton2);
        continueButton2.click();
        
        DriverUtils.waitForElement(driver, continueDeliveryOptionButton);
        continueDeliveryOptionButton.click();
        
        
        
        // Step 10: Select the Cash on Delivery payment option
        for (int attempt = 0; attempt < 3; attempt++) {
            try {
                cashOnDeliveryRadioButton.click();
                break; // exit loop if click is successful
            } catch (Exception e) {
                System.out.println("Retrying click on Cash on Delivery option...");
                Thread.sleep(1000); // Wait before retrying
            }
        }

        // Step 11: Accept terms and conditions
        try {
            // Step 11: Accept terms and conditions with retry mechanism
            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    termsAndConditionsCheckbox.click();
                    break; // exit loop if click is successful
                } catch (ElementClickInterceptedException | NoSuchElementException e) {
                    System.out.println("Retrying click on Terms and Conditions checkbox...");
                    Thread.sleep(1000); // Wait before retrying
                }
            }

            // Step 12: Click on the Place Order button
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
            DriverUtils.waitForElement(driver, placeOrderButton);
            placeOrderButton.click();

            System.out.println("Purchase process completed successfully for Women's section.");

        } catch (TimeoutException e) {
            System.err.println("Timeout occurred during one of the steps: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (ElementClickInterceptedException e) {
            System.err.println("Element click intercepted: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (NoSuchElementException e) {
            System.err.println("Element not found: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure

        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            captureDebugInformation(); // Capture debug info for further inspection
            throw e; // Re-throw to propagate the failure
        }


    }
    
    
    public void artAssoseries() throws Exception {
    	
    	
    	DriverUtils.waitForElement(driver, artLink);
    	artLink.click();
    	
    	secondArtLink.click();
    	
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", framedPosterImage);
         DriverUtils.waitForElement(driver, framedPosterImage);
         framedPosterImage.click();
         
         
         DriverUtils.waitForElement(driver, addToCartBtn);
         addToCartBtn.click();
         DriverUtils.waitForElement(driver, secondCartLink);
         secondCartLink.click();
         checkOut.click();
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueButton2);
         continueButton2.click();
         
         DriverUtils.waitForElement(driver, continueDeliveryOptionButton);
         continueDeliveryOptionButton.click();
         
         
         
         // Step 10: Select the Cash on Delivery payment option
         for (int attempt = 0; attempt < 3; attempt++) {
             try {
                 cashOnDeliveryRadioButton.click();
                 break; // exit loop if click is successful
             } catch (Exception e) {
                 System.out.println("Retrying click on Cash on Delivery option...");
                 Thread.sleep(1000); // Wait before retrying
             }
         }

         // Step 11: Accept terms and conditions
         try {
             // Step 11: Accept terms and conditions with retry mechanism
             for (int attempt = 0; attempt < 3; attempt++) {
                 try {
                     termsAndConditionsCheckbox.click();
                     break; // exit loop if click is successful
                 } catch (ElementClickInterceptedException | NoSuchElementException e) {
                     System.out.println("Retrying click on Terms and Conditions checkbox...");
                     Thread.sleep(1000); // Wait before retrying
                 }
             }

             // Step 12: Click on the Place Order button
             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
             DriverUtils.waitForElement(driver, placeOrderButton);
             placeOrderButton.click();

             System.out.println("Purchase process completed successfully for Women's section.");

         } catch (TimeoutException e) {
             System.err.println("Timeout occurred during one of the steps: " + e.getMessage());
             captureDebugInformation(); // Capture debug info for further inspection
             throw e; // Re-throw to propagate the failure

         } catch (ElementClickInterceptedException e) {
             System.err.println("Element click intercepted: " + e.getMessage());
             captureDebugInformation(); // Capture debug info for further inspection
             throw e; // Re-throw to propagate the failure

         } catch (NoSuchElementException e) {
             System.err.println("Element not found: " + e.getMessage());
             captureDebugInformation(); // Capture debug info for further inspection
             throw e; // Re-throw to propagate the failure

         } catch (Exception e) {
             System.err.println("An unexpected error occurred: " + e.getMessage());
             captureDebugInformation(); // Capture debug info for further inspection
             throw e; // Re-throw to propagate the failure
         }


     }
     
     
    }


