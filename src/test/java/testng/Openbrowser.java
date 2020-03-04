package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Openbrowser {
	
	@Test
	public void openingBrowser() {
		System.out.println("Opening the browser");
		WebDriver driver = new FirefoxDriver();
	}

}
