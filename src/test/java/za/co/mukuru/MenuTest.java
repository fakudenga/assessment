package za.co.mukuru;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import za.co.mukuru.page.elements.MenuPage;

public class MenuTest extends  Base{
	private MenuPage menupage;
	
	@Test
	public void menu() throws InterruptedException {
		menupage = new MenuPage(driver);
		driver.manage().window().maximize();	
		menupage.tShirtLink.click();
		Thread.sleep(3000);
	}
	
	@BeforeMethod
	private void openBrowser() {
		
		openChromeBrowser(); 
		
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		closeDriver();
	}
	
}
