

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganizationPage {

	WebDriver driver;
	//inside the constructor we are doing initialization
	public CreatingNewOrganizationPage(WebDriver driver) {    //if we store this object reference here then only we can use it in rule5
		this.driver=driver;
	 PageFactory.initElements(driver,this);//this constructor will takecare of loading the object,initialization
	}
	
	
	
	
	
	@FindBy(name="accountname")
	private WebElement orgNameEdit;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(name="industry")
	private WebElement industrydropdown;
	
	@FindBy(id = "phone")
	private WebElement phoneNumberEdit;

	public WebElement getPhoneNumberEdit(String phonenumber) {
		return phoneNumberEdit;
	}

	public WebElement getOrgNameEdit() {
		return orgNameEdit;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createOrg(String orgName) {
		orgNameEdit.sendKeys(orgName);
		saveBtn.click();
	}
	
	public void createOrg(String orgName,String industry) {
		orgNameEdit.sendKeys(orgName);
		Select sel= new Select(industrydropdown);
		sel.selectByVisibleText(industry);
		saveBtn.click();
	}
	
	public void createOrgwithphonenumber(String orgName,String phonenumber) {
		orgNameEdit.sendKeys(orgName);
		phoneNumberEdit.sendKeys(phonenumber);
		saveBtn.click();
	}
	
	
	
	
		
	
	
}
