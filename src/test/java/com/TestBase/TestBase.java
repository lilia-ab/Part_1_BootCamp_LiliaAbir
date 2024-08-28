package com.TestBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase { 
	public Properties prop;
	public Properties dp;
	public FileInputStream ip;
	public FileInputStream ip1;
	public ChromeOptions options;
	public WebDriver driver; 
	
	
	public TestBase() throws Exception {
	prop = new Properties();
	ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\Data\\login.properties");
	prop.load(ip);
	
	dp = new Properties();
	ip1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\Data\\Registery.properties");
	dp.load(ip1);
}


public WebDriver initializeBrowserAndOpenApplication(String browser) {
	if(browser.equals("Chrome")) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
	}else if(browser.equals("firefox")) {
		driver = new FirefoxDriver();
	}else if(browser.equals("edge")) {
		driver = new EdgeDriver();
	}
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(prop.getProperty("url"));
	return driver;
}


}
