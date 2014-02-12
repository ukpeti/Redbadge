package com.diamant.guardianpageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class MainPageFactory implements PageFactory {
	
	private static final String URL = "http://www.theguardian.com";
	
	

	public PageBase createPage(WebDriver driver) {
	driver.get(MainPageFactory.URL);
	driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	return new MainPage(driver);
	}
}