package stc.com.sltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  try
	  {
	  String strChromePath="D:\\Satish\\05DemoApps\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe";	
System.setProperty("webdriver.chrome.driver", strChromePath);
System.out.println("----------TEST ______");
System.out.println("PARTH Comments");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/Satish/05DemoApps/demo.html");
driver.findElement(By.id("fname")).sendKeys("Helllllo");
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
