package features.steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.APIInteractions;
import utils.DriverTestInstance;

public class APIValidationSteps extends DriverTestInstance {

	public  int statusCode;

	APIInteractions apiInteraction = PageFactory.initElements(driver, APIInteractions.class);

	@When("^I execute the call \"([^\"]*)\" to route \"([^\"]*)\"$")
	public void I_execute_the_call_to_route(String typeCall, String adressOfCall) throws Throwable {

		statusCode = apiInteraction.executeCallBack(typeCall, baseUrl, adressOfCall);

	}

	@When("^I execute the call \"([^\"]*)\" using providerId \"([^\"]*)\" to route \"([^\"]*)\"$")
	public void I_execute_the_call_using_providerId_to_route(String typeCall, String providerId, String adressOfCall)
			throws Throwable {

		statusCode = apiInteraction.executeCallBack(typeCall, baseUrl, adressOfCall, providerId);

	}

	@When("^I execute the call \"([^\"]*)\" using providerId \"([^\"]*)\" and  providerUserId \"([^\"]*)\" to route \"([^\"]*)\"$")
	public void I_execute_the_call_using_providerId_and_providerUserId_to_route(String typeCall, String providerId,
			String providerUserId, String adressOfCall) throws Throwable {

		statusCode = apiInteraction.executeCallBack(typeCall, baseUrl, adressOfCall, providerId, providerUserId);

	}

	@Then("^the status result is \"([^\"]*)\".$")
	public void the_status_result_is_(int CodeResultStatus) throws Throwable {
		apiInteraction.assertStatus(CodeResultStatus, statusCode);

	}

}
