package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningscroll {
	 
		
		WebDriver driver;

		@Before
		public void init() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void ScrollTest() {
			
			JavascriptExecutor  js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0,4000)");

		}
		

	}

