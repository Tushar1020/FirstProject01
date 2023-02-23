package PomClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShopingMyntra 
{
	//----------------------------------------- Page1 -------------------------------------------------------------------------------------------------
	
	
	@FindBy (xpath = "//input[@placeholder='Search for products, brands and more\']") 
	private WebElement SearchForProduct ;
	
	
	@FindBy (xpath = "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement SearchBarClick;
	
//=================================================	// constructor ==========================================================================
    
	private WebDriver driver;
	
	
	public OnlineShopingMyntra(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	//-------------------------------------//methods to perform action on web element---------------------------------------------------------------
	public void SelectSearchBar()
	{
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SearchForProduct.sendKeys("Hrx Tshirts");
	}
	 
	public void ClickOnSearch() 
	{
		SearchBarClick.click();
	}

}
