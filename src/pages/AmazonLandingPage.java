package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLandingPage {
	
	
	WebDriver driver = null;
	
	By hamburger = By.xpath("//a[@id='nav-hamburger-menu']");
	
public AmazonLandingPage(WebDriver driver){
	this.driver = driver;
	
}
	public void clickhamburger() {
		driver.findElement(hamburger).click();
		System.out.println("hamburger clicked successfully");
	}
	
	
	

}
