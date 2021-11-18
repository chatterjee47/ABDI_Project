package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.testUtility.TestBase;

public class LoginPage extends TestBase{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log  in")
	WebElement logIn;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//*[@id='id_password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='submit-id-submit']")
	WebElement login;
	
	
	public void clickOnLogIn() {
		logIn.click();
	}
	
	
	public void enterUserName() {
		username.sendKeys("username");
	}
	
	
	public void enterPassword() {
		password.sendKeys("password");
	}
	
	
	public void clickOnLogin() {
		login.click();
	}
	
	
}
