package za.co.mukuru;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.co.mukuru.page.elements.ContactUsPage;
import za.co.mukuru.utility.TestUtils;

public class ContactUsTest extends Base{
	
	 private ContactUsPage contactUsPage; 
	
	@BeforeMethod
	private void openBrowser() {
		
		openChromeBrowser(); 
		contactUsPage = new ContactUsPage(driver);
	}
	
	@Test
	public void sendMessageSuccess() throws InterruptedException {
		
		driver.manage().window().maximize();
		contactUsPage.contactLink.click();
		Thread.sleep(1000);
		
		Select headingdropdown = new Select(contactUsPage.subjectHeading); 
		headingdropdown.selectByIndex(1);
		Thread.sleep(1000);
		
		contactUsPage.email.sendKeys("testffff@gmail.com");
		contactUsPage.message.sendKeys("A new message");
		contactUsPage.submitButton.click();
		
		Thread.sleep(1000);
		String actualMessage = contactUsPage.successOutputMessage.getText();
			
		Assert.assertEquals(actualMessage, TestUtils.EMAIL_SEND_SUCCESS_MESSAGE);
		Thread.sleep(1000);
	}
	@Test
	public void sendMessageFail() throws InterruptedException {
		
	
		driver.manage().window().maximize();
		contactUsPage.contactLink.click();
		Thread.sleep(1000);
		
		Select headingdropdown = new Select(contactUsPage.subjectHeading); 
		headingdropdown.selectByIndex(2);
		Thread.sleep(1000);
		
		contactUsPage.email.sendKeys("mo@gggg.com");
		contactUsPage.submitButton.click();
		
		Thread.sleep(1000);
		String actualMessage = contactUsPage.failureOutputMessage.getText();
		
		Assert.assertEquals(actualMessage, TestUtils.MANDATORY_MESSAGE_ERROR);
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		closeDriver();
	}
	

}
