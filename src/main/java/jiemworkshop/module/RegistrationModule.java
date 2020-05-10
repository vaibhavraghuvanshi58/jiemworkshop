package jiemworkshop.module;

import jiemworkshop.helper.GlobalMap;
import jiemworkshop.pages.HomePage;
import jiemworkshop.pages.RegisterPage;

public class RegistrationModule {
	static RegisterPage register = new RegisterPage();
	
	public static boolean register(String firstname, String lastname, 
			String phone, String email,String address1, String city,String state,
			String postalCode, String country, String password) {
		HomePage homepage = new HomePage();
		homepage.click_lnk_RegisterButton();
		
		fillContactInformation(firstname, lastname, phone, email);
		fillMailingInformation(address1, "", city, state, postalCode, country);
		fillUserInformation(email, password, password);
		register.click_btn_submit();
		boolean successStatus = register.isRegistrationSuccess();
		if(successStatus) {
			GlobalMap.put("USERNAME", email);
			GlobalMap.put("PASSWORD", password);
		}
		return successStatus;
	}
	
	public static void fillContactInformation(String firstname, String lastname, String phone, String email) {
		register.waitUntilRegisteNotLoaded();
		register.enter_txt_firtname(firstname);
		register.enter_txt_lastname(lastname);
		register.enter_txt_phone(phone);
		register.enter_txt_email(email);
	}
	
	public static void fillMailingInformation(String address1, String address2, String city,String state, String postalCode, String country) {
		register.waitUntilRegisteNotLoaded();
		register.enter_address(address1, address2);
		register.enter_txt_City(city);
		register.enter_txt_State(state);
		register.enter_txt_postalCode(postalCode);
		register.enter_dropdown_country(country);
	}
	
	public static void fillUserInformation(String email, String password, String confirmpassword) {
		register.waitUntilRegisteNotLoaded();
		register.enter_txt_username(email);
		register.enter_txt_password(password);
		register.enter_txt_confirmPassword(confirmpassword);
	}
	
	
}
