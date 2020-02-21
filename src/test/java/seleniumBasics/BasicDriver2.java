package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BasicDriver2 {

	
	@Test
	public void launchSite() throws Exception {
		
//		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"D:\\Selenium Jar Repository\\JAR 2018\\SeleniumJARSLatest\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		SoftAssert as = new SoftAssert();
//		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://yahoo.com");
		as.fail("Failed this test on purpose....!!!!");
		Thread.sleep(5000);
		driver.close();
		
		as.assertAll();
		
//		as.fail("Failed this test on purpose....!!!!");
	}

	
}
