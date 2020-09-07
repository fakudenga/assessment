package za.co.mukuru.page.elements;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends PageElementBase{
	
	public RegistrationPage(WebDriver driver) {   	
       super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement signInButton;
	
	@FindBy(xpath="//*[@id=\"email_create\"]")
	public WebElement emailReg;
	
	@FindBy(name="SubmitCreate")
	public WebElement createButton;	
	
	@FindBy(id="id_gender2")
	public WebElement genderMrs;
		
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	public WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	public WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	public WebElement address;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	public WebElement city;
	
	@FindBy(xpath="//*[@id=\"id_state\"]")
	public WebElement state;
	@FindBy(xpath="//*[@id=\"postcode\"]")
	public WebElement zip;
	
	@FindBy(xpath="//*[@id=\"id_country\"]")
	public WebElement country;
	
	@FindBy(xpath="//*[@id=\"phone_mobile\"]")
	public WebElement mobilePhone;
	
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	public WebElement registerButton;
	
	@FindBy(xpath="//*[@id=\"account-creation_form\"]/div[2]/p[5]")
	public WebElement clickAway;
	
	
}
