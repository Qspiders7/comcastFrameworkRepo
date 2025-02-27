

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	WebDriver driver;
	//inside the constructor we are doing initialization
	public OrganizationInfoPage(WebDriver driver) {    //if we store this object reference here then only we can use it in rule5
		this.driver=driver;
	 PageFactory.initElements(driver,this);//this constructor will takecare of loading the object,initialization
	}
	
	
	
	@FindBy (className="dvHeaderText")
	private WebElement headerMsg;
	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(id="mouseArea_Organization Name")
	private WebElement createOrgedit;
	
	@FindBy(id="mouseArea_Industry")
	private WebElement industryedit;
	
	@FindBy(name="accountname")
	private WebElement HeaderMsg;
	
	
	
	

	public WebElement getIndustryedit() {
		return industryedit;
	}




	public WebElement getCreateOrgedit() {
		return createOrgedit;
	}



	@FindBy(id = "dtlview_Phone")
	private WebElement phonenumberEdit;

	public WebElement getPhonenumberEdit(String phonenumber) {
		return phonenumberEdit;
	}

	


	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	

}
