package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalksPage {
	
	@FindBy(xpath = "//*[@id='main-region']/div") 
	protected WebElement titleText;

}
