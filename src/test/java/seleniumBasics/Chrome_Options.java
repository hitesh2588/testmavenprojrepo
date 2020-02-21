package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome_Options {

	public static void main(String[] args) {
		
		ChromeOptions ops=new ChromeOptions();
		
		ops.addArguments("--disable-notifications");
		ops.addArguments("disable-infobars");
		ops.addArguments("--start-maximized");
		ops.addArguments("--proxy-server=http://83.209.94.87:8123");
		
//		DesiredCapabilities dc = new DesiredCapabilities();
//	    dc.setCapability(ChromeOptions.CAPABILITY, ops);
	
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,System.getProperty("user.dir")+"\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	
		ChromeDriver driver= new ChromeDriver();
	}
	
}
