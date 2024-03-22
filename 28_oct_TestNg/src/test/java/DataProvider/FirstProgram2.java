package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram2 {

	WebDriver driver;
  //@beforememthod
	//@Test
 //@AfterMethod
	@BeforeMethod
	public void SetUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@Test(dataProvider = "LoginData")
	public void LoginTest(String Uname, String PWD, String Expected) throws InterruptedException {

		WebElement Username = driver.findElement(By.id("Email"));
		Username.clear();
		Username.sendKeys(Uname); 

		WebElement Password = driver.findElement(By.id("Password"));
		Password.clear();
		Password.sendKeys(PWD);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(3000);
		String Act_Title = driver.getTitle();

		String Exp_Title = "Dashboard / nopCommerce administration";

		if (Expected.equals("valid")) { // true  //false

			if (Exp_Title.equals(Act_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);

			}
		} else if (Expected.equals("invalid")) { //true
			if (Exp_Title.equals(Act_Title)) { //
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);  //true

			}
		}
	}

	// Total 4 pass 4 failed -0

	@DataProvider(name = "LoginData")
	public String[][] LoginData() {

		String LoginData[][] = { { "admin@yourstore.com", "admin", "valid" },
				{ "admin@yourstore.com", "admin123", "invalid" }, { "admin2@yourstore.com", "admin", "invalid" },
				{ "admin2@yourstore.com", "admin2", "invalid" },

		};
		return LoginData;

	}

	@AfterMethod
	public void Teardown() throws InterruptedException {

		driver.quit();
	}
}
