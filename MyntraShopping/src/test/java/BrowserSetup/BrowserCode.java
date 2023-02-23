package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCode 
{
  
	
	
	public  static WebDriver OpenChromeTest()
	{
		System.setProperty("webdriver.chrome.driver ", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver OpenFirefoxTest()
	{
		System.setProperty("webdriver.gecko.driver ", "D:\\Selenium\\geckodriver-v0.32.2-win32");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static  WebDriver OpenMicrosoftEdge()
	{
		System.setProperty("webdriver.gecko.driver ", "D:\\Selenium\\edgedriver_win64");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
