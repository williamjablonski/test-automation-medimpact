package interactions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.TalksPage;

public class TalksInteractions extends TalksPage {

	public void assertTitleExists() throws InterruptedException {
		titleText.isDisplayed();

	}

	public void assertCurrentPageIsTalks(WebDriver driver, String baseUrl) {
		Assert.assertEquals(baseUrl + "?#talks", driver.getCurrentUrl());
	}

}
