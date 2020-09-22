package Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import POMPages.HomePage;
import POMPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTests implements IAutoConstants {

	public WebDriver driver;
	public WebTools wTools;
	@BeforeClass
	public void openApp() {
		if(browser.equalsIgnoreCase("safari")) {
			System.setProperty("", driverPath);
			driver = new SafariDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser Name: " + browser);		
		}
		System.out.println("Opening the browser");
		System.out.println("Application URL: " + url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(wTime, TimeUnit.SECONDS);
		System.out.println("Open the application");
		wTools = new WebTools(driver);		
		LoginPage l = new LoginPage(driver, wTools);
		l.setuserName(email);
		l.setPassword(password);
		l.clickLogin();
	}

	@AfterClass
	public void closeApp() {
		HomePage h = new HomePage(driver, wTools);
		h.clickLogOut();
		driver.close();
		System.out.println("Close the browser");
		System.out.println("------End of test case------");
	}

}
