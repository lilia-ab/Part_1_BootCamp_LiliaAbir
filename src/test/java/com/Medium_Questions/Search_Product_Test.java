package com.Medium_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class Search_Product_Test extends TestBase {
	public Search_Product_Test() throws Exception {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void registerSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	}

	@Test
	public void verifySearchWithValidProduct() {
		driver.findElement(By.name("search")).sendKeys(prop.getProperty("productName"));
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
	 @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }
}
