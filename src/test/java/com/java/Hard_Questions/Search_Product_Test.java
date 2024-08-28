package com.java.Hard_Questions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Search_Product_Page;
import com.TestBase.TestBase;



public class Search_Product_Test extends TestBase {
	public Search_Product_Test() throws Exception {
        super();
    }

    public WebDriver driver;
    public Search_Product_Page searchProductPage;

    @BeforeMethod
    public void startUp(){
        driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
    }

    @Test
    public void verifySearchResultsAreDisplayed(){
    searchProductPage = new Search_Product_Page(driver);
    searchProductPage.enterToSearchBoxTextField(prop.getProperty("productName"));
    searchProductPage.clickOnSearchButton();
     Assert.assertTrue(searchProductPage.searchResultsForProductIsDisplayed());
    searchProductPage.navigateToProductPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
