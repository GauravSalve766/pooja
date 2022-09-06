package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
//	public WebDriverWait wait;
	public void initialization() throws Exception {
		
	    String browsername = ReadPropertyFile.readpropertyfile("browser");
	    if(browsername.equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    }
	    else if(browsername.equals("firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    }
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(ReadPropertyFile.readpropertyfile("url"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	
	
}
