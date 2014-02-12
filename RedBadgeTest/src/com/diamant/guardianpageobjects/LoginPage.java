package com.diamant.guardianpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends PageBase {
	
	
	private final static String pageTitle = "Sign in to the Guardian";
	private final static String emailByID = "email";
	private final static String passWordByID = "password";
	public LoginPage(WebDriver driver) {
		super(driver, LoginPage.pageTitle);
			
		if (!pageTitle.equals(driver.getTitle())) {
			throw new IllegalStateException("This is not the Login page");
		}
	}	
	

	public MainPage loginForm(String goodEmail, String goodPassWord) throws InterruptedException {
				
		//driver.findElement(By.linkText("Sign in")).click(); // We could simulate the sign in like this as well
		driver.findElement(By.id(emailByID)).clear();
		driver.findElement(By.id(emailByID)).sendKeys(goodEmail);
		driver.findElement(By.id(passWordByID)).sendKeys(goodPassWord);
		driver.findElement(By.cssSelector("input.button")).click();
		return new MainPage (driver); // Enters the mainpage
	}
	
	public LoginPage NegativeLoginForm(String goodEmail, String goodPassWord) throws InterruptedException {
		
		//driver.findElement(By.linkText("Sign in")).click(); // if we opening the site like this, somehow the fields are not easy to focus on
		driver.findElement(By.id(emailByID)).clear();
		driver.findElement(By.id(emailByID)).sendKeys(goodEmail);
		driver.findElement(By.id(passWordByID)).sendKeys(goodPassWord);
		driver.findElement(By.cssSelector("input.button")).click();
		return new LoginPage (driver); // Stays at the login page
	}
	
	// of course it can be simulated by the same method and with an assert catching the negative result. But it shows better how the page object
	// pattern works, and why is it so good. 
	
	public boolean isPageValid(){
		
		return true;
	};
		
	}
	
	
	


