package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseClass {

	//All the locators of page
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement userName;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;
	

	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
	}
	

	public String titleLoginPage() {
		return txtLoginPage.getText();
	}
	

	public String currentUrl() {
		return driver.getCurrentUrl();
	}

}
