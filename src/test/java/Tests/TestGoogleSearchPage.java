package Tests;

import org.openqa.selenium.WebDriver;

import Driver.InvokeDriver;
import junit.framework.Assert;

public class TestGoogleSearchPage extends InvokeDriver {

	public static void main(String[] args) {


		TestGoogleSearchPage Test = new TestGoogleSearchPage();
		WebDriver driver = Test.DriverReturner();
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());

		driver.quit();
	}
}