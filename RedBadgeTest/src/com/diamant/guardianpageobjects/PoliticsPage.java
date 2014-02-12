package com.diamant.guardianpageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PoliticsPage extends PageBase {

	private final static String pageTitle = "Latest politics news, comment and analysis from the Guardian, the world's leading liberal voice";
	
	public PoliticsPage(WebDriver driver) {
		super(driver, PoliticsPage.pageTitle);

		if (!pageTitle.endsWith(driver.getTitle())) {
			throw new IllegalStateException("This is not the Politics page");
		}
	}

	public PoliticsPage getThere(){
		driver.findElement(By.linkText("Politics")).click();
		return new PoliticsPage (driver);
	}
	
}
