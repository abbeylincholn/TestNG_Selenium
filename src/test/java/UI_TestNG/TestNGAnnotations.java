package UI_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeTest // before test class
	public void loginToApplication() {
		System.out.println("Login to application");
	}

	@AfterTest // after test class
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB Connected");
	}

	@AfterMethod
	public void disconnectToDB() {
		System.out.println("DB Disconnected");
	}

	@Test(priority = 1, description = "This is a login test")

	public void bTest1()

	{
		System.out.println("Test1");

	}

	@Test(priority = 2, description = "This is a logout test")
	public void aTest2() {
		System.out.println("Test2");
	}

}
