package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.BrowserCode;

public class TestNgExample extends BrowserCode {
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void Launchbrowser(String Browsername) {
		System.out.println("Browsername");
		if (Browsername.equals("Chrome"))
			;
		{

			driver = OpenChromeTest();
		}

		if (Browsername.equals("Firefox"));
		{
			driver = OpenFirefoxTest();
		}

		if (Browsername.equals("Edge"))
			;
		{

			driver = OpenMicrosoftEdge();
		}

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");

	}

	@Test
	public void test() {
		System.out.println("Test");
	}

	@Test
	public void test1() {
		System.out.println("Test");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}

}
