package TestNGFeature;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enabled1 {

	WebDriver driver;

	@BeforeMethod // 1 4 7
	public void SetUp() {   
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
	}

	@Test()
	public void A() {  //2
		boolean input1 = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(input1);
	}
	
	@Test
	public void B() { //5
		boolean input2 = driver.findElement(By.id("pass")).isDisplayed();

		System.out.println(input2 );
	}
	
	@Test()
	public void C() { //8
		boolean input2 = driver.findElement(By.id("pass")).isDisplayed();

		System.out.println(input2 );
	}
	
	@AfterMethod  //3 6 9
	public void Teardown() {
		driver.close();
	}
	

}
