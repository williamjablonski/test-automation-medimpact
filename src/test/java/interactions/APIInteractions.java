package interactions;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Assert;

import com.jayway.restassured.response.Response;

import cucumber.api.PendingException;
import utils.DriverTestInstance;

/**
 * Created by filipe on 15/08/15. Refactory by william Jablonski
 */

public class APIInteractions extends DriverTestInstance {

	public void getService(String service) {
		// TODO: change url dynamically & response (sorry folks :) )
		Response response = get(baseUrl + "home/api/" + service);
		assertNotNull(response.asString());
	}

	public void checkResponseStatus(String status, String service) {
		Response response = get(baseUrl + "home/api/" + service);
		int statusCode = response.statusCode();
		if ("success".equals(status)) {
			assertEquals(statusCode, 200);
		}
	}

	public void checkResponseError(String service) {
		Response response = get(baseUrl + "home/api/" + service);
		assertFalse(response.asString().contains("error"));
	}

	public void checkResponseNotNull(String service) {
		Response response = get(baseUrl + "home/api/" + service);
		assertTrue(response.asString() != null);
	}

	public void doPost(String service, Map<String, String> data) {

		JSONObject json = new JSONObject();
		Iterator it = data.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			json.put(pair.getKey(), pair.getValue());
		}

		Response response = given().contentType("application/json").with().body(json.toString()).then()
				.post(baseUrl + "home/api/" + service);

		assertTrue(response.statusCode() == 200 || response.statusCode() == 201);
		assertNotNull(response.asString());
		assertFalse(response.asString().contains("error"));
	}

	//////////

	public void assertStatus(int codeResultStatus, int statusCode) {
		Assert.assertEquals(codeResultStatus, statusCode);

	}

	public int executeCallBack(String typeCall, String baseUrl, String adressOfCall, String providerId,
			String providerUserId) {
		int statusCode = 0;

		if (typeCall.toString().equalsIgnoreCase("POST")) {
			throw new PendingException();
		} else {
			if (typeCall.toString().equalsIgnoreCase("DELETE")) {
				throw new PendingException();
			} else {
				if (typeCall.toString().equalsIgnoreCase("PUT")) {
					throw new PendingException();
				} else {
					if (typeCall.toString().equalsIgnoreCase("GET")) {
						statusCode = get(baseUrl + adressOfCall + providerId + "/" + providerUserId).statusCode();
					}
				}
			}
		}

		return statusCode;
	}

	public int executeCallBack(String typeCall, String baseUrl, String adressOfCall, String providerId) {
		int statusCode = 0;

		if (typeCall.toString().equalsIgnoreCase("POST")) {
			throw new PendingException();
		} else {
			if (typeCall.toString().equalsIgnoreCase("DELETE")) {
				throw new PendingException();
			} else {
				if (typeCall.toString().equalsIgnoreCase("PUT")) {
					throw new PendingException();
				} else {
					if (typeCall.toString().equalsIgnoreCase("GET")) {
						statusCode = get(baseUrl + adressOfCall + providerId).statusCode();
					}
				}
			}
		}

		return statusCode;
	}

	public int executeCallBack(String typeCall, String baseUrl, String adressOfCall) {
		int statusCode = 0;

		if (typeCall.toString().equalsIgnoreCase("POST")) {
			throw new PendingException();
		} else {
			if (typeCall.toString().equalsIgnoreCase("DELETE")) {
				throw new PendingException();
			} else {
				if (typeCall.toString().equalsIgnoreCase("PUT")) {
					throw new PendingException();
				} else {
					if (typeCall.toString().equalsIgnoreCase("GET")) {
						statusCode = get(baseUrl + adressOfCall).statusCode();
					}
				}
			}
		}

		return statusCode;
	}
}