package jiemworkshop.constant;

public class ApplicationConstant {

	
	public static final String basePath = System.getProperty("user.dir")+"\\";
	
	public static final String PROJECT_NAME = "New Tours Automation";
	public static final String CHROME_DRIVER_PATH = basePath+"driver\\chrome\\chromedriver.exe";
	public static final String IE_DRIVER_PATH = "";
	public static final String MOZILLA_DRIVER_PATH = "";
	
	public static final String browsername= "chrome";
	public static String ApplicationURL = "http://www.newtours.demoaut.com/";
	
	public static int implecitWait = 60;
	public static int pageLoadWait = 60;
	public static int explicitWait = 10;
	
	public static void main(String[] args) {
		System.out.println(CHROME_DRIVER_PATH);
	}
	
	
}
