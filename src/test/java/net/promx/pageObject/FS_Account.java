package net.promx.pageObject;

import net.promx.sys.Ctrl_V_class;
import net.promx.sys.Sys_clickAndWait;
import net.promx.sys.WaitClickable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class FS_Account {
	
	public static void waitToLoad (WebDriver driver) {
		//Wait_custom.waitForLoad(driver);}
	}
	WebDriver driver;
	public static WebElement element = null;
	
	
	/* Sales down-arrow button */
	
	public static WebElement Sales_down (WebDriver driver) {
		return  driver.findElement(By.cssSelector("#TabSFA"));		
	}
	
	
	public static void click_Sales_down (WebDriver driver) {
		Ctrl_V_class.Tab(driver);
		//Wait_custom.waitForLoad(driver);
		
		Sys_clickAndWait.waitForElementPresent(driver,  By.cssSelector("#TabSFA"), 5);
		WaitClickable.main(driver, By.cssSelector("#TabSFA"), 15); //waits for Sales arrow to be clickable
		
					element = Sales_down(driver);
					element.click();
					
					System.out.println("Sales down-arrow button");
				
	
		
		//Sys_clickAndWait.waitForElementPresent(driver, By.xpath(".//*[@id='nav_accts']"), 15);//waits for account icon to be  present
	}
	
	/* Click Accounts icon */	
	
	public static void click_Accounts (WebDriver driver) throws Exception {
		
		//Wait_custom.waitForLoad(driver); //====================================== AJAX wait page to load
		
		//WaitClickable.main(driver, By.xpath(".//*[@id='nav_accts']"), 10);  //waits for Accounts button to be clicable
		
		element = driver.findElement(By.xpath(".//*[@id='nav_accts']"));
		element.click();
		
		System.out.println("Click Accounts icon");
		
		//Wait_custom.waitForLoad(driver);
		
		Sys_clickAndWait.waitForElementPresent(driver, By.xpath(".//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span/a"), 10);//New button is present
		//WaitClickable.main(driver, By.xpath(".//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span/a"), 15);  //New button is clickable
		
		}
	
	
	/*Click New  button*/	
	
	public static WebElement new_button (WebDriver driver) {		
		
		return driver.findElement(By.xpath("//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span")); 
		
	}	
	
	public static void click_new (WebDriver driver) throws Exception { //click New button
		element = new_button(driver);
		Ctrl_V_class.Tab(driver);
		//Wait_custom.waitForLoad(driver);
		
			
		element.sendKeys(Keys.ENTER);
		System.out.println("1 enter on New button");
		//Wait_custom.waitForLoad(driver);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id='account|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.account.NewRecord']/span"))).doubleClick().build().perform(); //DOUBLECLICK
		System.out.println("2 enter on New button");
		
		//Wait_custom.waitForLoad(driver);
		Ctrl_V_class.setClipboard_ctrl_c("1 Account nathan test");
		System.out.println("click_new + buffer" );
				
		}
	/* ==================       Robot Enter         ===================*/
	
	
	
	/* Account name field*/	
   
	
	public static WebElement name_field (WebDriver driver) {
		return driver.findElement(By.cssSelector("#name_i"));
	}
	
	public static void fill_name_field (WebDriver driver) throws InterruptedException {
		
		//name_field(driver).click();
		//Thread.currentThread().wait(1000);
		
				
		
		//Thread.currentThread().wait(2000);

		Ctrl_V_class.type_ctrl_v(driver);
		System.out.println("CTRL + V");

		
	} 
	
	
	
	//main
	
	public static void main(WebDriver driver) throws Exception {
		waitToLoad(driver);
		click_Sales_down(driver);
		click_Accounts(driver);
		
		click_new(driver);
		//fill_name_field(driver);
		
		
	}

}
