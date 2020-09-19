package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//LoginPage loginpage1 = new LoginPage();
				
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassword("abc123");
		loginpage.clickSigninButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage();
		
		BrowserFactory.tearDown();
	}
	
	@Test
	public void invalidUserShouldNotBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//LoginPage loginpage1 = new LoginPage();
				
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.enterUserName("demo@techfios.com");
		loginpage.enterPassword("abc1234");
		loginpage.clickSigninButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage();
		
		BrowserFactory.tearDown();
	}

}
