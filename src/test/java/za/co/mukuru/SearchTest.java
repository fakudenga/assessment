package za.co.mukuru;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.co.mukuru.page.elements.SearchPage;
import za.co.mukuru.utility.TestUtils;

public class SearchTest extends Base{
	
	private SearchPage searchPage;
	
	@Test
	public void searchProductFound() throws InterruptedException {
		
		driver.manage().window().maximize();			
		searchPage.search.sendKeys("printed dresses");
		Thread.sleep(1000);
		searchPage.searchIcon.click();
		Thread.sleep(1000);
		
		String searchResults = searchPage.productOutputMessage.getText();
		
		Assert.assertEquals(searchResults, TestUtils.PRODUCT_FOUND_MESSAGE);
		
	}

	@Test
	public void searchProductNotFound() throws InterruptedException {
		
		driver.manage().window().maximize();			
		searchPage.search.sendKeys("cape twon");
		Thread.sleep(1000);
		searchPage.searchIcon.click();
		Thread.sleep(1000);
		String actualErrorMessage = searchPage.failureOutputMessage.getText();
				
		Assert.assertEquals(actualErrorMessage, TestUtils.PRODUCT_NOT_FOUND_MESSAGE);
		Thread.sleep(1000);
	}
	

	@BeforeMethod
	private void openBrowser() 
	{	
		openChromeBrowser(); 
		searchPage = new SearchPage(driver);
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		closeDriver();
	}
	

}
