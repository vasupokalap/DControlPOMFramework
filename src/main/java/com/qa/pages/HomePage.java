package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.base.BasePage;
import com.qa.util.ElementUtils;

public class HomePage extends BasePage{
	private WebDriver driver;
	ElementUtils eleUtil;
	
	By qbicdevicesoption = By.xpath("//span[text()=' Qbic Devices']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
	}
	
	public Boolean verifyQbicOption() {
		return eleUtil.isElementDisplay(qbicdevicesoption);
	}

}
