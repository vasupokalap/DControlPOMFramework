package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class HomePageTest extends BaseTest{
	WebDriver driver;
	
	@BeforeClass
	public void homePageSetUp() {
		homePage = loginPage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void doverifyQubicDevices() {
		
		Assert.assertTrue(homePage.verifyQbicOption());
	}

}
