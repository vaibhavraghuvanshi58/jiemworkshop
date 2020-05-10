package jiemworkshop.module;

import jiemworkshop.helper.GlobalMap;
import jiemworkshop.pages.HomePage;
import jiemworkshop.pages.SignOnPage;

public class SignOnModule {
	
	static SignOnPage  signon= new SignOnPage();
	static HomePage  homepage= new HomePage();
	
 	public static void login() {
 		homepage.click_lnk_SignOffButton();
		signon.enter_txt_username(GlobalMap.getValue("USERNAME"));
		signon.enter_txt_password(GlobalMap.getValue("PASSWORD"));
		signon.click_btn_login();
	}
	
	public static void login(String username, String password) {
		homepage.click_lnk_SignOffButton();
		signon.enter_txt_username(username);
		signon.enter_txt_password(password);
		signon.click_btn_login();
	}
}	
