package knowledgeWare_Page_Actions;

import org.openqa.selenium.WebDriver;

import knowledgeWare_Page_Locators.RegisterThree_Page_Locator;
import webCommonFunctions.WebElementCommon;
import webCommonFunctions.WebTextBox;

public class RegisterThree_Page_Action {
	WebDriver driver = null;
	RegisterThree_Page_Locator regThreePL = null;
	public RegisterThree_Page_Action(WebDriver driver) {
		this.driver = driver;
		regThreePL = new RegisterThree_Page_Locator(driver);
	}
	
	public void enterCity(String city) {
		if(WebElementCommon.isClickable(regThreePL.getCity())) {
			WebTextBox.sendInput(regThreePL.getCity(), city);
		}
	}
	
	public void enterPinCode(String pinCode) {
		if(WebElementCommon.isClickable(regThreePL.getPinCode())) {
			WebTextBox.sendInput(regThreePL.getPinCode(), pinCode);
		}
	}
	
	public void performPageThreeAction(String city, String pinCode){
		enterCity(city);
		enterPinCode(pinCode);
	}
}
