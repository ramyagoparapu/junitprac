package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mylearningalert {
	WebDriver driver;
@Before
	public void alerthandle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
@Test
public void alertpopup() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	Thread.sleep(2000);
	String alertmsg=driver.switchTo().alert().getText();
	System.out.println(alertmsg);
	driver.switchTo().alert().accept();
	
	
}
}

