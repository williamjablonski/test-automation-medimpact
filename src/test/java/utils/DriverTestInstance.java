package utils;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class DriverTestInstance {

	// Generate generic driver
	protected static WebDriver driver = null;
	protected static DesiredCapabilities capabilities = null;
	protected static String baseUrl = System.getProperty("baseUrl", "https://www.medimpact.com"); // mvn
																									// install
																									// -DbaseUrl="https://www.medimpact.com"

	@BeforeClass
	public static void setUp() throws Exception {

		// Set capabilities
		capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability("takesScreenshot", false);

		// Generate specific driver
		CrossBrowserTest driverFactory = PageFactory.initElements(driver, CrossBrowserTest.class);

		String webdriver = System.getProperty("browser", "chrome");

		if(webdriver == "firefox") {

			//driver = driverFactory.firefoxFactoryDriver(); 
		}	
		if(webdriver == "chrome"){
			driver = driverFactory.googleChromeFactoryDriver();
		}
		if(webdriver == "phantomjs"){
			//driver = driverFactory.ghostDriverFactory(capabilities);
		}	
		if(webdriver == "htmlunit"){
			//driver = driverFactory.htmlUnitDriverFactory();
		}

		// Navigate to the right place
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		// Close the browser
		driver.close();
		driver.quit();
	}

}