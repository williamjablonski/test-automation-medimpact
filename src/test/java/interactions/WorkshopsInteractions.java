package interactions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.WorkshopsPage;

public class WorkshopsInteractions extends WorkshopsPage{

	public void assertTitleExists() throws InterruptedException{
		Thread.sleep(500);
		titleText.isDisplayed();
		
	}
	
	public void assertCurrentPageIsWorkshops(WebDriver driver, String baseUrl) {
		Assert.assertEquals(baseUrl + "?#workshops", driver.getCurrentUrl());
	}

}
