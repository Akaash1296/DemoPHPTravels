package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Libraries.WebTools;

public class HomePage extends BasePage {
	@FindBy(xpath="(//li)[3]")
	private WebElement modules;


	@FindBy(id="logout")
	private WebElement lgOut;
	
	@FindBy(id="order_set")
	private WebElement ordSet;
	
	@FindBy(xpath="(//input[@id='order_set'])[10]")
	private WebElement travelHopeFlightsordSet;
	
	@FindBy(id="checkedbox")
	private WebElement checkBox;
	
	@FindBy(xpath="(//input[@id='checkedbox'])[10]")
	private WebElement travelHopeFlights;
	
	@FindBy(xpath="(//button[text()=' Settings'])[11]")
	private WebElement sabre;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement subMit;
	
	@FindBy(xpath="//button[text()='Back']")
	private WebElement back;
	
	public HomePage(WebDriver driver, WebTools wTools) {
		super(driver, wTools);
	}

	public void clickModule() {
		wTools.clickElement(modules, "Modules");
	}
	
	public void clickOrderSet() {
		wTools.clickElement(ordSet, "Order Set");
	}
	
	public void clicktravelHopeFlightOrderSet() {
		wTools.clickElement(ordSet, "Order Set");
	}
	
	public void clickCheckBox() {
		wTools.clickElement(checkBox, "Check Box");
	}
	
	public void clickTravelHopeFlightsCheckBox() {
		wTools.clickElement(travelHopeFlights, "Travel Hope Flights Check Box");
	}
	
	
	public void clickSabreSettings() {
		wTools.clickElement(sabre, "Sabre Settings");
	}
	
	public void clickSubmit() {
		wTools.clickElement(subMit, "Submit");
	}
	
	public void clickBack() {
		wTools.clickElement(back, "Back");
	}
	

	public void clickLogOut() {
		wTools.clickElement(lgOut, "Log Out");
	}

}
