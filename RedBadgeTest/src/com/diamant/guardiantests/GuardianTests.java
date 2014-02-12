package com.diamant.guardiantests;

import java.io.File;
import java.util.concurrent.TimeUnit;
import com.diamant.guardianpageobjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class GuardianTests {


	private WebDriver driver;
	private String baseUrl = "https://id.theguardian.com/signin";
	//private String baseUrl = "http://www.theguardian.com/";
	private String regUserName = "FILLIN";
	private String regPassWord = "FILLIN";
	private String regEmail = "FILLIN";
	private String goodEmail = "FILLIN";
	private String goodPassWord = "FILLIN";
	private String badEmail = "FILLIN";
	private String badPassWord = "FILLIN";
			

	@Before
	public void setUp() throws Exception {
		  File pathToBinary = new File("C:\\Users\\diamanpe\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		  //Put the firefox path here or add to the PATH
		  FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		  FirefoxProfile firefoxProfile = new FirefoxProfile();
		  driver = new FirefoxDriver(ffBinary,firefoxProfile);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	public void shouldBeAbleToRegisterOnTheSite() throws InterruptedException {
       	 driver.get(baseUrl);
		 SuccessRegistrationPage reg = new SuccessRegistrationPage(driver);
		 reg.registrationForm(regUserName, regPassWord, regEmail);
	}
	
	@Test
	public void shouldBeAbleTLoginToTheSite() throws InterruptedException {
      	 driver.get(baseUrl);
		 LoginPage login = new LoginPage(driver);
		 login.loginForm(goodEmail, goodPassWord);
		 
		 
	}
	@Test
	public void shouldNotBeAbleTLoginToTheSite() throws InterruptedException {
      	 driver.get(baseUrl);
		 LoginPage login = new LoginPage(driver);
		 login.NegativeLoginForm(badEmail, badPassWord);
		 
	}
	
	public void shouldBeAbleTNavigateToThePoliticsSiteAfterSuccessfulLogin() throws InterruptedException {
     	 driver.get(baseUrl);
		 LoginPage login = new LoginPage(driver);
		 login.loginForm(goodEmail, goodPassWord);
		 PoliticsPageFactory polpage = new PoliticsPageFactory ();
		 polpage.createPage(driver);
		 
	}
	
	
	
}
