package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.CustomerData;
import pages.CustomersPage;

public class AddCustomerEndToEndTest extends TestBase{
	
	AdminLogin adminLogin;
	CustomersPage customersPage;
	CustomerData customerData;
	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"sahar.hassan@expandcart.com","test"}};
							}
	
	@DataProvider(name="customerData")
	public static Object[][] customerData() {
			return new Object[][]
							{
										{"sahar","hassan", "saherhassan_99@hotmail.com","01000000000","test","test"}};
							}

	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(5000);		
		customersPage = new CustomersPage(driver);
		customersPage.goToCustomersPage();
		Thread.sleep(5000);	
}	
	
	
	@Test(dataProvider="customerData", priority = 2)
	public void customerData(String fNama, String lName, String Email, String phone, String pswd, String confirmPswd) throws InterruptedException {
		customerData = new CustomerData(driver);
		customerData.customerData(fNama, lName, Email, phone, pswd, confirmPswd);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		customerData.saveChanges();
	}
	

}
