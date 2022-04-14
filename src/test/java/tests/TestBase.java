package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	public static String path = System.getProperty("user.dir");
	
	String URL = "https://xsuvau9016.expandcart.com/admin";

	@BeforeSuite		
	public void StartDriver(){
		
		String driverpath = path + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
		
		@AfterSuite
		public void teardown() {
			//driver.quit();

		}
	
}

