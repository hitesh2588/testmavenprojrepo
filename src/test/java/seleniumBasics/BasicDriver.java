package seleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class BasicDriver {

	@Test
	public void launchSite() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jar Repository\\JAR 2018\\SeleniumJARSLatest\\chromedriver_win32_V76\\chromedriver.exe");
		SoftAssert as = new SoftAssert();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://yahoo.com");
		as.fail("Failed this test on purpose....!!!!");
		Thread.sleep(5000);
		driver.close();
		
		as.assertAll();
		
//		as.fail("Failed this test on purpose....!!!!");
	}

}
