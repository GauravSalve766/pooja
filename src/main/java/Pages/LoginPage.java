package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.TestBase;
import Utility.ReadPropertyFile;

public class LoginPage extends TestBase {

//	@FindBy(xpath = "//h2[@class='userid']") private WebElement useridtext;
	@FindBy(xpath = "//input[@id='userid']") private WebElement useridtextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordtextbox;
	@FindBy(xpath = "//h2[text()='Login to Kite']") private WebElement logintokitelabel;
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kitelogo;
	@FindBy(xpath = "//img[@alt='Kite iOS']") private WebElement ioslogo;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginbutton;
	@FindBy(xpath = "//input[@id='pin']") private WebElement pintextbox;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement continuebutton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public boolean verifyuserid() {
//		return useridtext.isDisplayed();
//	}
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	
	public void verifykitelogo() {
		
		kitelogo.isDisplayed();
	}
	
	public void verifykitelogin() throws Exception {
		
		useridtextbox.sendKeys(ReadPropertyFile.readpropertyfile("userid"));
		passwordtextbox.sendKeys(ReadPropertyFile.readpropertyfile("password"));
		loginbutton.click();
//		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		pintextbox.sendKeys(ReadPropertyFile.readpropertyfile("pin"));
		continuebutton.click();
		
	}
	
	public boolean verifylogintokitelabel() {
		
		return logintokitelabel.isDisplayed();
	}
	
	public boolean verifyioslogo() {
		
		return ioslogo.isDisplayed();
	}
	
	
	
	
}
