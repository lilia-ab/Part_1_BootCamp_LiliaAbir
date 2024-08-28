package com.java.Hard_Questions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Home_Page;
import com.Pages.Cart_Page;
import com.Pages.Search_Product_Page;
import com.TestBase.TestBase;

public class Add_Product_To_The_CartTest extends TestBase {
	
	public Add_Product_To_The_CartTest() throws Exception {
        super();
    }
 
 
    public WebDriver driver;
    public Home_Page homepage;
    public Search_Product_Page searchProductPage;
    public Cart_Page cartPage;


    @BeforeMethod
    public void Setup(){
       
       driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
       searchProductPage = new Search_Product_Page(driver);
       searchProductPage.enterToSearchBoxTextField(prop.getProperty("productName"));
       searchProductPage.clickOnSearchButton();
       searchProductPage.clickOnAddToCart();
    }
    
    @Test
    public void verifyProductIsAddedToCart(){
    	cartPage = new Cart_Page(driver);
    	cartPage.clickOnAddTocart();
        cartPage.clickOnViewItemLink();
        cartPage.clickOnViewCartLink();
        
        Assert.assertTrue(cartPage.productInCartDisplayed());


    }
@AfterMethod
    public void tearDown(){
        driver.quit();
}
}
