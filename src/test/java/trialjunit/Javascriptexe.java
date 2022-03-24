package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Javascriptexe {
	WebDriver driver;

	@Before
	public void Logintest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void clickingcustomerslink() throws InterruptedException {

		driver.findElement(By.xpath("//span[contains(text(), 'Customers')]")).click();
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		By addcustomerpage = (By.xpath("//a[text()='Add Customer']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addcustomerpage));
		String actualval = driver.findElement(By.xpath("//h5[text()='Add Contact']")).getText();
		System.out.println(actualval);
		Assert.assertEquals("addcustomerpage not found!!!", "Add Contact", actualval);
		driver.findElement(By.xpath("//*[@id=\"account\"]")).sendKeys("hello");
		
		By companyDropdownLocator = By.xpath("//select[@id=\"cid\"]");
			Select sel=new Select((driver.findElement(companyDropdownLocator)));
	sel.selectByIndex(3);
	Thread.sleep(2000);
	sel.selectByIndex(2);

	



	}}
