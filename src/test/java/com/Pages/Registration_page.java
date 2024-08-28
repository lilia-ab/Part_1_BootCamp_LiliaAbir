package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {
	 public WebDriver driver;

	    @FindBy(name = "firstname")
	    private WebElement FirstNameFieldBox;

	    @FindBy(name = "lastname")
	    private WebElement LastNameFieldBox;

	    @FindBy(name = "email")
	    private WebElement emailFieldBox;

	    @FindBy(name = "telephone")
	    private WebElement telephoneFieldBox;

	    @FindBy(name = "password")
	    private WebElement passwordFieldBox;

	    @FindBy(name = "confirm")
	    private WebElement confirmPasswordFieldBox;

	    @FindBy (name = "agree")
	    private WebElement privacyPolicyConfirm;

	    @FindBy (css  = "input.btn.btn-primary")
	    private WebElement clickOnContinue;
	    
	    @FindBy(xpath = "//input[@name = 'newsletter' and @value='1']")
		private WebElement newsLetterButton;
		
	    
	    public Registration_page (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);}
	    
	    public void enterFirstName(String FirstName) {
	    	FirstNameFieldBox.sendKeys(FirstName);
	    	
			}
	    public void entrerLastName(String LastName) {
	    	LastNameFieldBox.sendKeys(LastName);
	    }
	    public void enterEmail(String email) {
	    	emailFieldBox.sendKeys(email);
	    }
	    public void enterTelephone(String telephone) {
	    	telephoneFieldBox.sendKeys(telephone);
	    }
	    public void enterPassWord(String password) {
	    	passwordFieldBox.sendKeys(password);
	    }
	    public void confirmPassWord(String confirmpassword) {
	    	confirmPasswordFieldBox.sendKeys(confirmpassword);
	    }
	    public void newsLetter() {
	    	newsLetterButton.click();
	    	
	    }
	    public void privacyPoliveConfirm() {
	    	privacyPolicyConfirm.click();
	    }
	    

}

