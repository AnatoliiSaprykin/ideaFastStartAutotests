package net.promx.implementation;

import net.promx.pageObject.FS_Account;
import net.promx.sys.Credentials;
import net.promx.sys.Load_CRM_enter_Credentials;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;





public class Test_Create_Account {
	
	private static final String crm_url_fs = Credentials.crm_url_fs;
	private WebDriver driver;
		

	
	@Before
	public void SetUp() throws Exception {

	//driver = system_classes.Sys_DriverChooseClass.getDriver("chrome");
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	//Thread.sleep(4000);

	
	}
	
	@Test
	public void test() throws Exception {
		driver.get(crm_url_fs);
		
		Load_CRM_enter_Credentials.enter_cred(driver);
		
		FS_Account.main(driver);
		
		
		
		
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();

}
}
