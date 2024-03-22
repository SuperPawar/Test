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

public class FirstProgram {

	WebDriver driver;

	@BeforeMethod
	public void SetUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	@Test(dataProvider = "LoginData")
	public void LoginTest(String Uname, String PWD) {

		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys(Uname);

		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys(PWD);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		boolean text = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")).isDisplayed();

		System.out.println(text);
		
		Assert.assertTrue(text);
	}
	
 //Total 5 pass 5 failed -0 
	
	@DataProvider(name="LoginData")
	public Object[][] LoginData() {

		Object data[][] = new Object[5][2];

		// Correct UN & Correct Pass
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		// Correct UN & InCorrect Pass
		data[1][0] = "Admin";
		data[1][1] = "admin1234";

		// InCorrect UN & Correct Pass
		data[2][0] = "Admin12";
		data[2][1] = "admin123";

		// InCorrect UN & InCorrect Pass
		data[3][0] = "Admin12";
		data[3][1] = "admin1234";

		// Empty UN & Correct Pass
		data[4][0] = "";
		data[4][1] = "admin1234";
//		
		return data;
	}

	@AfterMethod
	public void Teardown() throws InterruptedException {

		Thread.sleep(10000);
		driver.quit();
	}
	
	//tC - 5 pass  - 1 , failed 4 
	//Tc - 5 pass -5  failed 0

}
