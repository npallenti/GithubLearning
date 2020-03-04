package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
public class OpenChrome {
	
	@Test
	  public void testGoogleSearch() throws InterruptedException {
	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Browser Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Browser Drivers\\geckodriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //WebDriver driver = new FirefoxDriver();
	    //WebDriver driver = new InternetExplorerDriver();
	    driver.get("http://www.google.com/");
		/*
		 * WebElement searchBox = driver.findElement(By.name("q"));
		 * searchBox.sendKeys("ChromeDriver"); searchBox.submit(); //To validate if the
		 * page Title is correct System.out.println(driver.getTitle()); //To verify
		 * landed URL is correct System.out.println(driver.getCurrentUrl()); //page
		 * source -concept called frames to deal some UI components
		 * System.out.println(driver.getPageSource());
		 * driver.get("http://www.yahoo.com/"); driver.navigate().back();
		 * System.out.println(); driver.quit();
		 */
	  }
	
}
