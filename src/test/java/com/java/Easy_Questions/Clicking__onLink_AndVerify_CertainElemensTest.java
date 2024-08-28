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


public class Clicking__onLink_AndVerify_CertainElemensTest {
	public WebDriver driver;
	public ChromeOptions option;
	@BeforeMethod
	public void setup() {
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");                       /*//div[@id='content']/descendant::h1*/
	}
@Test
public void clickingOnLinkAndVerifyCertainElement() {
	driver.findElement(By.linkText("Software")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id=\"content\"]/child::h2")).isDisplayed());
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
