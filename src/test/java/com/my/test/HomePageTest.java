package com.my.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.my.test.base.BaseTest;
import com.my.test.utils.Constants;

public class HomePageTest extends BaseTest {
	@BeforeClass
	public void homePageSetUp() {
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(enabled = true)
	public void homePageTitleTest() {
		String title = homePage.getHomePagetitle();
		System.out.println("home page title is : " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
	}
	@Test(enabled =true)
	public void verifyHomePageHeaderTest() {
		String headerValue = homePage.getHeaderValue();
		System.out.println("home page header is :" + headerValue);
		Assert.assertEquals(headerValue, Constants.HEADER_PAGE_TITLE);
	}
	

}
