package za.co.mukuru.page.elements;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends PageElementBase{
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="search_query_top")
	public WebElement search;
	
	@FindBy(name ="submit_search")
	public  WebElement searchIcon;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[1]")
	public  WebElement productOutputMessage;
	
	@FindBy(className ="alert-warning")
	public  WebElement failureOutputMessage;
	
}
