package net.promx.sys;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class Ctrl_V_class {
	
	 // This method writes a string to the system clipboard.
    // otherwise it returns null.
    public static void setClipboard_ctrl_c(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }
	
    //use the robot class 
   
    public static void type_ctrl_v(WebDriver driver) {
    	try
    	{
    	    Robot r = new Robot();
    	    r.keyPress(KeyEvent.VK_CONTROL);
    	    r.keyPress(KeyEvent.VK_V);
    	    Thread.sleep(1000);
    	    r.keyRelease(KeyEvent.VK_CONTROL);
    	    r.keyRelease(KeyEvent.VK_V);

    	}
    	catch(Exception e)
    	{

    	}

}
    
    
    public static void Enter (WebDriver driver) {
    	try
    	{
    	    Robot r = new Robot();
    	    r.keyPress(KeyEvent.VK_ENTER);
    	   
    	    r.keyRelease(KeyEvent.VK_ENTER);

    	}
    	catch(Exception e)
    	{

    	}

}	
    public static void Tab (WebDriver driver) {
    	try
    	{
    	    Robot r = new Robot();
    	    r.keyPress(KeyEvent.VK_TAB);
    	   
    	    r.keyRelease(KeyEvent.VK_TAB);

    	}
    	catch(Exception e)
    	{

    	}

}


}
