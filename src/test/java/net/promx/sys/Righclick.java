package net.promx.sys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Righclick {
	
	public static void main (WebDriver driver, By by) {
		
		 WebElement element; 
		 element = driver.findElement(by);
		 Actions action = new Actions(driver).contextClick(element);
		
		 action.build().perform();  /* this will perform right click */
			}

}
