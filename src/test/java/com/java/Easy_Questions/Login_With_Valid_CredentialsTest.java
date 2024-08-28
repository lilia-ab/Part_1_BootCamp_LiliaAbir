package com.java.Easy_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_With_Valid_CredentialsTest {

	public WebDriver driver;
	public ChromeOptions option;
	
	
	@BeforeMethod
	public void setup() {
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void loginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("hihello8@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue((driver.findElement(By.linkText("Logout"))).isDisplayed());
	}
	 @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }
}
