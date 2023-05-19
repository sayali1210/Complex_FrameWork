package knowledgeWare_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterThree_Page_Locator {
	WebDriver driver = null;
	public RegisterThree_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Mandatory, otherwise all elements return null
	}
	@FindBy(name="City")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	@FindBy(name="Pin_Code")
	private WebElement pinCode;
	
	public WebElement getPinCode() {
		return pinCode;
	}
}
