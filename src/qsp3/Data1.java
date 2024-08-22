package qsp3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Data1 
{
	@Test
	public class runData2 extends Generic_Script
	{
		public void test1()
		{
			driver.findElement(By.id("email")).sendKeys("admin");
			driver.findElement(By.name("pass")).sendKeys("manager");
			driver.findElement(By.name("loginnn")).click();
		}
	}

}
