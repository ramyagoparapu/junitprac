package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {
	 
		
		WebDriver driver;

		@Before
		public void init() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.techfios.com/billing/?ng=login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		

		@Test
		public void loginTest() {

			// Storing Webelement using By Class
			By userNameLocator = By.xpath("//input[@id='username']");
			By passwordLocator = By.xpath("//*[@id=\"password\"]");
			By signInButtonLocator = By.xpath("/html/body/div/div/div/form/div[3]/button");
			
			driver.findElement(userNameLocator).sendKeys("demo@techfios.com");
			driver.findElement(passwordLocator).sendKeys("abc123");
//			driver.findElement(signInButtonLocator).click();
			
			Actions action = new Actions(driver);
//			action.sendKeys(Keys.ENTER).build().perform();
			action.sendKeys(Keys.RETURN).build().perform();

			
			
		}

}
