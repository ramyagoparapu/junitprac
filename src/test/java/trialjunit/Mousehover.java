package trialjunit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vanga\\eclipse-sep 2021\\trialjunit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void MouseHoverTest() {

		By productLocator = By.xpath("//span[text()='Products']");
		By monitorsLocator = By.xpath("//a[contains(text(), 'Monitors')]");
		By monitorsForHomeLocator = By.xpath("//a[contains(text(), 'Monitors')]/parent::li/descendant::a[3]");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(productLocator)).build().perform();
		action.moveToElement(driver.findElement(monitorsLocator)).build().perform();
		driver.findElement(monitorsForHomeLocator).click();
		By solutionsloc = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]");
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(solutionsloc)).build().perform();
		By cloudsol = By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]");

		action1.moveToElement(driver.findElement(cloudsol)).build().perform();

	}

}

