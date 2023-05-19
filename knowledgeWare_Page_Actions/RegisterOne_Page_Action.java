package knowledgeWare_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import knowledgeWare_Page_Locators.RegisterOne_Page_Locator;
import webCommonFunctions.WebButton;
import webCommonFunctions.WebElementCommon;
import webCommonFunctions.WebTextBox;

public class RegisterOne_Page_Action {
	WebDriver driver = null;
	ExtentTest logger;
	RegisterOne_Page_Locator regOnePL = null;
	public RegisterOne_Page_Action(WebDriver driver, ExtentTest graphicalTest) {
		this.driver = driver;
		logger = graphicalTest;
		regOnePL = new RegisterOne_Page_Locator(driver);
	}
	
	public void enterUserName(String user) {
		WebElement userN = regOnePL.getUserName();
		if(WebElementCommon.isClickable(userN)) {
			WebTextBox.sendInput(userN, user);
			logger.log(LogStatus.PASS, "I have susccfully entered User Name");
		}else {
			logger.log(LogStatus.FAIL, "User Name not entered");
		}
	}
	
	public void enterPassword(String pass) {
		if(WebElementCommon.isClickable(regOnePL.getPassword())) {
			WebTextBox.sendInput(regOnePL.getPassword(), pass);
			logger.log(LogStatus.PASS, "I have susccfully entered Password");
		}else {
			logger.log(LogStatus.FAIL, "Password not entered");
		}
	}
	
	public void enterCinfirmPassword(String confpass) {
		if(WebElementCommon.isClickable(regOnePL.getConfirmPassword())) {
			WebTextBox.sendInput(regOnePL.getConfirmPassword(), confpass);
			logger.log(LogStatus.PASS, "I have susccfully entered Conf Password");
		}else {
			logger.log(LogStatus.FAIL, "Confirm Password not entered");
		}
	}
	
	public void clickLogin() {
		WebButton.click(regOnePL.getLoginBtn());
		logger.log(LogStatus.PASS, "I have susccfully clicked on Login");
	}
	
	public RegisterTwo_Page_Action performPageOneAction(String user, String pass, String confpass) {
		RegisterTwo_Page_Action regTwoPA = null;
		try {
			enterUserName(user);
			enterPassword(pass);
			enterCinfirmPassword(confpass);
			clickLogin();
			regTwoPA = new RegisterTwo_Page_Action(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return regTwoPA;
	}
}
