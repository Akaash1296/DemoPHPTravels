package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Libraries.BaseTests;
import Libraries.WebTools;
import POMPages.HomePage;

public class TC003 extends BaseTests {
	@Test
	public void testTC003() throws InterruptedException {
		driver.manage().window().maximize();
		HomePage h = new HomePage(driver, wTools);	
		Thread.sleep(1000);
		h.clickModule();
		Thread.sleep(1000);	
		h.clickSabreSettings();
		Thread.sleep(1000);
		WebElement trip = driver.findElement(By.id("tripType"));
		WebTools wT = new WebTools(driver);
		wT.selectDropDown(trip, "Return");
		Thread.sleep(1000);
		WebElement classService = driver.findElement(By.id("classOfService"));
		wT.selectDropDown(classService, "BUSINESS");
		Thread.sleep(1000);
		WebElement apim = driver.findElement(By.id("mode"));
		wT.selectDropDown(apim, "Sandbox");
		Thread.sleep(1000);
		h.clickSubmit();	
		Thread.sleep(1000);
	}	
}
