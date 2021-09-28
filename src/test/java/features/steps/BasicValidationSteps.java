package features.steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import interactions.DashboardInteractions;
import interactions.HeaderInteractions;
import interactions.RewardsInteractions;
import interactions.SearchResultsInteractions;
import interactions.TalksInteractions;
import interactions.WorkshopsInteractions;
import utils.DriverTestInstance;

public class BasicValidationSteps extends DriverTestInstance {

	public String publicValueForSearch = null;

	DashboardInteractions dashboardInteraction = PageFactory.initElements(driver, DashboardInteractions.class);

	HeaderInteractions headerInteraction = PageFactory.initElements(driver, HeaderInteractions.class);

	TalksInteractions talksInteraction = PageFactory.initElements(driver, TalksInteractions.class);

	WorkshopsInteractions workshopsInteraction = PageFactory.initElements(driver, WorkshopsInteractions.class);

	RewardsInteractions rewardsInteraction = PageFactory.initElements(driver, RewardsInteractions.class);

	SearchResultsInteractions searchResultsInteraction = PageFactory.initElements(driver,
			SearchResultsInteractions.class);

	@Given("^I stay on the acmiles dashboard page \"([^\"]*)\".$")
	public void i_stay_on_the_acmiles_index_page_(String baseMilesURL) throws Throwable {

		driver.get(baseUrl + "?#dashboards/undefined");
	}

	@Then("^header shows ACMiles logo.$")
	public void index_page_shows_ACMiles_logo() throws Throwable {
		headerInteraction.assertACMILESlogoExists();
	}

	@Then("^header shows Dashboard link.$")
	public void index_page_shows_Dashboard_link() throws Throwable {
		headerInteraction.assertDashboardLinkExists();
	}

	@Then("^header shows Talks link.$")
	public void index_page_shows_Talks_link() throws Throwable {
		headerInteraction.assertTalksLinkExists();
	}

	@Then("^header shows Workshops link.$")
	public void index_page_shows_Workshops_link() throws Throwable {
		headerInteraction.assertWorkshopLinkExists();
	}

	@Then("^header shows Rewards link.$")
	public void index_page_shows_Rewards_link() throws Throwable {
		headerInteraction.assertRewardsLinkExists();
	}

	@Then("^header shows Search element.$")
	public void index_page_shows_Search_element() throws Throwable {
		headerInteraction.assertSearchTextExists();
	}

	@Then("^talks page shows title element.$")
	public void talks_page_shows_title_element() throws Throwable {
		talksInteraction.assertTitleExists();
	}

	@Then("^workshops page shows title element.$")
	public void workshops_page_shows_title_element() throws Throwable {
		workshopsInteraction.assertTitleExists();
	}

	@Given("^click in Dashboard on header$")
	public void click_in_Dashboard_on_header() throws Throwable {
		headerInteraction.clickDashboardLink();
	}

	@Then("^dashboard page is shown.$")
	public void dashboard_page_is_shown() throws Throwable {
		dashboardInteraction.assertCurrentPageIsDashboards(driver, baseUrl);
	}

	@Given("^click in Talks on header$")
	public void click_in_Talks_on_header() throws Throwable {
		headerInteraction.clickTalksLink();
	}

	@Then("^Talks page is shown.$")
	public void Talks_page_is_shown() throws Throwable {
		talksInteraction.assertCurrentPageIsTalks(driver, baseUrl);
	}

	@Given("^click in Workshops on header$")
	public void click_in_Workshops_on_header() throws Throwable {
		headerInteraction.clickWorkshopsLink();
	}

	@Then("^Workshops page is shown.$")
	public void Workshops_page_is_shown() throws Throwable {
		workshopsInteraction.assertCurrentPageIsWorkshops(driver, baseUrl);
	}

	@Given("^click in Rewards on header$")
	public void click_in_Rewards_on_header() throws Throwable {
		headerInteraction.clickRewardsLink();
	}

	@Then("^Rewards page is shown.$")
	public void Rewards_page_is_shown() throws Throwable {
		rewardsInteraction.assertCurrentPageIsRewards(driver, baseUrl);
	}

	@Given("^set \"([^\"]*)\" on Search element in header$")
	public void set_on_Search_element(String valueForSearch) throws Throwable {
		publicValueForSearch = valueForSearch;
		headerInteraction.searchValueWithEnter(publicValueForSearch);
	}

	@Then("^Result page of Search is shown.$")
	public void Result_page_of_Search_is_shown() throws Throwable {
		searchResultsInteraction.assertCurrentPageIsSearchResults(driver, baseUrl, publicValueForSearch);
	}
}
