package interactions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.SearchResultsPage;

public class SearchResultsInteractions extends SearchResultsPage {

	public void assertCurrentPageIsSearchResults(WebDriver driver, String baseUrl, String valueSearched) {
		Assert.assertEquals(baseUrl + "?#search" + "/" + valueSearched, driver.getCurrentUrl());
	}
}
