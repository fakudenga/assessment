package za.co.mukuru;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SimpleTest extends Base
{
	@Test
	public void simpleTest()
	{
		openChromeBrowser();
		
		
		Assert.assertEquals("My Store", driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		closeDriver();
	}
}
