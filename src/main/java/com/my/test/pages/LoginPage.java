package com.my.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.my.test.base.BasePage;

public class LoginPage extends BasePage{
	private WebDriver driver;
	//1. By Locators
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By wishList = By.xpath("//span[contains(text(), 'Wish List (0)')]");
	private By loginButton = By.cssSelector("input.btn.btn-primary");
	private By currencyTitle = By.xpath("//span[text()='Currency']");
	private By phoneNumberTitle = By.xpath("//span[text()=123456789]");
	private By myAccountHeaderTitle = By.xpath("//span[contains(text(), 'My Account')]");
	private By shoppingCart = By.xpath("//span[contains(text(), 'Shopping Cart')]");
	private By searchBox = By.cssSelector("input.form-control.input-lg");
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
	public String getWishListValue() {
		if(driver.findElement(wishList).isDisplayed()) {
			return driver.findElement(wishList).getText();
		}
		return null;
	}
	public String getRegisterAccountContinueValue() {
		if(driver.findElement(registerAccountContinue).isDisplayed()) {
			return driver.findElement(registerAccountContinue).getText();
			}
		return null;
	}
	public String getCurrencyTitleValue() {
		if(driver.findElement(currencyTitle).isDisplayed()) {
			return driver.findElement(currencyTitle).getText();
		}
		return null;
	}
	public String getPhoneNumberTitleValue() {
		if(driver.findElement(phoneNumberTitle).isDisplayed()) {
			return driver.findElement(phoneNumberTitle).getText();
		}
		return null;
	}
	public String getMyAccountHeaderTitleValue() {
		if(driver.findElement(myAccountHeaderTitle).isDisplayed()) {
			return driver.findElement(myAccountHeaderTitle).getText();
		}
		return null;
	}
	public String getShoppingCartHeaderTitleValue() {
		if(driver.findElement(shoppingCart).isDisplayed()) {
			return driver.findElement(shoppingCart).getText();
		}
		return null;
	}
	public String getSearchBoxValue() {
		if(driver.findElement(searchBox).isDisplayed()) {
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
