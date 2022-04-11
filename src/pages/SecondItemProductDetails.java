package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondItemProductDetails {
	
	WebDriver driver = null;
	
	By aboutThisItemLabel = By.xpath("//h1[@class='a-size-base-plus a-text-bold']");
	By aboutThisItemSection = By.xpath("//div[@id='feature-bullets'] //ul");
	By aboutThisItemSection2 = By.xpath("//ul[@class='a-unordered-list a-vertical a-spacing-mini']");
	By confirmSwitchToContainSamsung = By.xpath("//span[contains(text(),'Samsung')]");

	public SecondItemProductDetails(WebDriver driver) {
		this.driver = driver;
		
	}
	

	public void verifySamsungIsPresentOnTheNewTab() {
		if(driver.findElement(confirmSwitchToContainSamsung).isDisplayed()){
			System.out.println("Samsung Details Is Present");
		}
		else
		{
			System.out.println("Samsung Details Is Not Present");
			
		} 
	}
	
	public void verifyaboutThisItemLabelIsPresent() {
		if(driver.findElement(aboutThisItemLabel).isDisplayed()){
			System.out.println("About This Item Label Is Present");
		}
		else
		{
			System.out.println("About This Item Label Is Not Present");
			
		}
	}
	
	public void getAboutThisItem() {
		System.out.println(driver.findElement(aboutThisItemLabel).getText());
		System.out.println("About this item printed successfully");
	}
	
	@SuppressWarnings("deprecation")
	public void aboutThisItemcontent() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(aboutThisItemSection2));
		List<WebElement> allElements = driver.findElements(aboutThisItemSection2);
		for (WebElement element: allElements) {
		      System.out.println(element.getText());
		      System.out.println("About Item Section Printed Successfully");
		      }
		
	}
	
	
	public void assertingAboutItemLabel() {
	WebElement item = driver.findElement(aboutThisItemLabel);
	assertEquals(true, item.isDisplayed());
	System.out.println("About item is displayed");
	}
	
	
}

