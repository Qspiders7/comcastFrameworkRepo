

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	WebDriver driver;

	// inside the constructor we are doing initialization
	public ContactInfoPage(WebDriver driver) { // if we store this object reference here then only we can use it in
												// rule5
		this.driver = driver;
		PageFactory.initElements(driver, this);// this constructor will takecare of loading the object,initialization
	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;

	@FindBy(id = "mouseArea_Last Name")
	private WebElement actLastName;

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getActLastName() {
		return actLastName;
	}

}
