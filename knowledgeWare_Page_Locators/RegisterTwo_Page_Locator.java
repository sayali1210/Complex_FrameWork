package knowledgeWare_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterTwo_Page_Locator {
	WebDriver driver = null;
	public RegisterTwo_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Mandatory, otherwise all elements return null
	}
	@FindBy(name="First_Name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(name="Last_Name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(name="Email_Id")
	private WebElement emailID;
	
	public WebElement getEmailID() {
		return emailID;
	}
	
	@FindBy(name="Mobile_Number")
	private WebElement mobileNumber;
	
	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	
	@FindBy(linkText = "NEXT")
	private WebElement nextBtn;
	
	public WebElement getNextBtn() {
		return nextBtn;
	}
	
	
}
