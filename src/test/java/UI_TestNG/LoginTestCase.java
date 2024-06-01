package UI_TestNG;

import org.testng.annotations.Test;

public class LoginTestCase {

	@Test(priority = 1, description = "This is a login test")

	public void bloginTest()

	{
		System.out.println("Login is Successful");

	}

	@Test(priority = 2, description = "This is a logout test")
	public void alogoutTest() {
		System.out.println("Logout is Successful");
	}

}
