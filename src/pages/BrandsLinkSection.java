package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BrandsLinkSection {

	WebDriver driver = null;
	By brandslabel = By.xpath("//div[@id='s-refinements'] //div[17] //span[contains(text(),'Brands')]");
	By samsung = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']");
	By resultofSamsungCheckbox = By.xpath("//span[contains(text(),'RESULTS')]");


	public BrandsLinkSection(WebDriver driver) {
		this.driver = driver;
	}
	// Click checks
	public void clickSamsung() {
		driver.findElement(samsung).click();
		System.out.println("Samsung checkbox clicked successfully");
	}


	public void clickbrandslink() {
		driver.findElement(brandslabel).click();
		System.out.println("Brand Link Clicked successfully");
	}


	// Is present checks

	public void verifybrandIsPresent() {
		if(driver.findElement(brandslabel).isDisplayed()) {
			System.out.println("brandlabel is present");

		}else {
			System.out.println("brandlabel is not present");

		}
	}

	

}
