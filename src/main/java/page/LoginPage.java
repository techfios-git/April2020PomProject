package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 	
	//Element Library
	/*WebElement USER_NAME_LOCATOR_WEBELEMENT =	driver.findElement(By.xpath("//*[@id='username']"));
	By USER_NAME_FIELD_LOCATOR = By.xpath("//*[@id='username']");*/
	
	@FindBy(how = How.XPATH, using = "//*[@id='username']") WebElement USER_NAME_LOCATOR; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_LOCATOR; 
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_LOCATOR; 
	
	
	//Interactive Methods
	public void enterUserName(String userName) {
		USER_NAME_LOCATOR.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_LOCATOR.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_LOCATOR.click();
	}
	
	/*public void login(String userName, String password) {
		USER_NAME_LOCATOR.sendKeys(userName);
		PASSWORD_LOCATOR.sendKeys(password);
		SIGNIN_BUTTON_LOCATOR.click();
	}*/

}
