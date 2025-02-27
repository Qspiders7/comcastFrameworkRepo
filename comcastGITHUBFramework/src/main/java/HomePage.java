

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	//inside the constructor we are doing initialization
	public HomePage(WebDriver driver) {    //if we store this object reference here then only we can use it in rule5
		this.driver=driver;
	 PageFactory.initElements(driver,this);//this constructor will takecare of loading the object,initialization
	}
	
	
		
	public WebElement getOrgLink() {
		return orgLink;
	}



	public WebElement getContactLink() {
		return contactLink;
	}



	public WebElement getCampaignLink() {
		return campaignLink;
	}



	public WebElement getMoreLink() {
		return MoreLink;
	}



	public void navigateToCampaignPage() {
		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		campaignLink.click();//before clicking on campaign link we have to move cursor on more dropdown
	//soo we are using actions class
	}
	
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signoutLink.click();
	}
	


	@FindBy (linkText = "Organizations")//pom classes we created will be sharing to everybody soo it should be meaningful 
	private WebElement orgLink;
	
	@FindBy (linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy (linkText = "Campaigns")
	private WebElement campaignLink;
	
	@FindBy (linkText = "More")
	private WebElement MoreLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy (linkText = "Sign Out")
	private WebElement signoutLink;
	
	
	
	
	
	
}

