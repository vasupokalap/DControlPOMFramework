package com.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class BaseTest {
	
	WebDriver driver;
	public BasePage basePage;
	public Properties prop;
	public LoginPage loginPage;
	public HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		basePage.init_Config();
		prop = basePage.prop;
		driver = basePage.init_Browser();	
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
