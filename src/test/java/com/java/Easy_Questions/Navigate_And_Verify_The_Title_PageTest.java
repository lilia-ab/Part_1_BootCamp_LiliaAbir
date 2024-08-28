package com.java.Easy_Questions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigate_And_Verify_The_Title_PageTest {
	public WebDriver driver;
	public ChromeOptions option;
	@BeforeMethod
	public  void setup() {
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	}	
	@Test
	public void Title() {
		String ExpectedResult ="Your Store";
		String ActualResult= driver.getTitle();
		Assert.assertTrue(ActualResult.contains(ExpectedResult));
	}
	
	 @AfterMethod
	    public void tearDown(){
	        driver.quit();
	    }
}
