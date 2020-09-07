package za.co.mukuru;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	protected WebDriver driver;
	protected String url = "http://automationpractice.com/index.php";
	
	public void openChromeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(url);
	}

	public void closeDriver()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}
}
