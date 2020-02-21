package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Firefox_OptionsExample {

	public static void main(String[] args) {

		// pre requisites - work on 1,2 versions back, turn off automatic updates
		// (pre-requisites for firefox)
		// logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null"); // this will stop firefox browser logs
																					// from printing on the console
//		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"D:\\firefox.log"); // if you want to log the firefox browser output logs in a file

//		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,System.getProperty("user.dir")+"\\firefox.log");

		// binary

		FirefoxOptions options = new FirefoxOptions();
//		 options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); -- not working as of now

		// Profiling
		// firefox.exe -p profilemanager -- to see all the firefox profiles and create a
		// new profile
		ProfilesIni allProf = new ProfilesIni();
		FirefoxProfile prof = allProf.getProfile("Mod11");

		// notifications -- turn off notifications
		prof.setPreference("dom.webnotifications.enabled", false);

		// certificate
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);

		// page load strategy

//		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);

		// proxy servers
		// one alternative is to add proxy settings in Network and internet settings
		// through control panel

		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "83.209.94.87");
		prof.setPreference("network.proxy.socks_port", 35923);

		options.setProfile(prof);

		// ctrl+shift+o --> to import all the dependencies
		WebDriver driver = new FirefoxDriver(options); // launching browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // navigating to the url
		driver.findElement(By.id("login1")).sendKeys("hello"); // typing hello
	}

}
