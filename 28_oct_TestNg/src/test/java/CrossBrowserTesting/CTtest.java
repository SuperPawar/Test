package CrossBrowserTesting;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CTtest {

	WebDriver driver; // static

	@Parameters("Browsername")
	@SuppressWarnings("deprecation")
	@Test
	public void OrangeHRM(String Browsername) {

		if (Browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		} else if (Browsername.equals("FireFox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browsername.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (Browsername.equals("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement passowrd = driver.findElement(By.name("password"));
		passowrd.sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		boolean  Act_Name = driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).isDisplayed();

	//	String Exp_name = "Testsanthosh Demossk";

		Assert.assertTrue(Act_Name);

		driver.quit();

	}
}
