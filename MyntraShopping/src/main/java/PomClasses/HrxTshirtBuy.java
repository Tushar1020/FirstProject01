package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrxTshirtBuy 

//=================================================PAGE2===============================================================================================
{
	
	

	@FindBy (xpath ="//img[@alt='HRX by Hrithik Roshan Men Yellow Printed Cotton Pure Cotton T-shirt']") 
	private WebElement YellowTshirtL;
	
	
	
//------------------------------------------------------constructor------------------------------------------------------------------------------------
	private WebDriver driver;
	
	

	public HrxTshirtBuy(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
        this.driver = driver;
		
	}
	
	//---------------------------------------------------methods---------------------------------------------------------------------------------------
	
	public void ClickOnYellowTshirt()
	
	{
		
		YellowTshirtL.click();
}
}
