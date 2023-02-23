package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.YT.XXXTENTACION_youtube;
import PomClasses.YT.XxxTen_youtube;
import PomClasses.YT.Youtube;

public class TestYoutube {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver ", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");                   
		
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
		
		Youtube youtube = new Youtube();
		youtube.clickonSearchbar();
		
		
		
		XXXTENTACION_youtube xxxtentacion_youtube = new XXXTENTACION_youtube();
		xxxtentacion_youtube.clickon();
		
		
		XxxTen_youtube xxxten_youtube = new XxxTen_youtube();
		xxxten_youtube.clickonplaylist();
		xxxten_youtube.viewplaylist();
	}

}
