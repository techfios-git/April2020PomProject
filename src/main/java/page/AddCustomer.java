package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomer extends BasePage{
	
WebDriver driver;
	
	public AddCustomer(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a") WebElement CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHOME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement CUNTRY_FIELD_LOCATOR;
	
	
	
	//Interactive Methods
	public void clickOnCustomersButton() {
		CUSTOMER_FIELD_LOCATOR.click();
	}
	
	public void clickOnAddCustomerButton() {
		waitForElement(driver, 3, ADD_CUSTOMER_FIELD_LOCATOR);
		ADD_CUSTOMER_FIELD_LOCATOR.click();
	}
	
	public void enterFullName(String fullName) {
		USERNAME_FIELD_LOCATOR.sendKeys(fullName);
	}
	
	public void enterCompanyName(String company) {
		selectDropDown(COMPANY_FIELD_LOCATOR, company);
	}
	
	public void enterEmailAddress(String email) {
		EMAIL_FIELD_LOCATOR.sendKeys(email);
	}
	
	public void enterPhoneNumber(String phone) {
		PHOME_FIELD_LOCATOR.sendKeys(phone);
	}
	
	public void enterAddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}
	
	public void enterCountryName(String country) {
		selectDropDown(CUNTRY_FIELD_LOCATOR, country);
	}
}
