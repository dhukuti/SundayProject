package com.my.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.my.test.base.BasePage;

public class HomePage extends BasePage {
	
	private WebDriver driver;
	private By header = By.xpath("//a[text()='Qafox.com']");
	private By desktopsMenu = By.xpath("//a[@class='dropdown-toggle' and @data-toggle='dropdown' and text()='Desktops']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public String getHomePagetitle() {
		return driver.getTitle();
	}
	public String getHeaderValue() {
		if(driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
	}
	public String getDesktopsValue() {
		if(driver.findElement(desktopsMenu).isDisplayed()) {
			return driver.findElement(desktopsMenu).getText();
		}
		return null;
	}
	

}
