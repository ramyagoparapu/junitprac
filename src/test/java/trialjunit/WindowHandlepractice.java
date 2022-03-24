package trialjunit;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlepractice {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
@Test
public void windowhandleprac() {
	System.out.println(driver.getTitle());
	String handle=driver.getWindowHandle();
	System.out.println(handle);
	driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("selenium");
	
	//action.sendKeys(Keys.RETURN).build().perform();

	driver.findElement(By.xpath("//input[@id='ybar-search']"));
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).build().perform();
	String handle1=driver.getWindowHandle();
	System.out.println(handle1);
	
	driver.findElement(By.xpath("//body[@id='ysch']")).click();
	System.out.println(driver.getTitle());
	String handle2=driver.getWindowHandle();
	System.out.println(handle2);
	Set <String> handles=driver.getWindowHandles();
	System.out.println(handles);
	for (String i:handles)
	{	
		System.out.println(i);
		driver.switchTo().window(i);
		System.out.println(driver.getTitle());
	
	
	}
	
	
	
	
	
	
	
}


}
