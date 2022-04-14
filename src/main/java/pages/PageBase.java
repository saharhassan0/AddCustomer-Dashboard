package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


protected WebDriver driver;

//Create Constructor
public PageBase(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}

   public void SendText (WebElement element, String text)
    {
        element.clear();
        element.sendKeys(text);
    }

    public void ClickButton (WebElement element)
    {
        element.click();
    }
    
    public void Dispaly(WebDriver driver, WebElement element) {
    	  element.isDisplayed();
    	 }
    
    public void JSClick(WebDriver driver, WebElement ele) throws Exception {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
	}
	
	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}}