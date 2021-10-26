package com.e2eTests.automation.panier.pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointMerci {

	
	
	/*Locators*/
	final static String PTSMERCI_ID = "//a[@href='/transformer-merci']";
	final static String PRODUIT_ID = "//body/div[7]/div[4]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/a[1]";
	final static String BTNCONFIRM = "//button[contains(text(),'Valider')]";
	final static String MESSAGE_TO_WELCOME = "//div[contains(text(),'Bienvenue')]";
	final static String NBPOINTS = "//body/div[7]/div[4]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]";

	/*@FindBy*/
	@FindBy(how=How.XPATH, using=PTSMERCI_ID)
	public static WebElement ptsMerci;
	@FindBy(how=How.XPATH, using=PRODUIT_ID)
	public static WebElement produit ;
	@FindBy(how=How.XPATH, using= BTNCONFIRM)
	public static WebElement btnConfirm ;
	@FindBy(how=How.XPATH, using=MESSAGE_TO_WELCOME)
	public static WebElement welcome;
	@FindBy(how=How.XPATH, using=NBPOINTS)
	public static WebElement nbPoint;
	

	/* Methods*/
	
	public void clickPtsMerci() {

		ptsMerci.click();
	}
	public void clickPdt() {
		
		produit.click();
	}
	public void clickConfirmation() {

		btnConfirm.click();
	}

	public void getNbPoint() {

		System.out.println("nb de point est "+nbPoint.getText());
	}

	
	
	
}
