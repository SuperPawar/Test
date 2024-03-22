package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void OrangeHRM(String Browsername) {
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
          WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("FireFox")) {
	     WebDriverManager.firefoxdriver().setup();
         driver =new FirefoxDriver();
			
		}
		else if (Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/ranjeetkendre/Documents/msedgedriver");
	         driver =new EdgeDriver();
		}
		else if (Browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.IE.driver", "/Users/ranjeetkendre/Documents/IEDriverserver");
	         driver =new InternetExplorerDriver();
		}
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        WebElement Username=  driver.findElement(By.name("username"));
        Username.sendKeys("Admin");
        WebElement Passwords =driver.findElement(By.name("password"));
        Passwords.sendKeys("admin123");
        String Exp_Name="Test Bambang";
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        String Act_name=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		 
        Assert.assertEquals(Act_name, Exp_Name);
        
        System.out.println("Correct user name");
        
        System.out.println("Execution completed");
        driver.quit();
        
	}
}

