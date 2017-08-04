package net.promx.sys;

import net.promx.sys.Credentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Load_CRM_enter_Credentials {
	
	WebDriver driver;
	public static WebElement element = null;
	
	
	
	
	
/* Email or Phone field on https://login.microsoftonline.com */
	
	public static WebElement Email_field (WebDriver driver) {
		return driver.findElement(By.cssSelector("#cred_userid_inputtext"));
		
	}
	
	
	public static void Fill_Email_field (WebDriver driver) {
		element = Email_field(driver);
		
		element.clear();
		element.sendKeys(Credentials.emailTrial_fs);

		Wait_custom.waitForLoad(driver);
		
		}

	
	
/* Password field on https://login.microsoftonline.com */
	
	public static WebElement Password_field (WebDriver driver) {
		return driver.findElement(By.cssSelector("#cred_password_inputtext"));
			
	}
	
	
	public static void Fill_Password_field (WebDriver driver) {
		element = Password_field(driver);
		//element.click();
		//element.clear();
		element.sendKeys(Credentials.pASSWORD);
		Wait_custom.waitForLoad(driver);
		
		}
	
/* Sign In button on https://login.microsoftonline.com */
	
	Actions builder = new Actions(driver);
	
	public static WebElement Sign_In_button (WebDriver driver) {
		element = driver.findElement(By.cssSelector("#cred_sign_in_button"));
		return element;		
	}
	
	
	public static void Push_Sign_In_button (WebDriver driver) {
		element = Sign_In_button(driver);
		
		element.sendKeys(Keys.ENTER);
		/*Actions builder = new Actions(driver);
		   builder.moveToElement(element)
		       .click(element);
		org.openqa.selenium.interactions.Action mouseoverAndClick = builder.build();
		mouseoverAndClick.perform();*/
	}
		
		
		
	
	//Main method
	
	public static void enter_cred (WebDriver driver) throws InterruptedException {
		Fill_Email_field(driver);
		Thread.sleep(1000);
		Fill_Password_field(driver);
		Thread.sleep(1000);	
		
		Push_Sign_In_button(driver);
		
	}
	
}
