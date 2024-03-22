package TestNGFeature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups = "RG")
public class Priority2 {
 
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
	@Test(priority = 0)
	public void AD() { //0 1 A
		
		System.out.println("Priority 4");
	}
	
	@Test(priority = -1)  //Yes 
	public void AB() {  //0 A
		
		System.out.println("Priority 3");
	}
	@Test(priority = 2)
	public void ABB() {  //0 A
		
		System.out.println("Priority 2");
	}
	@Test(priority = 1)
 	public void Login() {  //0 A
		boolean input1 = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(input1);
		System.out.println("Priority 1");
	}
	
	@AfterClass
	public void Teardown() {
		driver.close();
	}
	
	
	//P3
	//P1
	//P1
	//P2
}

