package step;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	@BeforeMethod
	
	public void open_the_chrome_browser() {
	    

		
		WebDriverManager.chromedriver().setup();

	    driver  = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println(driver.getTitle());
		
	
		

	
		}
	
@AfterMethod
	public void postcondition() {
	driver.close();
	
	}
}

