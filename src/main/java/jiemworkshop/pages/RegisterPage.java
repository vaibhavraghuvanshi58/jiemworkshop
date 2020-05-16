package jiemworkshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RegisterPage extends BaseAction{

	private static final String RegistrationPageTitle = "Register: Mercury Tours";

	private static By txt_firtname = By.cssSelector("input[name^='first']"); 
	//private static By txt_firtname = By.xpath("//input[@name='firstName']");
	private static By txt_lastname = By.xpath("//input[@name='lastName']"); 
	private static By txt_phone = By.xpath("//input[@name='phone']"); 
	private static By txt_email = By.xpath("//input[@name='userName']"); 
	private static By txt_address_line1 = By.xpath("//input[@name='address1']"); 
	private static By txt_address_line2 = By.xpath("//input[@name='address2']"); 
	private static By txt_City = By.xpath("//input[@name='city']"); 
	private static By txt_state = By.xpath("//input[@name='state']"); 
	private static By txt_postalCode = By.xpath("//input[@name='postalCode']"); 
	private static By dropdown_country = By.xpath("//select[@name='country']");

	private static By txt_username = By.xpath("//input[@name='email']") ;
	private static By txt_password = By.xpath("//input[@name='password']"); 
	private static By txt_confirmPassword = By.xpath("//input[@name='confirmPassword']"); 
	private static By btn_submit = By.xpath("//input[@name='register']"); 
	
	// success msg
	private static By msg_success = By.xpath("//*[contains(text(),'Thank you for registering.')]"); 
	
	
	public boolean isRegistrationSuccess() {
		return isElementExist(msg_success);
	}
	
	public void enter_txt_username(String value) {
		sendkeys(txt_username, value);
	}
	public void enter_txt_password(String value) {
		sendkeys(txt_password, value);
	}
	public void enter_txt_confirmPassword(String value) {
		sendkeys(txt_confirmPassword, value);
	}
	public void click_btn_submit() {
		click(btn_submit);
	}
	
	public void enter_txt_firtname(String value) {
		sendkeys(txt_firtname, value);
	}
	public void enter_txt_lastname(String value) {
		sendkeys(txt_lastname, value);
	}
	public void enter_txt_phone(String value) {
		sendkeys(txt_phone, value);
	}
	public void enter_txt_email(String value) {
		sendkeys(txt_email, value);
	}
	public void enter_address(String value1,String value2) {
		sendkeys(txt_address_line1, value1);
		sendkeys(txt_address_line2, value2);
	}
	public void enter_txt_City(String value) {
		sendkeys(txt_City, value);
	}
	public void enter_txt_State(String value) {
		sendkeys(txt_state, value);
	}
	public void enter_txt_postalCode(String value) {
		sendkeys(txt_postalCode, value);
	}
	public void enter_dropdown_country(String value) {
			click(dropdown_country);
			sendkeys(dropdown_country, value, Keys.ENTER);
		//dropDown(dropdown_country, value.toUpperCase() + " ");
	}


	// validation
	public void waitUntilRegisteNotLoaded() {
		boolean isPageLoad = waitUntilTitleFound(RegistrationPageTitle);
		if(isPageLoad) {
			System.out.println("Register Page Loaded");
		}else {
			System.out.println("Register Page not loaded");
		}
	}



}



