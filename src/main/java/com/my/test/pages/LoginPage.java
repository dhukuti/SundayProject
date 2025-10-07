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
	private By informationTitle = By.xpath("//h5[text()='Information']");
	private By customerServiceTitle = By.xpath("//h5[text()='Customer Service']");
	private By extrasTitle = By.xpath("//h5[text()='Extras']");
	private By myAccountTitle = By.xpath("//h5[text()='My Account']");
	private By newCustomerTitle = By.xpath("//h2[text()='New Customer']");

	
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
	public String getInformationTitleValue() {
		if(driver.findElement(informationTitle).isDisplayed()) {
			return driver.findElement(informationTitle).getText();
		}
		return null;
		
	}
	public String getCustomerServiceTitleValue() {
		if(driver.findElement(customerServiceTitle).isDisplayed()) {
			return driver.findElement(customerServiceTitle).getText();
		}
		return null;
	}
	public String getExtrasTitleValue() {
		if(driver.findElement(extrasTitle).isDisplayed()) {
			return driver.findElement(extrasTitle).getText();
		}
		return null;
	}
	public String getMyAccountTitleValue() {
		if(driver.findElement(myAccountTitle).isDisplayed()) {
			return driver.findElement(myAccountTitle).getText();
		}
		return null;
	}
	public String getNewCustomerTitleValue() {
		if(driver.findElement(newCustomerTitle).isDisplayed()) {
			return driver.findElement(newCustomerTitle).getText();
		}
		return null;
	}

}
