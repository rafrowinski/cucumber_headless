package jUnit;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FFSlimTest {

	@Test
	public void verifyGoogleTitle() throws IOException, InterruptedException {
		FirefoxProfile profile = new FirefoxProfile(new File("src/test/resources/profile.slimfox"));

		WebDriver driver = new FirefoxDriver(profile);

		driver.navigate().to("https://www.google.com/search?hl=pl&site=imghp&tbm=isch&hl=pl&tbm=isch&q=france+mucha");

		DriverHelper.takeScreenshot(driver, "firefox_screenshot_" + DriverHelper.generateDateTimeString());
		driver.quit();
	}
}
