package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//===============================================PAGE3==============================================================================================

public class BuyHrxByHrithik 
{

	 @FindBy (xpath =("//button[@class='size-buttons-size-button size-buttons-size-button-default\'])[3]"))
     private WebElement selectSizeL;
	 
	 @FindBy (xpath ="//input[@placeholder='Enter pincode']")
     private WebElement addPinCode;
	 
	 @FindBy (xpath ="//input[@class='pincode-check pincode-button']")
     private WebElement checkAvalibity;
	 
	 @FindBy (xpath ="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
     private WebElement clickOnAddtoCart;
	 
	 @FindBy (xpath = "//span[@class='myntraweb-sprite pdp-whiteRightArrow sprites-whiteRightArrow']")
     private WebElement gotoCart;
	 
//==============================================constrctor==============================================================================================	 
	private WebDriver driver;
	 
	public BuyHrxByHrithik(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
			s
		}
	 
//================================================= METHODS ======================================================	 
	 public void SelectSizeL()
	 {
		 selectSizeL.click();
	 }
	 
	 
	 public void AddPinCode()
	 {
		 addPinCode.sendKeys("410505");
	 }
	 
	 public void CheckAvalibility()
	 {
		 checkAvalibity.click();
	 }
	 
	 public void AddToCart()
	 {
	  clickOnAddtoCart.click();
	 }
	
	 public void GoToBag()
	 {
		gotoCart.click();
	 }
	
	
	
}
