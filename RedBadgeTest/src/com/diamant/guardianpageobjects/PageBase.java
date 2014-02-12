package com.diamant.guardianpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class PageBase {
  
	protected String URL;
	protected WebDriver driver;
	protected String pageTitle;

	public PageBase(WebDriver driver, String pageTitle) {
		this.driver = driver;
		this.pageTitle = pageTitle;
		}
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		//this.pageTitle = pageTitle;
		}
          

//	public abstract boolean isPageValid ();
	
	public boolean isPageLoad(){
		return (driver.getTitle().contains(pageTitle));
		}                       
 
	public void open(){
		driver.get(URL);
		}                             
	public String getTitle() {
		return pageTitle;
		}                     
	public String getURL() { 
		return driver.getCurrentUrl();  
		}                             
	protected void sendText(String cssSelector, String text) { 
		driver.findElement(By.cssSelector(cssSelector)).sendKeys(text);
		}  
	public boolean isTextPresent(String text){ 
		return driver.getPageSource().contains(text);
		} 
	public boolean isElementPresent(By by) {
		try { 
			driver.findElement(by);
			                                
			return true;
			} catch (NoSuchElementException e) {
				return false;
				}  
		}            
	public boolean isElementPresent(String _cssSelector){
		try { 
			driver.findElement(By.cssSelector(_cssSelector));
			return true;
			} catch (NoSuchElementException e) {
				return false;
				} 
		}          
	public boolean isElementPresentAndDisplay(By by) {
		try { 
			return driver.findElement(by).isDisplayed();
			} catch (NoSuchElementException e) {
				return false;
				}
		}              
	public WebElement getWebElement(By by){
		return driver.findElement(by);
		}
	
	//Clicklink
}

