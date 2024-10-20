package test;

import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {
    	loginPage.loginclick();
        loginPage.enterUsername("gopalpawar2707@gmail.com");
        loginPage.enterPassword("Pawar@2707");
        loginPage.clickLogin();
        //loginPage.clickOnProfile();
        //loginPage.clickLogout();

     // Search for jobs
        jobSearchPage.clickOnSearch();
        
        jobSearchPage.enterJobTitle("Manual Tester, QA Engineer, Manual Testing, Automation Tester");
        jobSearchPage.selectExperience("5 years");
        jobSearchPage.selectLocation("Bangalore");
        jobSearchPage.selectFreshness("Last 3 days");
        jobSearchPage.selectJobTitle("QA Engineer II");
        
       // jobSearchPage.clickSearch();

        // Apply for the first job (assuming the search results are displayed)
       // jobSearchPage.applyForJob();
    }
}
