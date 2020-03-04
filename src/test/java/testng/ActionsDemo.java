package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ActionsDemo {
	
	@Test
	public void mouseOver() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		System.out.println("SetProperty is set and Webdriver instance is created");
		
		driver.get("http://amazon.in");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		
		System.out.println("Amazon website is launched and mouseovered to Hello. Sign in");
		
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
		
		System.out.println("On Amazon website Sign in button is clicked");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ap_email")));
		
		System.out.println("Waiting until the webelement is present");
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).click();
		action.sendKeys("npallinti@gmail.coms").build().perform();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		System.out.println("Insterting email address into email field and clicking Continue button");
		
		if(driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).isDisplayed()) {
			
		driver.findElement(By.xpath("//input[@id='ap_email']")).clear();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("npallinti@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("Resetting the invaild email address into email field and clicking Continue button Again");
		}
		
		
		
		

}		
}
