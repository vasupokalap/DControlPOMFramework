package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	WebDriver driver;
	JSUtil jsutil;
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
		jsutil = new JSUtil(driver);
	}
	
	public WebElement getElement(By Locator) {
		WebElement ele =  driver.findElement(Locator);
		jsutil.flash(ele);
		return ele;
	}
	
	public void dosendKeys(By Locator, String text) {
		getElement(Locator).sendKeys(text);
	}
	
	public void doClick(By Locator) {
		getElement(Locator).click();
	}
	
	public Boolean isElementDisplay(By Locator) {
		return getElement(Locator).isDisplayed();
	}

}
