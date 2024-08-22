package qsp3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends Generic_Script 
{
	@Test
	public void runData()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("loginnn")).click();
	}
	
	@Test
	public void runData2()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
	}
	

}
