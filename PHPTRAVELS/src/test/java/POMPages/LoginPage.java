package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.WebTools;

public class LoginPage extends BasePage{

	 @FindBy(name="email")
	 private WebElement eMail;
	 
	 @FindBy(name="password")
	 private WebElement pwd;
	 
	 @FindBy(xpath="//span[text()='Login']")
	 private WebElement logIn;
	 
	 public LoginPage(WebDriver driver, WebTools wTools) {
		 super(driver, wTools);
	 }
	 
	 public void setuserName(String email) {
		 wTools.typeText(eMail, "Email", email);
	 }
	 
	 public void setPassword(String password) {
		 wTools.typeText(pwd, "Password", password);
	 }
	 
	 public void clickLogin() {
		wTools.clickElement(logIn, "Log In");
	 }
}
