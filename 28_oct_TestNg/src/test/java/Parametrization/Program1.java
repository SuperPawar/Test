package Parametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {

	WebDriver driver;
	//Apache poi file 
	//Fileinput 
	//Workbook fac
	//getrow,get
	
	@Parameters({"URL"})
	@BeforeMethod
	public void Setup(String URL) {
				
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(URL);
		
			
	}
	@Parameters({"Username","Password", "ExpResult"})
	@Test
	public void LoginTest(String UN,String PS,String ExpResult) {
		
		WebElement Username =driver.findElement(By.id("email"));
		
		Username.sendKeys(UN);
		
		WebElement Password =driver.findElement(By.id("pass"));

		Password.sendKeys(PS);
		
	  String Title =	driver.getTitle();
	  
	  if(Title.equals(ExpResult)) {
		  
		  System.out.println("Correct title");
	  }
	  else{
		
		  System.out.println("Incorrect title");
	  }
		
	}

	public void Teardown() {
		
		driver.close();
	}
}
