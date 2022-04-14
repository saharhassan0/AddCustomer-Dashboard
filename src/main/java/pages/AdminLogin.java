package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin extends PageBase {		
		
		public AdminLogin(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath ="//*[@id=\"login\"]/div/div[2]/input")
		WebElement userName;
		
		@FindBy(xpath="//*[@id=\"login\"]/div/div[3]/input")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"login\"]/div/div[5]/button")
		WebElement loginBtn;

		
		public void Login(String user, String pswd) {
			SendText(userName, user);
			SendText(password, pswd);
			ClickButton(loginBtn);
}}
