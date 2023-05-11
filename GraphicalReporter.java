package coreComponents;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GraphicalReporter {
  @Test
  public void excuteReport() {
	  ExtentReports report=new ExtentReports("E:/PROGRAMS/complex_Design_Patttern_Framework/a.html",true);
	  ExtentTest test=report.startTest("My Sample Report");
	  test.log(LogStatus.PASS,"I have successfully open a browser");
	  test.log(LogStatus.ERROR,"My title is not matched with expected "); 
	  test.log(LogStatus.FAIL,"Logout is available on different location");
	  test.log(LogStatus.WARNING,"No susch a element exception");
      report.endTest(test);
      report.flush();
  }

}
