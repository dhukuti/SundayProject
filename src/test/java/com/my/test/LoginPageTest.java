package com.my.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.my.test.base.BaseTest;
import com.my.test.utils.Constants;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
				
	}
	@Test(priority=2)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void verifyRegisterAccountContinueTest() {
		String registerAccountContinueValue = loginPage.getRegisterAccountContinueValue();
		System.out.println("Register Account is :" + registerAccountContinueValue);
		Assert.assertEquals(registerAccountContinueValue, Constants.REGISTER_ACCOUNT_CONTINUE);

	}
	@Test
	public void verifyInformationTitleTest() {
		String informationTitleText = loginPage.getInformationTielValue();
		System.out.println("Information Title is :" + informationTitleText);
		Assert.assertEquals(informationTitleText, Constants.INFORMATION_TITLE);
	}

}
