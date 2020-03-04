package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class EbayLogin {

	@Test
	public void ebayLandingPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");

		// 1. Validating if the driver path is set correctly
		assertEquals("C:\\Browser Drivers\\chromedriver.exe",
				System.getProperties().getProperty("webdriver.chrome.driver"));

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.ebay.com");
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.linkText("Sign in"))).build().perform();
		// 2. Identifying element using xpath
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

		/*
		 * //3. Identifying element using LinkText
		 * driver.findElement(By.linkText("Sign in")).click();
		 */
		
		  WebDriverWait wait = new WebDriverWait(driver, 10);

		  //4. Validating presence of the Webelement WebElement emailField =
		  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='userid']")));
		 // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='captcha-box']")));
		  
		  Thread.sleep(10000L);
		  
		  //geetest_holder geetest_wind geetest_detect
		  //geetest_holder geetest_wind geetest_wait_compute
		  //System.out.println(driver.findElement(By.xpath("//div[@id='captcha-box']")).isDisplayed());
		if (driver.findElement(By.xpath("//div[@id='captcha-box']")).isDisplayed()) {
			action.moveToElement(driver.findElement(By.cssSelector("div[class='geetest_radar_tip']"))).build().perform();
			driver.findElement(By.cssSelector("div.geetest_holder.geetest_wind.geetest_wait_compute")).click();
			//action.moveToElement(driver.findElement(By.cssSelector("[class='geetest_slider_button']")), xOffset, yOffset)
			//driver.switchTo().c
		} else {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='userid']")));
			System.out.println(driver.findElement(By.xpath("//input[@id='userid']")).isDisplayed());
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("npallinti@gmail.com");
		}
		//// div[@aria-label='Click to verify']

		// 5. Asserting to see if the element is present
		// assertTrue(driver.findElement(By.xpath("//input[@id='userid']")).isDisplayed());
	}
}
