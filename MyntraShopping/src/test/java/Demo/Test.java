package Demo;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.BuyHrxByHrithik;
import PomClasses.HrxTshirtBuy;
import PomClasses.OnlineShopingMyntra;




public class Test 
{
	public static void main(String[] args) 
	{
	
	  //  WebDriver driverTest;
	
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);              
		
		driverTest.manage().window().maximize(); 
		
		driverTest.get("https://www.myntra.com");   
		

//=======================================page 1 ===================================================================		
		
		OnlineShopingMyntra onlineshopingmyntra = new  OnlineShopingMyntra(driverTest);
		onlineshopingmyntra.SelectSearchBar();
		onlineshopingmyntra.ClickOnSearch();
		
		
		
//======================================== Page 2 =================================================================		
		
		
		HrxTshirtBuy hrxtshirtbuy = new HrxTshirtBuy (driverTest);
		hrxtshirtbuy.ClickOnYellowTshirt();
		
		
//========================================= page 3 Child ===============================================================		
		
		ArrayList<String> address = new ArrayList<String>(driverTest.getWindowHandles());
	    driverTest.switchTo().window(address.get(1));
		
	    BuyHrxByHrithik buyhrxbyHrithik = new BuyHrxByHrithik (driverTest);
		buyhrxbyHrithik.SelectSizeL();
		buyhrxbyHrithik.AddPinCode();
		buyhrxbyHrithik.CheckAvalibility();
		buyhrxbyHrithik.AddToCart();
		buyhrxbyHrithik.GoToBag();
		
		
		
		
		
	}

}
