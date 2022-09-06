package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadExcelfile;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//div[@class='Margin available']") private WebElement marginvaluetext;
	@FindBy(xpath = "//div[@class='notice layer-2']") private WebElement noticeparagraph;
	@FindBy(xpath = "//h1[@class='page-title big']") private WebElement nicknametext;
	
	@FindBy(xpath = "//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']") private WebElement searchtextbox;
    @FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement ongcsharetext;
	@FindBy(xpath = "//button[@data-balloon='Buy']") private WebElement ongcsharebuybutton;
	@FindBy(xpath = "//label[text()='SL']") private WebElement slradiobutton;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement qtytextbox;
	@FindBy(xpath = "//input[@label='Price']") private WebElement pricetextbox;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement triggertextbox;
	@FindBy(xpath = "//a[@class='orders-nav-item']") private WebElement orderbutton;
	
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifynoticeparagraph() {
		return noticeparagraph.isDisplayed();
	}
	
	public boolean verifynickname() {
		return nicknametext.isDisplayed();
	}
	
	public void verifyongcsharebuy() throws Exception {
		searchtextbox.sendKeys(ReadExcelfile.readexcelsheetfile(0, 0));
		Thread.sleep(2000);
		Actions n = new Actions(driver);
		n.moveToElement(ongcsharetext).build().perform();
		Thread.sleep(2000);
		ongcsharebuybutton.click();
		slradiobutton.click();
		n.moveToElement(qtytextbox).doubleClick().build().perform();
		qtytextbox.sendKeys(ReadExcelfile.readexcelsheetfile(0, 1));
		n.moveToElement(pricetextbox).doubleClick().build().perform();
		pricetextbox.sendKeys(ReadExcelfile.readexcelsheetfile(0, 2));
		n.moveToElement(triggertextbox).doubleClick().build().perform();
		triggertextbox.sendKeys(ReadExcelfile.readexcelsheetfile(0, 3));
	}
	
	public void verifyorderbutton() {
		orderbutton.click();
	}

}
