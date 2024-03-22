package TestNGFeature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority1 {

	//test execution without priority
	WebDriver driver;
	@BeforeClass
	public void SetUp() {   
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void AD() { //0 1 A
		
		System.out.println("Hello");
	}
	
	@Test
	public void AB() {  //0 A
		
		System.out.println("Hi");
	}
	
	@AfterClass
	public void Teardown() {
		driver.close();
	}
	
}

