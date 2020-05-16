package jiemworkshop.module;

import jiemworkshop.pages.HomePage;
import jiemworkshop.pages.RegisterPage;

public class HomePageModule {
	
	static HomePage homepage = new HomePage();
	public static String getTitle() {
		return homepage.getHomePageTitle();
	}
	
	public static void clickUpperMenu(String linkText) {
		homepage.click_lnk_uppermenu(linkText);
	}
}
