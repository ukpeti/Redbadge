package com.diamant.guardianpageobjects;

import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase {

	private final static String pageTitle = "Latest news, sport and comment from the Guardian | The Guardian";
	
	
	public MainPage(WebDriver driver) {
		super(driver, MainPage.pageTitle);
				
		
		if (!pageTitle.equals(driver.getTitle())) {
			throw new IllegalStateException("This is not the Main Page");
		
		}
 	
	
	}	
	
}
