package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Home_Page {
public WebDriver driver;
	
	@FindBy(linkText="My Account")
	private WebElement MyAccount;
	
	@FindBy(linkText="Login")
	private WebElement login;
	
		
	@FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Desktops")
    private WebElement homePageElement;

    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement linkOnHomePage;

	
    public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
public void myaccount() {
	MyAccount.click();
}
public void login() {
	login.click();
}
public Registration_page combiningTwoActionsToNavigateToRegisterPage() {
	MyAccount.click();	
	registerLink.click();
	return new Registration_page(driver);
	}

public void clickOnRegisterLink(){
	registerLink.click();
	}
public void clickOnLinkOnHomepage(){
	linkOnHomePage.click();
	}
public boolean elementPresentOnHomePage(){
    boolean display = homePageElement.isDisplayed();
    return display;

}



}
