package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;

//    @FindBy(css = "a.logout.hidden-sm-down")
//    WebElement signOutLink;
//    
    @FindBy(xpath = "(//a[@href='https://javabykiran.in/other/shopsplus/?mylogout='])[1]")
    private WebElement logoutLink;


    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignOut() {
        logoutLink.click();
    }
}
