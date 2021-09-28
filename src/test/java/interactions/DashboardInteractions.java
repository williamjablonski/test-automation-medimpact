package interactions;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;

public class DashboardInteractions extends DashboardPage{

	public void assertCurrentPageIsDashboards(WebDriver driver, String baseUrl){
		Assert.assertEquals(baseUrl+"?#dashboards/undefined", driver.getCurrentUrl());
	}
	
}
