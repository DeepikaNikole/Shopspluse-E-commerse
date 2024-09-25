package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilities.DriverUtils;
import com.utilities.PropertyUtils;

public class Login {
    WebDriver driver = null;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-email")
    WebElement username;

    @FindBy(id = "field-password")
    WebElement password;

    @FindBy(id = "submit-login")
    WebElement loginBtn;

    

    @FindBy(css = "a.logout.hidden-sm-down")
    WebElement signOutLink;

    public DashBoardPage validLogin() {
        DriverUtils.waitForElement(driver, username);
        DriverUtils.waitForElement(driver, password);

        try {
            String uname = PropertyUtils.readProperty("username");
            String pass = PropertyUtils.readProperty("loginPassword");

//            // Debugging lines
//            System.out.println("Username from properties: " + uname);
//            System.out.println("Password from properties: " + pass);

            if (uname == null || uname.isEmpty() || pass == null || pass.isEmpty()) {
                throw new IllegalArgumentException("Username or password cannot be null or empty");
            }

            username.sendKeys(uname);
            password.sendKeys(pass);
        } catch (Exception e) {
            System.err.println("Error during login: " + e.getMessage());
            e.printStackTrace();
            return null; // Return null or handle accordingly
        }

        DriverUtils.waitForElement(driver, loginBtn);
        loginBtn.click();

        return new DashBoardPage(driver);
    }

    public void loginToApplication(String uname, String pass) {
        username.sendKeys(uname);
        password.sendKeys(pass);
        loginBtn.click();
    }



//
//
 // Example: Adding the method to the `Login` class if necessary
    public LogoutPage navigateToSignOutPage() {
        // Assuming the sign-out link is on the login page
        DriverUtils.waitForElement(driver, signOutLink);
        signOutLink.click();
        return new LogoutPage(driver);
    }

    }
//
//

