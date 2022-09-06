package TestCases;

import static org.testng.Assert.assertEquals;

import javax.swing.text.Utilities;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadExcelfile;
import Utility.ScreenshotCapture;

public class LoginPageTest extends TestBase  {

	LoginPage page;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		page = new LoginPage();
	}
	
	@Test(invocationCount=2)//(groups="sanity")
	public void verifykitelogoTest() throws Exception {

		page.verifykitelogo();
	}
	
	@Test//(groups="retesting")
	public void verifykiteloginTest() throws Exception {

		page.verifykitelogin();
	}
	
	@Test//(groups="sanity")
	public void verifylogintokitelabelTest() throws Exception {
		String exp = ReadExcelfile.readexcelsheetfile(2, 1);
//		boolean act = page.verifylogintokitelabel();
//		Assert.assertEquals(act,exp, "Label displayed correctly");
	}
	
	@Test
	public void verifyTitleTest() throws Exception {
		String exp = ReadExcelfile.readexcelsheetfile(3, 0);
		String act = page.verifyTitle();
		Assert.assertEquals(act, exp, "Title is displayed correctly");
//		SoftAssert sa = new SoftAssert();
////		Assert.assertEquals(act, exp);
//		sa.assertAll();
	}
	
//	@Test//(groups="sanity")
//	public void verifyioslogo() {
//		page.verifyioslogo();
//	}
	
	@AfterMethod//(groups="sanity")
	public void exit(ITestResult N) throws Exception {
		
		if(ITestResult.FAILURE==N.getStatus()) {
			ScreenshotCapture.capturescreenshotfailedTc(driver, N.getName());
		}
		driver.close();
	}
	
	
	
	
	
}
