package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import demo.Login;
import demo.TestBase;

public class TS_Login extends TestBase{

	Login lg;
	
	@Test(priority=0)
	public void intializePageFactory() {
		lg=PageFactory.initElements(driver, Login.class);
		
	}
	
	@Test(priority=1)
	public void login() throws Exception {
		try {
			lg.login();
		}catch (Exception e) {
			throw e;
		}
	}
}
