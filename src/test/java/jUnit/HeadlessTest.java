package jUnit;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessTest {

	@Test
	public void verifyGoogleTitle() {
		File phantom = new File("src/test/resources/phantomjs.exe");

		System.setProperty("phantomjs.binary.path", phantom.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();

		driver.get("http://www.google.com");

		DriverHelper.takeScreenshot(driver, "phantom_screenshot_" + DriverHelper.generateDateTimeString());
		driver.quit();
	}
}
