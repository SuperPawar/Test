package TestNGFeature;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount1 {

	
	
	@Test(invocationCount = 10)
	public void name() {
		
		System.out.println("Automation");
		
	}
	
	@Test(invocationCount = 2)
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
