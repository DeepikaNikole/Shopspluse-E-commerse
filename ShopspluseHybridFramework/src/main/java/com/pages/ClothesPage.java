
	package com.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class ClothesPage {

	    WebDriver driver = null;

	    // Constructor to initialize the driver
	    public ClothesPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    
	}



