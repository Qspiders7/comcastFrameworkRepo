

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}



	public WebElement getSearchdropdown() {
		return searchdropdown;
	}



	public WebElement getSearchbtn() {
		return searchbtn;
	}


	WebDriver driver;
	//inside the constructor we are doing initialization
	public OrganizationPage(WebDriver driver) {    //if we store this object reference here then only we can use it in rule5
		this.driver=driver;
	 PageFactory.initElements(driver,this);//this constructor will takecare of loading the object,initialization
	}
	

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	@FindBy (className="detailedViewTextBox")
	private WebElement enterPhonenumber;

	@FindBy(name="industry")
	private WebElement dropdownindustry;
//inside the constructor we are doing initialization
	
	@FindBy(name="search_text")
	private WebElement searchtextfield;
	
	@FindBy(name="search_field")
	private WebElement searchdropdown;
	
	@FindBy(name="submit")
	private WebElement searchbtn;
	
	


	public WebElement getCreateNewOrgBtn() {//to navigate to create new organization only one action is enough soo
		//use getter methods to perform action no need of business methods
		return createNewOrgBtn;
	}



	public WebElement getEnterPhonenumber() {
		return enterPhonenumber;
	}
	

	
	

}