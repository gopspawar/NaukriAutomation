package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;

    // Constructor
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to update the phone number
    public void updatePhoneNumber(String phoneNumber) {
        By phoneField = By.id("phone"); // Replace with actual locator
        driver.findElement(phoneField).clear(); // Clear existing phone number
        driver.findElement(phoneField).sendKeys(phoneNumber); // Enter new phone number
    }

    // Method to update the skills
    public void updateSkills(String skills) {
        By skillsField = By.id("skills"); // Replace with actual locator
        driver.findElement(skillsField).clear(); // Clear existing skills
        driver.findElement(skillsField).sendKeys(skills); // Enter new skills
    }

    // Method to save the profile
    public void saveProfile() {
        By saveButton = By.id("saveProfile"); // Replace with actual locator
        driver.findElement(saveButton).click(); // Click the save button
    }

    // Method to verify success message
    public boolean isUpdateSuccessMessageDisplayed() {
        By successMessage = By.id("successMessage"); // Replace with actual locator
        return driver.findElement(successMessage).isDisplayed(); // Check if success message is displayed
    }
}
