package UI_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(groups = "user-registration")
public class SoftAssertion {

	@Test
	public void titleTest() {

		// verfy title and text

		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Electronics, Cars, ffffFashion, Collectibles & More | eBay";
		String expectedText = "Searchhhn";

		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		System.out.println("Verifying Title");
		String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle, "Text verification failed");

		System.out.println("Verifying Text");
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actualText, expectedText, "Text verification failed");

		System.out.println("Closing Browser");
		driver.close();
		softassert.assertAll();

	}

}
