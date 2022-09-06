package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture {

	public static void capturescreenshotfailedTc(WebDriver driver,String methodname) throws Exception {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\FailedScreenshotTC/"+ methodname+".png");
		FileHandler.copy(source, destination);
		
	}
}
