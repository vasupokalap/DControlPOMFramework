package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class LoginPageTest extends BaseTest{
	
	
	@Test
	public void doLogin() {
		
		loginPage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}
	

}
