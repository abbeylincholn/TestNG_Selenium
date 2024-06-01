package UI_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToUseAssertion {

	@Test(groups = "regression")
	public void titleTest() {

		// verify the tile
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}

}
