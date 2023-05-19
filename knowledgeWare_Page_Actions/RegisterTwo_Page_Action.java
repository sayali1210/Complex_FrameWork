package knowledgeWare_Page_Actions;

import org.openqa.selenium.WebDriver;

import knowledgeWare_Page_Locators.RegisterTwo_Page_Locator;
import webCommonFunctions.WebButton;
import webCommonFunctions.WebElementCommon;
import webCommonFunctions.WebTextBox;

public class RegisterTwo_Page_Action {
	WebDriver driver = null;
	RegisterTwo_Page_Locator regTwoPL = null;
	public RegisterTwo_Page_Action(WebDriver driver) {
		this.driver = driver;
		regTwoPL = new RegisterTwo_Page_Locator(driver);
	}
	
	public void enterFirstName(String fName) {
		if(WebElementCommon.isClickable(regTwoPL.getFirstName())) {
			WebTextBox.sendInput(regTwoPL.getFirstName(), fName);
		}
	}
	
	public void enterLastName(String lName) {
		if(WebElementCommon.isClickable(regTwoPL.getLastName())) {
			WebTextBox.sendInput(regTwoPL.getLastName(), lName);
		}
	}
	
	public void enterEmailID(String email) {
		if(WebElementCommon.isClickable(regTwoPL.getEmailID())) {
			WebTextBox.sendInput(regTwoPL.getEmailID(), email);
		}
	}
	
	public void enterMobileNum(String mobNo) {
		if(WebElementCommon.isClickable(regTwoPL.getMobileNumber())) {
			WebTextBox.sendInput(regTwoPL.getMobileNumber(), mobNo);
		}
	}
	
	public void clickNext() {
		WebButton.click(regTwoPL.getNextBtn());
	}
	
	public RegisterThree_Page_Action performPageTwoAction(String fName, String lName, String email, String mobNo){
		RegisterThree_Page_Action regThreePA = null;
		try {
			enterFirstName(fName);
			enterLastName(lName);
			enterEmailID(email);
			enterMobileNum(mobNo);
			clickNext();
			regThreePA = new RegisterThree_Page_Action(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regThreePA;
	}
		
}
