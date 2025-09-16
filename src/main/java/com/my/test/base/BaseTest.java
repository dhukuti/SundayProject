package com.my.test.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.my.test.pages.HomePage;
import com.my.test.pages.LoginPage;

public class BaseTest {
	public BasePage basePage;
	public LoginPage loginPage;
	public HomePage homePage;
	public Properties prop;
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");
		driver = basePage.init_driver(browser);
		loginPage = new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
