package pomscripts;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class AfterMethod_script extends Generic_Photo {
	@AfterMethod
	public void closeAppln(ITestResult res)
	{
		if(ITestResult.FAILURE == res.getStatus())
		{

			Generic_Photo.getPhoto(driver);
		}
		
		
	}

}
