package com.java.Hard_Questions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Account_Page;
import com.Pages.Home_Page;
import com.Pages.Login_Page;
import com.TestBase.TestBase;

public class Login_Test extends TestBase{
	public Login_Test() throws Exception {
		super();
	}

	 public WebDriver driver;
	    public Home_Page homepage;
	    public Login_Page loginPage;
	    public Account_Page accountPage;	
	
	
	@BeforeMethod
	 
	    public void Setup() {
	        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	        homepage = new Home_Page(driver);
	        homepage.myaccount();
	        homepage.login();	
	}
	
	@Test
	public void validLoginWithFirstUsername() throws Exception {
		loginPage = new Login_Page(driver);
		loginPage.enteremail(prop.getProperty("validemail"));
        loginPage.enterpassword(prop.getProperty("validpsw"));
        loginPage.clickonlogin();

	

		
	}
 @AfterMethod
 public void tearDown() {
	 driver.quit();
 }
 
	}
		


