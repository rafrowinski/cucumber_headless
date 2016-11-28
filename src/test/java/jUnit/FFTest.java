package jUnit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFTest {
	@Test
	public void verifyGoogleTitle() throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.google.com/");

		WebElement searchInput = driver.findElement(By.id("lst-ib"));
		searchInput.sendKeys("france mucha");
		searchInput.sendKeys(Keys.RETURN);

		Thread.sleep(2000);

		driver.quit();
	}
}
