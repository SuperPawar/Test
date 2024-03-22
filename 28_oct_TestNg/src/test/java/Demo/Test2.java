package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	WebDriver driver;

	
	//@Before method
	//@Test   -- Title
	//AfterMethod
	
	
	//@BeforeEmthod
	//@test
	//@After method
	
	@BeforeMethod
	public void SetUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
	}

	@Test
	public void C() {
		System.out.println("C");
		boolean Test = driver.findElement(By.id("email")).isDisplayed();

		if (Test) {
			System.out.println("Input text box displayed");
		} else {
			System.out.println("Input text boc not displayed");
		}
		System.out.println(Test);
	}

	@Test(enabled = true)
	public void B() { 

		System.out.println("B");
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.equals("Facebook – log in or sign up")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

	}
	
	@Test
	public void A() { 

		System.out.println("A");
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.equals("Facebook – log in or sign up ")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

	}
	@AfterMethod
	public void Teardown() {

		driver.quit();
	}
}
