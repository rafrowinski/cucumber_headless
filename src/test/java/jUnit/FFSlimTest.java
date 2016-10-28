package jUnit;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FFSlimTest {

	@Test
	public void verifyGoogleTitle() throws IOException, InterruptedException {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile ffprofile = profile.getProfile("default");
		File plugin = new File("src/test/resources/quickjava-2.1.2-fx.xpi");

		ffprofile.addExtension(plugin);
		// ffprofile.setPreference("thatoneguydotnet.QuickJava.startupStatus.Images",
		// 2);
		ffprofile.setPreference("plugin.state.java", 2);
		ffprofile.setPreference("thatoneguydotnet.QuickJava.curVersion", "2.1.2");
		ffprofile.setPreference("thatoneguydotnet.QuickJava.startupStatus.Images", 2);
		ffprofile.setPreference("extensions.thatoneguydotnet.QuickJava.startupStatus.Images", 2);

		WebDriver driver = new FirefoxDriver(ffprofile);

		driver.navigate().to("https://www.google.com/search?hl=pl&site=imghp&tbm=isch&hl=pl&tbm=isch&q=france+mucha");
		// Thread.sleep(10000);

		DriverHelper.takeScreenshot(driver, "firefox_screenshot_" + DriverHelper.generateDateTimeString());
		driver.quit();
	}
}
