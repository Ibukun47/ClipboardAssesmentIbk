package test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("chrome://settings/clearBrowserData");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
	System.out.println("We are on: "+ driver.getCurrentUrl());
	driver.manage().deleteAllCookies();
		
	}
	
//@Test	
//	public void test() {
//	
//	
//}

@AfterTest
public void close() {
	driver.quit();
	
	
}
	

}
