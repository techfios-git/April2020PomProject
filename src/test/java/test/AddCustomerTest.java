package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomer;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassword("abc123");
		loginpage.clickSigninButton();

		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage();
		
		AddCustomer addcustomer = PageFactory.initElements(driver, AddCustomer.class);
		addcustomer.clickOnCustomersButton();
		addcustomer.clickOnAddCustomerButton();
		addcustomer.enterFullName("April2020");
		addcustomer.enterCompanyName("Techfios");
		addcustomer.enterEmailAddress("1232@Techfios.com");
		addcustomer.enterPhoneNumber("214241412");
		addcustomer.enterAddress("Carrolton");
		
		addcustomer.enterCountryName("United Kingdom");

		//BrowserFactory.tearDown();
	}

}
