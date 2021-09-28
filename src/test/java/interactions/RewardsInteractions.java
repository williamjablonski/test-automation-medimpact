package interactions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.RewardsPage;

public class RewardsInteractions extends RewardsPage{
	
	public void assertCurrentPageIsRewards(WebDriver driver, String baseUrl) {
		Assert.assertEquals(baseUrl + "?#rewards", driver.getCurrentUrl());
	}

}
