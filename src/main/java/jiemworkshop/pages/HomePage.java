package jiemworkshop.pages;

import org.openqa.selenium.By;


public class HomePage extends BaseAction {
	// All Links
	private static By lnk_SignOnButton = By.xpath("//a[text()='SIGN-ON']"); 
	private static By lnk_RegisterButton = By.xpath("//a[text()='REGISTER']"); 
	private static By lnk_SupportButton = By.xpath("//a[text()='SUPPORT']"); 
	private static By lnk_ContactButton = By.xpath("//a[text()='CONTACT']"); 
	private static By lnk_SignOffButton = By.xpath("//a[text()='SIGN-OFF']"); 
	
// 	
	// Side Menu Links
	private static String sideMenuXpath = "/html/body/div/table/tbody/tr/td[1]";
	private static By lnk_sidemenuHomeButton = By.xpath(sideMenuXpath+"//a[text()='Home']"); 
	private static By lnk_sidemenuFlightButton  = By.xpath(sideMenuXpath+"//a[text()='Flights']"); 
	private static By lnk_sidemenuHotelButton  = By.xpath(sideMenuXpath+"//a[text()='Hotels']"); 
	private static By lnk_sidemenuCarRentalButton  = By.xpath(sideMenuXpath+"//a[text()='Car Rentals']"); 
	private static By lnk_sidemenuCruisesButton  = By.xpath(sideMenuXpath+"//a[text()='Cruises']"); 
	private static By lnk_sidemenuDestinationButton  = By.xpath(sideMenuXpath+"//a[text()='Destinations']"); 
	private static By lnk_sidemenuVacationsButton  = By.xpath(sideMenuXpath+"//a[text()='Vacations']"); 
	
	
	
	public String getHomePageTitle() {
		return getTitle();
	}

	public void click_lnk_SignOnButton() {
		click(lnk_SignOnButton);
	}
	public void click_lnk_SignOffButton() {
		click(lnk_SignOffButton);
	}
	
	public void click_lnk_RegisterButton() {
		click(lnk_RegisterButton);
	}

	
	public void click_lnk_SupportButton() {
		click(lnk_SupportButton);
	}

	
	public void click_lnk_ContactButton() {
		click(lnk_ContactButton);
	}

	
	
	
}
