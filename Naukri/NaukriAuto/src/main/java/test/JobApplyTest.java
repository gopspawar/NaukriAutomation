package test;

import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class JobApplyTest extends BaseTest {

    @Test
    public void testJobApplyWithFilters() throws InterruptedException {
        // Log in first
        loginPage.enterUsername("gopalpawar2707@gmail.com");
        loginPage.enterPassword("Pawar@2707");
        loginPage.clickLogin();

        // Search for jobs
        jobSearchPage.enterJobTitle("Software Engineer");
        jobSearchPage.selectLocation("Bangalore");
        jobSearchPage.selectExperience("5 Years");
        jobSearchPage.clickSearch();

        // Apply for the first job (assuming the search results are displayed)
        jobSearchPage.applyForJob();

        // Add assertions to verify the application process
    }
}
