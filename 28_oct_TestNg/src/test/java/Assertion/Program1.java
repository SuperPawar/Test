package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	WebDriver driver;
	

	@BeforeMethod
	public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void Demo() {

		WebElement Uname = driver.findElement(By.name("username"));
		
		WebElement Pname = driver.findElement(By.name("password")); 
		
		//AssertTrue
		
//		Assert.assertTrue(Uname.isDisplayed());
//		Uname.sendKeys("Admin");
//		
//		Assert.assertTrue(Pname.isDisplayed());
//		 Pname.sendKeys("admin123");
		 
		 //AssertFasle
//		 
//		 Assert.assertFalse(Uname.isDisplayed());  //true
//		 Uname.sendKeys("Admin");
//		 
//		 Assert.assertFalse(Pname.isDisplayed());  //true
//		 Pname.sendKeys("Admin123");
//		 
		 //Assert,assert equlas
		 //get the title of the webpage
		 
		String actualTitle = driver.getTitle();
		
		//Expected Tititle
		
		String EXp_Title = "Welcome";
		
		Assert.assertEquals(actualTitle, EXp_Title);
		 
	}
	
	@AfterMethod
	public void Teardown() {
		
		
		driver.close();
	}
	
}
