package com.e2eTests.automation.panier.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.authentication.pagesObjects.AuthenticationPage;
import com.e2eTests.automation.panier.pagesObjects.PointMerci;
import com.e2eTests.automation.utils.AbstractPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PointMerciStepDef {
	
	public WebDriver driver;
	private PointMerci pointMerci= new PointMerci ();
	private CommonMethods commonMethods= new CommonMethods ();
	
	public PointMerciStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, PointMerci.class);
	
	}

	@When("^je clic sur choisir un autre montant$")
	public void jeClicSurChoisirUnAutreMontant() throws Throwable {
		pointMerci.clickPtsMerci();
	}

	@When("^je choisi (\\d+) points$")
	public void jeChoisiPoints(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[7]/div[4]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/a[1]")));
		pointMerci.clickPdt();
	}

	@When("^je clique sur valider$")
	public void jeCliqueSurValider() throws Throwable {
		System.out.println("okok");
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		pointMerci.clickConfirmation();
	}

	@Then("^solde point merci est déduit de (\\d+) points$")
	public void soldePointMerciEstDéduitDePoints(int arg1) throws Throwable {
	 pointMerci.getNbPoint();
	 driver.navigate().refresh();
	 pointMerci.getNbPoint();
	 
	}

}
