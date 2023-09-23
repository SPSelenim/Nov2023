package stc.com.sltest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sltest2.BaseClass;

public class NewTest extends BaseClass{
  @Test
  public void f() {
	  try
	  {
//Added Comments
		  init();
System.out.println("----------TEST ++++++______");
System.out.println("----------TEST =====______");
System.out.println("PARTH Comments");

driver.get("file:///D:/Satish/05DemoApps/demo.html");
WebElement webID=getElementID("First");

webID.sendKeys("Helllllo");
getElementID1("Last").sendKeys("Byeeee");

Thread.sleep(2000);

System.out.println("DONE");
driver.quit();
	  }
	  catch(Exception e)
	  {
		System.out.println(e.getMessage());  
	  }
  }
}
