package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import pageObjects.ProfilePage;

public class ProfileUpdateTest extends BaseTest {

    private ProfilePage profilePage;

    @BeforeClass
    public void setUpProfilePage() {
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void testProfileUpdate() throws InterruptedException {
        // Log in first
        loginPage.enterUsername("gopalpawar2707@gmail.com");
        loginPage.enterPassword("Pawar@2707");
        loginPage.clickLogin();

        // Navigate to the profile section (you may need to implement this in HomePage)
        homePage.navigateToProfile(); // Ensure this method is implemented

        // Update the profile
        profilePage.updatePhoneNumber("9503540881");
        profilePage.updateSkills("Java, Selenium, TestNG");
        profilePage.saveProfile();

        // Verify success message
        Assert.assertTrue(profilePage.isUpdateSuccessMessageDisplayed(), "Profile update was not successful.");
    }
}
