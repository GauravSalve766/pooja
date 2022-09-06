package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {

	
	DashboardPage page;
	LoginPage login;
	
	@BeforeMethod//(groups="sanity")
	public void setup() throws Exception {
		initialization();
		login = new LoginPage();
		login.verifykitelogin();
		page = new DashboardPage();
	}
	
	
//	@Test//(enabled=true, groups="sanity")
//	public void verifynoticeparagraphTest() throws Exception {
////		page.verifykitelogin();
//		page.verifynoticeparagraph();
//	}
//	
//	@Test//(enabled=true, groups="retesting")
//	public void verifynicknameTest() throws Exception {
////		page.verifykitelogin();
//		page.verifynickname();
//	}
//	
//	@Test//(groups="sanity")
//	public void verifyongcsharebuyTest() throws Exception {
////		page.verifykitelogin();
//		page.verifyongcsharebuy();
//	}
	
	@Test
	public void verifyorderbuttonTest() {
		page.verifyorderbutton();
	}
	
	@AfterMethod//(enabled=true,groups="sanity")
	public void end() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
