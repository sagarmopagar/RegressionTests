package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.InvokeDriver;
import junit.framework.Assert;

public class TestGoogleSearchPage extends InvokeDriver {

	public static void main(String[] args) throws Exception {

		// Get Driver
		TestGoogleSearchPage Test = new TestGoogleSearchPage();
		WebDriver driver = Test.DriverReturner();
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
		String btnSearch = "(.//*[@value='Google Search'])[2]";
		
		boolean btnEnabled = driver.findElement(By.xpath(btnSearch)).isEnabled();
		if	(!btnEnabled)
		{
			throw new Exception();
		}
		System.out.println("Test case was executed successfully");
		
		//Quit Driver
		driver.quit();
	}
}