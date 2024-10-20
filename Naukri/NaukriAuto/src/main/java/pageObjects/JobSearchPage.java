package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JobSearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public JobSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set timeout to 10 seconds
    }

    // Method to enter job title
    public void enterJobTitle(String title) throws InterruptedException {
        By jobTitle = By.xpath("//input[@placeholder='Enter keyword / designation / companies']"); // Replace with actual locator
        wait.until(ExpectedConditions.visibilityOfElementLocated(jobTitle)); // Wait for visibility
        driver.findElement(jobTitle).clear(); // Clear any existing text
        driver.findElement(jobTitle).sendKeys(title);
        Thread.sleep(5000);
        
        
    }

    // Method to click the search button
    public void clickSearch() throws InterruptedException {
        By searchButton = By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-search']"); // Replace with actual locator
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)); // Wait until clickable
        driver.findElement(searchButton).click();
        Thread.sleep(5000);
    }


        
 // Method to select experience from a custom dropdown
    public void selectExperience(String experience) throws InterruptedException {
        // Assuming the experienceFilter opens a dropdown when clicked
        By experienceFilter = By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-expand-more']"); // Replace with the actual element ID
        wait.until(ExpectedConditions.visibilityOfElementLocated(experienceFilter)); // Wait for visibility
        driver.findElement(experienceFilter).click(); // Click to open the dropdown

        // Now select the option based on the visible text
        By experienceOption = By.xpath("//li[@title='" + experience + "']"); // Adjust based on the actual HTML structure
        wait.until(ExpectedConditions.elementToBeClickable(experienceOption)); // Wait for the option to be clickable
        driver.findElement(experienceOption).click(); // Click the desired option
        Thread.sleep(5000); // Add sleep to observe the change, can be removed or reduced
    }
        
     // Method to select location filter
        public void selectLocation(String location) throws InterruptedException {
            By locationFilter = By.xpath("//input[@placeholder='Enter location']"); // Replace with actual locator
            wait.until(ExpectedConditions.visibilityOfElementLocated(locationFilter)); // Wait for visibility
            driver.findElement(locationFilter).clear(); // Clear any existing text
            driver.findElement(locationFilter).sendKeys(location);
            driver.findElement(locationFilter).sendKeys(Keys.ENTER);
            
            Thread.sleep(10000);
        }
        
        // Method to click login button
        public void clickOnSearch() throws InterruptedException {
            By loginButton = By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-search']");
            // Wait until the element is clickable before clicking
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
            Thread.sleep(10000);
        }
        
        public void clickOnSearchbox() throws InterruptedException {
        	By searchBox = By.xpath("//span[@class='nI-gNb-sb__placeholder nI-gNb-sb__placeholder--prefill']");
        	wait.until(ExpectedConditions.elementToBeClickable(searchBox)).click();
        	Thread.sleep(3000);
        }
        
     // Method to select freshness from a custom dropdown
        public void selectFreshness(String freshnessOptionText) throws InterruptedException {
            // Locate the freshness dropdown button
            By freshnessButton = By.xpath("//button[@id='filter-freshness']"); // Button to open the dropdown
            wait.until(ExpectedConditions.elementToBeClickable(freshnessButton)); // Wait for the button to be clickable
            driver.findElement(freshnessButton).click(); // Click to open the freshness dropdown

            // Locate the option in the dropdown based on the provided text (e.g., "Last 1 day", "Last 2 days")
            By freshnessOption = By.xpath("//span[text()='" + freshnessOptionText + "']"); // Adjust based on the actual structure
            wait.until(ExpectedConditions.elementToBeClickable(freshnessOption)); // Wait for the option to be clickable
            driver.findElement(freshnessOption).click(); // Click the desired freshness option

            Thread.sleep(5000); // Add sleep to observe the change (can be removed or adjusted)
        }
     // Method to select a job title based on user-defined input  (//button[@id='apply-button'])[1]
        public void selectJobTitle(String jobTitleText) throws InterruptedException {
            // Create dynamic XPath based on the provided job title
            By jobTitle = By.xpath("//a[@title='" + jobTitleText + "']");

            // Wait for the element to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(jobTitle));

            // Click on the job title link
            driver.findElement(jobTitle).click();

            Thread.sleep(5000); // Pause to observe the action (optional)
        }
        
     // Method to click the 'Apply' button
        public void clickApplyButton() throws InterruptedException {
            // Locate the 'Apply' button by its id
            By applyButton = By.xpath("(//button[@id='apply-button'])[1]");

            // Wait for the 'Apply' button to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(applyButton));

            // Perform the click action
            driver.findElement(applyButton).click();

            // Optional: Add a pause to observe the action
            Thread.sleep(5000);
        }




    // Method to apply for a job
    public void applyForJob() throws InterruptedException {
        By applyButton = By.xpath("//button[text()='Apply']"); // Adjust as necessary
        wait.until(ExpectedConditions.elementToBeClickable(applyButton)); // Wait until clickable
        driver.findElement(applyButton).click();
        Thread.sleep(5000);
    }
}
