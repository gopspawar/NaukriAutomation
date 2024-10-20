package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.JobSearchPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobSearchTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    JobSearchPage jobSearchPage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");

        // Initialize page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        jobSearchPage = new JobSearchPage(driver);
    }

    @Test
    public void testJobSearch() throws InterruptedException {
        // Perform login
        loginPage.loginclick();
        loginPage.enterUsername("gopalpawar2707@gmail.com");
        loginPage.enterPassword("Pawar@2707");
        loginPage.clickLogin();

        // Search for jobs
        jobSearchPage.clickOnSearchbox();
        jobSearchPage.enterJobTitle("QA Engineer");
        jobSearchPage.selectLocation("Bangalore");
        jobSearchPage.clickSearch(); // Ensure to click search after setting the job title and location
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
