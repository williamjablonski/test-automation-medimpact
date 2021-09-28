package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class LibraryUtils {

	public void fluentWait(WebDriver driver, WebElement itemPage,
			final String idLocator) {
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(1, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id(idLocator));
			}
		});

	}

	public void findElementInTable(String value, WebElement table) {

		List<WebElement> TableLine = table.findElements(By.tagName("td"));
		for (int i = 0; i < TableLine.size(); i++) {

			if (TableLine.get(i).getText().equalsIgnoreCase(value)) {
				Assert.assertEquals(TableLine.get(i).getText(), value);
			}
		}

	}
	
	public void scrollToElement(WebElement element, WebDriver driver){
		 int elementPosition = element.getLocation().getY();
		   elementPosition = elementPosition-200; // You can change 200 to any value if your page have sticky header       
		   System.out.println(elementPosition);
		   String js = String.format("window.scroll(0, %s)", elementPosition);
		   ((JavascriptExecutor)driver).executeScript(js);
	}
}
