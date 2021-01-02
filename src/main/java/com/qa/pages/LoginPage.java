package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.base.BasePage;
import com.qa.util.ElementUtils;

public class LoginPage extends BasePage{
	private WebDriver driver;
	public ElementUtils eleUtil;
	
	//By Locator
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//span[contains(text(),' Login ')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtils(driver);
	}
	
	public HomePage loginFunctionality(String un, String pwd) {
		
		eleUtil.dosendKeys(username, un);
		eleUtil.dosendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		
		return new HomePage(driver);
	}

}
