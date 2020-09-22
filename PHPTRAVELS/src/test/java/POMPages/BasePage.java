package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Libraries.WebTools;

public class BasePage {
  
	public WebDriver driver;
	public WebTools wTools;
	
	public BasePage(WebDriver driver, WebTools wTools) {
		this.driver = driver;
		this.wTools = wTools;
		PageFactory.initElements(driver, this);
	}
}
