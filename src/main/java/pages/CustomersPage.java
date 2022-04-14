package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends PageBase {
	
	public CustomersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="*//div/ul/li[4]/a")
	WebElement customersBtn;
	
	public void goToCustomersPage() {
		ClickButton(customersBtn);
	}

}
