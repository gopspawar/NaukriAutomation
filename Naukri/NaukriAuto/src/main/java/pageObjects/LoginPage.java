package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Initialize WebDriverWait with a 10-second timeout
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    // Method to click on login button in navigation
    public void loginclick() {
        By loginButton1 = By.xpath("//a[@class='nI-gNb-lg-rg__login']");
        // Wait until the element is clickable before clicking
        wait.until(ExpectedConditions.elementToBeClickable(loginButton1)).click();
    }

    // Method to enter username
    public void enterUsername(String user) {
        By username = By.xpath("//input[@placeholder='Enter your active Email ID / Username'][1]");
        // Wait until the element is visible before sending keys
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        usernameField.sendKeys(user);
    }

    // Method to enter password
    public void enterPassword(String pass) {
        By password = By.xpath("//input[@type='password']");
        // Wait until the element is visible before sending keys
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        passwordField.sendKeys(pass);
    }

    // Method to click login button
    public void clickLogin() throws InterruptedException {
        By loginButton = By.xpath("//button[@type='submit']");
        // Wait until the element is clickable before clicking
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        Thread.sleep(10000);
    }
    
    public void clickOnProfile() throws InterruptedException {
    	By profileclick= By.xpath("//img[@alt='naukri user profile img']");
    	wait.until(ExpectedConditions.elementToBeClickable(profileclick)).click();
        Thread.sleep(5000);
    }
        
        public void clickLogout() throws InterruptedException {
            By loginButton = By.xpath("//a[@title='Logout']");
            // Wait until the element is clickable before clicking
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
            Thread.sleep(10000);    
    }
}
