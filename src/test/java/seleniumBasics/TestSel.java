package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar Repository\\JAR 2018\\SeleniumJARSLatest\\chromedriver_win32_V76\\chromedriver.exe");
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
		// driver.findElement(By.xpath(".//a[text()='Women']")).click();
		 WebElement ele = driver.findElement(By.xpath(".//a[text()='Women']"));
		 
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 
		 executor.executeScript("document.getElementsByClassName('sf-with-ul')[3].style.backgroundColor='red'");
		 
		 //click on tops in 2nd page
		 
		 /*try {
			 
//			 WebElement ele = driver.findElement(By.xpath(".//*[text()='Dresses']"));
			// JavascriptExecutor executor = (JavascriptExecutor)driver;
			// executor.executeScript("arguments[0].setAttribute('style',argument[1])", ele,"color: red");
			 
			 ((JavascriptExecutor) driver).executeScript("document.getElementsByTagName('a')[3].style.backgroundColor = 'lightblue';");
			 
//		 driver.findElement(By.xpath(".//a[@title='Tops']")).click();
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }finally {
		 Thread.sleep(5000);
		 
		 driver.close();*/
		 }
	}

