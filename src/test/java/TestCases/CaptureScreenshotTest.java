package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadExcelfile;

public class CaptureScreenshotTest extends TestBase {

	LoginPage page;
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		page = new LoginPage();
	}
	
	@Test//(groups="sanity")
	public void verifylogintokitelabelTest() throws Exception {
		String exp = ReadExcelfile.readexcelsheetfile(2, 1);
//		boolean act = page.verifylogintokitelabel();
//		Assert.assertEquals(act,exp, "Label displayed correctly");
	}
	
	
	
	
	
	
	
}
