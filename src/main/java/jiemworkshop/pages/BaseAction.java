package jiemworkshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import jiemworkshop.driverfactory.DriverFactory;

public class BaseAction {
	 void click(WebElement elem) {

	}
	 static WebDriver driver = null;

	 void click(By byRef) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.presenceOfElementLocated(byRef));
			driver.findElement(byRef).click();;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	boolean isElementExist(By byref) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.presenceOfElementLocated(byref));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	 
	 void sendkeys(By byRef, CharSequence...seq) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.presenceOfElementLocated(byRef));
			driver.findElement(byRef).sendKeys(seq);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	 void clear_sendkeys(By byRef, CharSequence...seq) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.presenceOfElementLocated(byRef));
			driver.findElement(byRef).clear();
			driver.findElement(byRef).sendKeys(seq);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	 void dropDown(By byRef, String seq) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.presenceOfElementLocated(byRef));
			Select dropdown = new Select(driver.findElement(byRef));
			dropdown.selectByVisibleText(seq);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	 String getTitle() {
		return DriverFactory.driver.getTitle();
	 }
	 
	 boolean waitUntilTitleFound(String expectedTitle) {
		try {
			driver = DriverFactory.driver;
			DriverFactory.wait.until(ExpectedConditions.titleIs(expectedTitle));
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
