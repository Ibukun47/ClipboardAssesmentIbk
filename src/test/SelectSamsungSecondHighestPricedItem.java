package test;

import org.testng.annotations.Test;
import pages.FilterPage;
import pages.TV_appliancesPage;
import pages.Televisionlinktext;
import pages.AmazonLandingPage;
import pages.BrandsLinkSection;
import pages.SecondItemProductDetails;

public class SelectSamsungSecondHighestPricedItem extends BaseClass{


	@Test(priority = 1)
	//Click on hamburger
	public void gotoTheHambugerPage() throws InterruptedException {
		AmazonLandingPage landingAmazonPage = new AmazonLandingPage(driver);
		Thread.sleep(3000);
		landingAmazonPage.clickhamburger();

	}

	@Test(priority = 2)
	//Click on TV, appliances and electronics
	public void selectTvAndAppliances() throws InterruptedException {
		TV_appliancesPage tvappliance = new TV_appliancesPage(driver);
		Thread.sleep(3000);
		tvappliance.clickTVapplianciesLink();

	}

	@Test(priority = 3)

	//Click on television

	public void selecttelevisonlink() throws InterruptedException {
		Televisionlinktext television = new Televisionlinktext(driver);
		Thread.sleep(3000);
		television.clicktelevisionLink();
		television.currentURLTelevisionPage();
	}

	@Test(priority = 4)

	//verifying that brands exists	
	public void verifybrand() throws InterruptedException {
		BrandsLinkSection brand = new BrandsLinkSection(driver);
		Thread.sleep(4000);
		brand.verifybrandIsPresent();
		//brand.samsungSelection();
	}

	@Test(priority = 5)

	//click on samsung checkbox

	public void clicksamsung() throws InterruptedException {
		BrandsLinkSection brand = new BrandsLinkSection(driver);
		brand.clickSamsung();
		System.out.println("This one passed");

	}
	@Test(priority = 6)
	public void sortbyHightoLow() {
		FilterPage filter = new FilterPage(driver);
		filter.clickpricefilterdropdownarrow();
		filter.clickpriceHightoLowOption();
	}
	@Test(priority = 7)
	public void selectSecondItem() {
		FilterPage filter = new FilterPage(driver);
		filter.clicksecondItem();

	}
	@Test(priority=8)
	public void switchwindow() {
		FilterPage filter = new FilterPage(driver);
		filter.navigateToSelectedOption();
	}
	@Test(priority =9)
	public void selectedOption() {
		SecondItemProductDetails itemDetails = new SecondItemProductDetails(driver);
		itemDetails.verifySamsungIsPresentOnTheNewTab();//to confirm if the system actually selected Samsung
		itemDetails.verifyaboutThisItemLabelIsPresent();
		itemDetails.assertingAboutItemLabel();
		itemDetails.aboutThisItemcontent();
	}


}
