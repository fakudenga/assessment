package za.co.mukuru.page.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageElementBase {
	
	public PageElementBase() {
		
	}
	
	public PageElementBase(WebDriver driver) {   	
        PageFactory.initElements(driver, this);
	}
}
