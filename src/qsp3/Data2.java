package qsp3;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Data2 extends Generic_Script
{
	@Test
	public void runData1()
	{
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void runData2()
	{
		Reporter.log("HIiiiiiiiiiiii", true);
	}
}

