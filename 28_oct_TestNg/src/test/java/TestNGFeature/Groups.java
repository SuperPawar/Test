package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups {

	WebDriver driver;
	//Smoke or sanity  
	//Regression or Retesting -  500  - 450  regression - 50 smoke
	
	@BeforeMethod(groups = "Loginpage")
	public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(groups = "Loginpage")
	public void Logo() {
		boolean Log=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	    
		if(Log) {
			System.out.println("Log is present");
		}
		else {
			System.out.println("Log is not present");

		}
		
		System.out.println("Loginpage 1");
	}
	
	@Test(groups = "Loginpage")
	public void usernameandpassword() {
		
		driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]")).isDisplayed();
		driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[2]")).isDisplayed();
		System.out.println("Loginpage 2");
	}
	
	@Test(groups = "Homepage")
	public void Homepage1() {
		
		System.out.println("Homepage 1");
	}
	
	
	@Test(groups = "Homepage")
	public void Homepage2() {
		
		System.out.println("Homepage 2");
	}
	
	@Test(groups = "Dashboard")
	public void Dashboard() {
		
		System.out.println("Dashboard");
	}
	
	
}
