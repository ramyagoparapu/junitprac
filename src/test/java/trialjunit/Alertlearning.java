package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertlearning {

		WebDriver driver;

		@Before
		public void initialisereddiffmail() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-sep 2021\\cucumber\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://demo.guru99.com/V1/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void alertTest() throws InterruptedException {
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			Thread.sleep(2000);
			String alertMsg = driver.switchTo().alert().getText();
			System.out.println(alertMsg);
			driver.switchTo().alert().accept();
		
			
			
		}}




	//}
