package com.crm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;


public class temptest {

	
	LoginPage loginpage;
	WebDriver driver;
	public static String projectLocation =System.getProperty("user.dir");
	
	@Test
	public void testInfo() {
		System.out.println("********** temptest class testInfo ******** " +projectLocation);
		loginpage =new LoginPage();

	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("********** temptest class beforeMethod ******** ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("********** temptest class afterMethod ******** ");
	}

}
