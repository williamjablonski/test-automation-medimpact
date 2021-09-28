package utils;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CrossBrowserTest extends DriverTestInstance{

	////final String chromeBinary = "/Application/chrome.exe";
	// mac
	//final String chromeBinary = "/Users/admin/Downloads/chromedriver"; 
	//final String webdriverChromeBinary = "/Users/admin/Downloads/chromedriver";
	// ubuntu 20
	final String chromeBinary = "/usr/bin/chromedriver"; 
	final String webdriverChromeBinary = "/usr/bin/chromedriver";
	
	final String ieDriverServer = "C:/Java/drivers/IEDriverServer_x64_2.39.0/IEDriverServer.exe";
	//final String phantomjsBinaryPath = "C:/Java/drivers/phantomjs-1.9.7-windows/phantomjs-1.9.7-windows/phantomjs.exe";
	//final String phantomjsBinaryPath = "/home/jenkins/phantomjs-1.9.8-linux-x86_64/bin/phantomjs";
	final String phantomjsBinaryPath = "/usr/local/Cellar/phantomjs/2.0.0bin/phantomjs";

	 //Test with GHostDriver

	public WebDriver ghostDriverFactory(DesiredCapabilities cap) {
		System.setProperty("phantomjs.binary.path", phantomjsBinaryPath);
		driver = new PhantomJSDriver(capabilities);
		return driver;
	}



	//Test with FireFox
	public WebDriver firefoxFactoryDriver() {
		driver = new FirefoxDriver();
		return driver;
	}

	// Test with Chrome
	public WebDriver googleChromeFactoryDriver() {
		capabilities = DesiredCapabilities.chrome();
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability("chrome.binary", chromeBinary);
		System.setProperty("webdriver.chrome.driver", webdriverChromeBinary);
		driver = new ChromeDriver(capabilities);
		return driver;
	}

	//Test with IE
	public WebDriver internetExplorerDriverFactory() {
		File file = new File(ieDriverServer);
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(capabilities);
		return driver;
	}

	//Test with HTML Unit Driver
	public WebDriver htmlUnitDriverFactory() {
		driver = new HtmlUnitDriver(capabilities);
		return driver;
	}



	


}