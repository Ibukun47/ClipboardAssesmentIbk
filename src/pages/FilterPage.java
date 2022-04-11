package pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {
	
	WebDriver driver = null;
	By pricefilterdropdownarrow = By.xpath("//span[@data-action='a-dropdown-button']");
	By resultofSamsungCheckbox = By.xpath("//span[contains(text(),'RESULTS')]");
	By priceHightoLowOption = By.xpath("//a[contains(text(),'Price: High to Low')]");
	By secondItem = By.xpath("//img[@data-image-index='2']");
	
		
	public FilterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click checks
	
	public void clickpriceHightoLowOption() {
		driver.findElement(priceHightoLowOption).click();
		System.out.println("priceHightoLowOption clicked successfully");
	}

	
	public void clickpricefilterdropdownarrow() {
		
		driver.findElement(pricefilterdropdownarrow).click();
		System.out.println("pricefilterdropdownarrow Clicked successfully");      
	}
	
	@SuppressWarnings("deprecation")
	public void clicksecondItem() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(secondItem)); 
		driver.findElement(secondItem).click();
		System.out.println("secondItem clicked successfully");
	}
// Is present checks
	
	public void verifyresultofsamsungfilterIsPresent() {
		if(driver.findElement(resultofSamsungCheckbox).isDisplayed()) {
			System.out.println("result of samsung filter is present");
			
		}else {
			System.out.println("result of samsung filter is not present");
			
		}
	}
	
	public void verifypriceHightoLowOptionIsPresent() {
		if(driver.findElement(priceHightoLowOption).isDisplayed()) {
			System.out.println("priceHightoLowOption is present");
			
		}else {
			System.out.println("priceHightoLowOption is not present");
			
		}
	}

	//To switch window
	
	public void navigateToSelectedOption() {
		//To click on the second item
		clicksecondItem();//method created above
		//Get handles of the tabs
        String mainamazonin = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();

        // To continue on the new tab
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainamazonin.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println(driver.getCurrentUrl());
                System.out.println("The window switched successfully");
                break;
              
            }
        }
    }
		
		
	
	}
	

