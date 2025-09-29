package com.my.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.my.test.base.BasePage;

public class LoginPage extends BasePage{
	private WebDriver driver;
	//1. By Locators
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.cssSelector("input.btn.btn-primary");
	private By registerAccountContinue = By.xpath("//a[text()='Continue']");
	
	//2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//3. page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		
		return new HomePage(driver);
	}
	public String getRegisterAccountContinueValue() {
		if(driver.findElement(registerAccountContinue).isDisplayed()) {
			return driver.findElement(registerAccountContinue).getText();
		}
		return null;
	}

}
