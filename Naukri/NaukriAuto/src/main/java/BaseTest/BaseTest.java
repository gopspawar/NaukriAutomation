package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import pageObjects.JobSearchPage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait; // Add WebDriverWait instance
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected JobSearchPage jobSearchPage;
    protected ProfilePage profilePage; // Add ProfilePage instance
   
    @BeforeClass
    public void setUp() {
        // Setup WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: maximize the window
        driver.get("https://www.naukri.com");

        // Initialize WebDriverWait with a timeout of 10 seconds
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Initialize page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        jobSearchPage = new JobSearchPage(driver);
        profilePage = new ProfilePage(driver); // Initialize ProfilePage
    }

    // Example usage of explicit wait inside a test method or page object
    public void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
