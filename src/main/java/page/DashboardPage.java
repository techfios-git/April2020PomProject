package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_ELEMENT_LOCATOR;
	
	//Interactive Methods
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT_LOCATOR.getText(), "Dashboard", "Wrong Page!!");
	}

}
