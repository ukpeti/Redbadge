package com.diamant.guardianpageobjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PoliticsPageFactory implements PageFactory {

		
		
		public PageBase createPage(WebDriver driver) {
			driver.findElement(By.linkText("Politics")).click();
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			return new PoliticsPage(driver);
		}
	
}
