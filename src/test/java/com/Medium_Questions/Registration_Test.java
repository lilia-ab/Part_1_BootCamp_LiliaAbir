package com.Medium_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Home_Page;
import com.Pages.Page_Successfully_Created;
import com.Pages.Registration_page;
import com.TestBase.TestBase;


public class Registration_Test extends TestBase {
	public Registration_Test() throws Exception {
		super();
	}

	    
        public WebDriver driver;
        public Registration_page registerpage;
		public Home_Page homepage;
		public Page_Successfully_Created accountsuccesspage;	
	
	
	@BeforeMethod
	 
	    public void Setup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	        }
	@Test
	public void registerWithValidCredentials() {
		driver.findElement(By.id("input-firstname")).sendKeys(dp.getProperty("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(dp.getProperty("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(dp.getProperty("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(dp.getProperty("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(dp.getProperty("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(dp.getProperty("confirmPassword"));
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).isDisplayed());	
	}
	 @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }
	}
	
	


