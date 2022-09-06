package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	WebDriver driver = new ChromeDriver();;
	
	@Test
	public void openFb() {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.close();
	}
	
	@Test
	public void openGoogle() {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.co.in/");
		driver.close();
	}
	
	@Test
	public void openRediff() {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.rediff.com/");
		driver.navigate().to("https://www.rediff.com/");
		driver.close();
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
	
	
}
