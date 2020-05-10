package jiemworkshop.module;

import org.openqa.selenium.WebDriver;

import jiemworkshop.constant.ApplicationConstant;
import jiemworkshop.driverfactory.DriverFactory;

public class App {
	static WebDriver driver = null;
	public static void openAut() {
		driver = DriverFactory.getWebDriver(ApplicationConstant.browsername);
		driver.get(ApplicationConstant.ApplicationURL);
	}
	
	public static void closeAut() {
		DriverFactory.quitWebDriver();
	}
	
	
	
}	
