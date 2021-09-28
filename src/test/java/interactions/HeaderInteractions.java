package interactions;

import org.openqa.selenium.Keys;

import pages.HeaderPage;

public class HeaderInteractions extends HeaderPage{

	public void assertACMILESlogoExists(){
		logoACmiles.isDisplayed();
	}
	
	public void assertDashboardLinkExists(){
		dashboardLink.isDisplayed();
	}
	
	public void assertTalksLinkExists(){
		talksLink.isDisplayed();
	}
	
	public void assertWorkshopLinkExists(){
		workshopsLink.isDisplayed();
	}
	
	public void assertRewardsLinkExists(){
		rewardsLink.isDisplayed();
	}
	
	public void assertSearchTextExists(){
		searchText.isDisplayed();
	}
	
	public void clickDashboardLink(){
		dashboardLink.click();
	}
	
	public void clickTalksLink(){
		talksLink.click();
	}
	
	public void clickWorkshopsLink(){
		workshopsLink.click();
	}
	
	public void clickRewardsLink(){
		rewardsLink.click();
	}
	
	public void searchValueWithEnter(String value){
		searchText.clear();
		searchText.sendKeys(value);
		searchText.sendKeys(Keys.ENTER);
	}
	
	public void searchValueWithTAB(String value){
		searchText.clear();
		searchText.sendKeys(value);
		searchText.sendKeys(Keys.TAB);
	}
	
}
