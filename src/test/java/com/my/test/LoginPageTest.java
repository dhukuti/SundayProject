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
		String informationTitleText = loginPage.getInformationTitleValue();
		System.out.println("Information Title is :" + informationTitleText);
		Assert.assertEquals(informationTitleText, Constants.INFORMATION_TITLE);
	}
	@Test
	public void verifyCustomerServiceTitleTest() {
		String customerServiceTitleText = loginPage.getCustomerServiceTitleValue();
		System.out.println("Customer Service Title is :" + customerServiceTitleText);
		Assert.assertEquals(customerServiceTitleText, Constants.CUSTOMER_SERVICE_TITLE);
	}
	@Test
	public void verifyExtrasTitleTest() {
		String extrasTitleText = loginPage.getExtrasTitleValue();
		System.out.println("Extras title is :" + extrasTitleText);
		Assert.assertEquals(extrasTitleText, Constants.EXTRAS_TITLE);
	}
	@Test
	public void verifyMyAccountTitleTest() {
		String myAccountTitleText = loginPage.getMyAccountTitleValue();
		System.out.println("My Account title is :" + myAccountTitleText);
		Assert.assertEquals(myAccountTitleText, Constants.MY_ACCOUNT_TITLE);
	}
	@Test
	public void verifyNewCustomerTitle() {
		String newCustomerTitleText = loginPage.getNewCustomerTitleValue();
		System.out.println("New Customer title is :" + newCustomerTitleText);
		Assert.assertEquals(newCustomerTitleText, Constants.NEW_CUSTOMER);
	}

}
