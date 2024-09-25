package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver = null;
    public RegistrationPage (WebDriver driver) {
		// TODO Auto-generated constructor stub
    	 this.driver = driver;
         PageFactory.initElements(driver, this);
     }

}



