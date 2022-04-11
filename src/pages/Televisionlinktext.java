package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Televisionlinktext {
	
	WebDriver driver = null;
	
	
	By televisionlink = By.xpath("//a[contains(text(),'Televisions')]");
	
	//https://www.amazon.in/gp/browse.html?node=1389396031&ref_=nav_em_sbc_tvelec_television_0_2_9_2
	
	public Televisionlinktext(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicktelevisionLink() {
		
		driver.findElement(televisionlink).click();
		System.out.println("television link clicked successfully");
		
	}
public void currentURLTelevisionPage() {
	String url = driver.getCurrentUrl();
	String expectedurl = "https://www.amazon.in/gp/browse.html?node=1389396031&ref_=nav_em_sbc_tvelec_television_0_2_9_2";
	assertEquals(url,expectedurl);
	System.out.println("URL is correct:"+ url);
	
}
}
