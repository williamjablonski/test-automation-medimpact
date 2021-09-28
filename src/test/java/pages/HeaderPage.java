package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage {

	@FindBy(xpath = "//*[@id='header-region']/div/div/div[1]/div/a/img")
	protected WebElement logoACmiles;
	
	@FindBy(xpath = "//*[@id='header-region']/div/div/div[2]/ul/li[1]/a")
	protected WebElement dashboardLink;
	
	@FindBy(xpath = "//*[@id='header-region']/div/div/div[2]/ul/li[2]/a")
	protected WebElement talksLink;
	
	@FindBy(xpath = "//*[@id='header-region']/div/div/div[2]/ul/li[3]/a")
	protected WebElement workshopsLink;
	
	@FindBy(xpath = "//*[@id='header-region']/div/div/div[2]/ul/li[4]/a")
	protected WebElement rewardsLink;
	
	@FindBy(xpath = "//*[@id='header-region']/div/div/div[2]/div/form/input")
	protected WebElement searchText;
}
