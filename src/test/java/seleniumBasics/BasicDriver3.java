package seleniumBasics;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Test;

public class BasicDriver3 {

	@Test
	public void launchSite() throws Exception {
		
//		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Selenium Jar Repository\\JAR 2018\\SeleniumJARSLatest\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://yahoo.com");
		Thread.sleep(5000);
	
		driver.quit();
		
		// before running the test
		// Set zoom level to 100%
		//protected mode turned off and level to least position
		//security setting - allow active content check box should be enabled
		
	}

	
}
