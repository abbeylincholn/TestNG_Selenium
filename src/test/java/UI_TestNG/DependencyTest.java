package UI_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependencyTest extends BaseTest {

	@Test
	public void userRegistration() {

		Reporter.log("This is test1");
		System.out.println("This is test1");
		driver.get("https://www.ebay.com");
		Assert.assertTrue(false);
	}

	// @Test(dependsOnMethods = "userRegistration") // hard dependency
	@Test(dependsOnMethods = "userRegistration", alwaysRun = true) // soft dependency
	public void userSearch() {
		System.out.println("This is test2");
	}

	@Test(groups = "smoke")
	public void reporterTest3() {
		System.out.println("This is test3");
		Assert.assertTrue(false);
	}

	@Test(groups = "sanity")
	public void reporterTest4() {
		System.out.println("This is test4");
	}

}
