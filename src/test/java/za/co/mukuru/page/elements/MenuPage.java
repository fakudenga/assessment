package za.co.mukuru.page.elements;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends PageElementBase{

	public MenuPage(WebDriver driver) {   	
        super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	public WebElement tShirtLink;
	
}
