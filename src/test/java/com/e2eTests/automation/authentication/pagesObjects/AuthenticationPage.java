package com.e2eTests.automation.authentication.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

	/*Locators*/
	final static String USERNAME_ID = "username";
	final static String PASSWORD_ID = "password";
	final static String BUTTON_LOGIN = "//input[@name='submit']";
	final static String MESSAGE_TO_WELCOME = "//div[contains(text(),'Bienvenue')]";

	/*@FindBy*/
	@FindBy(how=How.ID, using=USERNAME_ID)
	public static WebElement userName;
	@FindBy(how=How.ID, using=PASSWORD_ID)
	public static WebElement userPassword ;
	@FindBy(how=How.XPATH, using= BUTTON_LOGIN)
	public static WebElement btnLogin ;
	@FindBy(how=How.XPATH, using=MESSAGE_TO_WELCOME)
	public static WebElement welcome;

	/* Methods*/
	public void fillUsername (String username) {
		
		userName.sendKeys(username);
	}
	public void fillPassword(String pswd) {

		userPassword.sendKeys(pswd);
	}
	public void clickLoginButton() {

		btnLogin.click();
	}

}
