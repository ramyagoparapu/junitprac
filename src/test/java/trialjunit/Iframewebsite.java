package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframewebsite {
	
		
		WebDriver driver;

		@Before
		public void init() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://docs.oracle.com/javase/8/docs/api/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void iFrameTest() throws InterruptedException {
			
		
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("java.awt.color")).click();
			
			driver.switchTo().parentFrame();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("ColorSpace")).click();
			
			driver.switchTo().parentFrame();
			driver.switchTo().frame("classFrame");
			Thread.sleep(6000);
			driver.findElement(By.linkText("java.lang.Object")).click();
			
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt.im")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("InputContext")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("InputMethodRequests")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageListFrame");
	
		driver.findElement(By.linkText("java.awt.event")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ActionListener")).click();
		
		

}
		
}
