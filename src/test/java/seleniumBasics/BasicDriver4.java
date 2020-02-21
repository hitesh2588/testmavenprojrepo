package seleniumBasics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BasicDriver4 {
	
	@Test
	public void launchSite() throws Exception {
		
		EdgeDriver e= new EdgeDriver();
		
		e.get("http://yahoo.com");
		
		//Developer mode should be enabled --- Windows settings -- Update and Security -- For Develoepr -- Developer mode
		// post EdgeHTML version 18.0 WebDriver is a part of the windows update itself and no standalone driver executable will be provided by microsoft.
		// Go Settings -- App & features -- Optional features -- in the feature list check for Microsoft WebDriver installed -- if not add this feature exclusively
				
		Thread.sleep(5000);
		e.quit();
		
	}
	
	
}
