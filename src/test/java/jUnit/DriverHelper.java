package jUnit;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DriverHelper {
	public static void takeScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshot = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("./screenshots/" + screenshotName + ".png"));
			System.out.println("Screenshot taken and saved as " + screenshotName + ".png");
		} catch (Exception e) {
			System.out.println("Unable to create screenshot of name " + screenshotName + " due to:");
			e.printStackTrace();
		}
	}

	public static String generateDateTimeString() {
		Date date = new Date();
		return date.toGMTString().replace(' ', '_').replace(':', '-');
	}
}
