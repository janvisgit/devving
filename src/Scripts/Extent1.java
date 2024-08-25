package Scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent1 {
	@Test
	public void test1()
	{
		ExtentReports reports = new ExtentReports("./reports/r.html", false);
		//Created object for extent report
		
		ExtentTest test = reports.startTest("Testcase1");
		//Started test execution
		
		test.log(LogStatus.PASS, "tc passed");
		test.log(LogStatus.FAIL, "tc failed");
		test.log(LogStatus.SKIP, "tc skipped");
		//logged the status
		
		reports.endTest(test);
		//ended the testcase exec
		
		reports.flush();
		//flushed the junk
		
	}

}
