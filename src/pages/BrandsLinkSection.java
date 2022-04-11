package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BrandsLinkSection {

	WebDriver driver = null;
	By brandslabel = By.xpath("//div[@id='s-refinements'] //div[17] //span[contains(text(),'Brands')]");
	By samsungcheckbox = By.xpath("//div[@id='s-refinements'] //div[17] //ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium'] //li[2][@class='a-spacing-micro'] //span[@class='a-list-item'] //a[@class='a-link-normal'] //div[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']");
	By resultofSamsungCheckbox = By.xpath("//span[contains(text(),'RESULTS')]");


	public BrandsLinkSection(WebDriver driver) {
		this.driver = driver;
	}
	// Click checks
	public void clickSamsungCheckbox() {
		driver.findElement(samsungcheckbox).click();
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

	public void confirmsamsungCheckboxIsselected() {
		driver.findElement(samsungcheckbox).isSelected();
		System.out.println("Smasung Checkbox Is selected");
	}

}
