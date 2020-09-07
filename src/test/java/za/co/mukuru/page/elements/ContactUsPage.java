package za.co.mukuru.page.elements;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends PageElementBase{

	public ContactUsPage(WebDriver driver) {   	
        super(driver);
	}
	
	@FindBy(id="contact-link")
	public WebElement contactLink;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="message")
	public WebElement message;
	
	@FindBy(id="submitMessage")
	public WebElement submitButton;
	
	@FindBy(id="id_contact")
	public  WebElement subjectHeading;
	
	@FindBy(className ="alert-success")
	public  WebElement successOutputMessage;
	
	@FindBy(className ="alert-danger")
	public  WebElement failureOutputMessage;
	
	@FindBy(id ="fileUpload")
	public  WebElement fileUpload;
}
