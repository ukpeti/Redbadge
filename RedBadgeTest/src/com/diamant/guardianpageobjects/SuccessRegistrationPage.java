package com.diamant.guardianpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessRegistrationPage extends PageBase {
	
	//private final static String pageTitle = "Registration complete on the Guardian";
	private final static String pageTitle = "Register for the Guardian";
	private final static String userNameByID = "username";
	private final static String emailByID = "email";
	private final static String passWordByID = "password";
	private final static String passWordAgainByID = "password-again";
	private final static String ContinueButtonByCss = "input.Button";
	public SuccessRegistrationPage(WebDriver driver) {
		super(driver,SuccessRegistrationPage.pageTitle);
		
		if (!pageTitle.equals(driver.getTitle())) {
		throw new IllegalStateException("Registration was not successful");
	
		}

	}
	

	public SuccessRegistrationPage registrationForm(String regUserName, String regPassword, String regEmail) throws InterruptedException {
		
		driver.findElement(By.linkText("Create your account")).click();
		driver.findElement(By.id(userNameByID)).clear();
		driver.findElement(By.id(userNameByID)).sendKeys(regUserName);
		driver.findElement(By.id(emailByID)).sendKeys(regEmail);
		driver.findElement(By.id(passWordByID)).sendKeys(regPassword);
		driver.findElement(By.id(passWordAgainByID)).sendKeys(regPassword);
		driver.findElement(By.id("accept-terms")).click();		
		driver.findElement(By.cssSelector("input.button")).click();
		
		return new SuccessRegistrationPage (driver);
		
	}

}
