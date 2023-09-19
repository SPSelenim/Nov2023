package sltest2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public String strChromePath = "D:\\Satish\\05DemoApps\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe";
	public WebDriver driver = null;
	public String myPath = "C:\\Users\\Parth\\git\\Nov2023\\src\\main\\java\\sltest2\\my.properties";
	public Properties p = null;
	public File F = null;
	public FileInputStream fis = null;

	public void init() throws IOException {
		System.setProperty("webdriver.chrome.driver", strChromePath);
		driver = new ChromeDriver();
		try {

			F = new File(myPath);
			fis = new FileInputStream(F);

			p = new Properties();
			try {
				p.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public WebElement getElementID(String str) {
		WebElement webID = null;
		try {

			webID = driver.findElement(By.id(p.getProperty(str)));
System.out.println(p.getProperty(str));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return webID;
	}

	public WebElement getElementID1(String str) {
		WebElement webID1 = null;
		try {

			webID1 = driver.findElement(By.id(p.getProperty(str)));
			System.out.println(p.getProperty(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return webID1;
	}

}
