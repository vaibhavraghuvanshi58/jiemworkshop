package jiemworkshop.pages;

import org.openqa.selenium.By;

public class SignOnPage extends BaseAction {
	private static By txt_username = By.xpath("//input[@name='userName']") ;
	private static By txt_password = By.xpath("//input[@name='password']"); 
	private static By btn_login = By.xpath("//input[@name='login']");
	
	
	public  void enter_txt_username(String value) {
		sendkeys(txt_username,value);
	}
	
	public  void enter_txt_password(String value) {
		sendkeys(txt_password,value);
	}

	
	public  void click_btn_login() {
		click(btn_login);
		
	}

}
