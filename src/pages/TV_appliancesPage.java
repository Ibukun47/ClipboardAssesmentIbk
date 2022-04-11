package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class TV_appliancesPage {
	
	WebDriver driver = null;
	By tvapplianceslink = By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]");

	public TV_appliancesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickTVapplianciesLink() {
		driver.findElement(tvapplianceslink).click();
		System.out.println("tvappliances link clicked successfully");
	}
}
