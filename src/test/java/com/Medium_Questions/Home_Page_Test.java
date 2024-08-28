package com.Medium_Questions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Home_Page;
import com.TestBase.TestBase;



public class Home_Page_Test extends TestBase {
	  public Home_Page_Test () throws Exception {
	        super();

	    }
	    public WebDriver driver;
	    public Home_Page homepage;

	    @BeforeMethod
	    public void startUp(){
	        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));

	    }
	    @Test
	    public void verifyPresenceOfCertainElements(){
	        homepage = new Home_Page(driver);
	        homepage.clickOnLinkOnHomepage();
	        Assert.assertTrue(homepage.elementPresentOnHomePage());
	        
	        
	    }
	    @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }
}
