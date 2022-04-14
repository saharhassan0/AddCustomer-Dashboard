package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerData extends PageBase{
	
	public CustomerData(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Add Customer')]")
	WebElement addcustomerBtn;
	
	@FindBy(xpath="//*[@id=\"survicate-box\"]/div/div/div[1]/button")
	WebElement alert;
	
	@FindBy(xpath="//*[@id=\"firstname-group\"]/input")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"lastname-group\"]/input")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"email-group\"]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"telephone-group\"]/input")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"password-group\"]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"confirm-group\"]/input")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"status-group\"]/div/label")
	WebElement status;
	
	@FindBy(xpath="//span[contains(text(), 'Save')]")
	WebElement saveBtn;	
	
	public void customerData(String fNama, String lName, String Email, String phone, String pswd, String confirmPswd) {
		ClickButton(addcustomerBtn);
		ClickButton(alert);
		SendText(firstName, fNama);
		SendText(lastName, lName);
		SendText(email, Email);
		SendText(telephone, phone);
		SendText(password, pswd);
		SendText(confirmPassword, confirmPswd);
		ClickButton(status);
	}
	
	public void saveChanges() {
		ClickButton(saveBtn);
	}
}

