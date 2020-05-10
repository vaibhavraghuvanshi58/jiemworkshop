package jiemworkshop.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jiemworkshop.constant.ApplicationConstant;



public class DriverFactory {
	
	private DriverFactory() {

	}

	public static WebDriverWait wait = null;
	public static WebDriver driver = null;
	public static WebDriver getWebDriver(String browserName) {
		if(driver == null) {
			// we can create object
			switch(browserName) {
			case "Chrome":
			case "chrome":
			case "Google chrome":
				getChromeDriver();
				break;
			case "firefox":
			case "mozilla":
			case "Mozilla":
				getMozillaDriver();
				break;
			case "ie":
			case "internetexplorer":
			case "IE":
				getIEDriver();
				break;

			default: break;
			}
		}
		return driver;
	}

	private static void getChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstant.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ApplicationConstant.implecitWait,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ApplicationConstant.pageLoadWait, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, ApplicationConstant.explicitWait);
	}

	private static void getMozillaDriver() {
		System.setProperty("webdriver.gecko.driver", ApplicationConstant.MOZILLA_DRIVER_PATH);
		driver = new FirefoxDriver();

	}
	private static void getIEDriver() {
		System.setProperty("webdriver.ie.driver", ApplicationConstant.IE_DRIVER_PATH);
		driver = new InternetExplorerDriver();

	}
	
	public static void quitWebDriver() {
		try {
			driver.quit();
			driver = null;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
			
 
}
