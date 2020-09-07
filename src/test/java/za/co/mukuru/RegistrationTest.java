package za.co.mukuru;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import za.co.mukuru.page.elements.RegistrationPage;

public class RegistrationTest extends Base{
	
	private RegistrationPage regPage;
	@BeforeMethod
	private void openBrowser() 
	{
		openChromeBrowser(); 
		
	}
			
	@Test
	public void customerRegistration() throws InterruptedException {
		
		driver.manage().window().maximize();
		regPage = new RegistrationPage(driver);
		
		regPage.signInButton.click();
		Thread.sleep(1000);
		regPage.emailReg.sendKeys("famttgest1@gmail.com");	
		Thread.sleep(1000);
		regPage.createButton.click();	
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account-creation_form\"]")));
		
		regPage.firstName.sendKeys("Fadzi");
		regPage.clickAway.click();
		regPage.lastName.sendKeys("Kay");
		regPage.clickAway.click();
		regPage.address.sendKeys("1 Marshal road");
		regPage.password.sendKeys("Africa1");
		regPage.city.sendKeys("Pretoria");
		
		Select statedropdown = new Select(regPage.state); 
		statedropdown.selectByIndex(2);
		
		regPage.mobilePhone.sendKeys("400005678");
		regPage.zip.sendKeys("64800");
		
		Select countrydropdown = new Select(regPage.country); 
		countrydropdown.selectByIndex(1);
		
		Thread.sleep(1000);
		regPage.registerButton.click();
		Thread.sleep(1000);
		Assert.assertEquals("My account - My Store", driver.getTitle());
		Thread.sleep(1000);
	}


	
	@AfterMethod
	public void closeBrowser() 
	{
		closeDriver();
	}
	

}
