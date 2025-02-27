

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver;

	// inside the constructor we are doing initialization
	public ContactPage(WebDriver driver) { // if we store this object reference here then only we can use it in rule5
		this.driver = driver;
		PageFactory.initElements(driver, this);// this constructor will takecare of loading the object,initialization
	}

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createcontactbtn;

	@FindBy(id="mouseArea_Organization Name")
	private WebElement actOrgName;

	@FindBy(className = "dvtCellInfo")
	private WebElement actorgname;
	
	@FindBy(name="support_start_date")
	private WebElement supportstartdate;
	
	@FindBy(name="support_end_date")
	private WebElement supportenddate;

	public WebElement getSupportstartdate() {
		return supportstartdate;
	}

	public WebElement getSupportenddate() {
		return supportenddate;
	}

	

	public WebElement getCreatecontactbtn() {
		return createcontactbtn;
	}

	public WebElement getActOrgName() {
		return actOrgName;
	}

	

}
