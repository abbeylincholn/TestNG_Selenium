package UI_TestNG;

import org.testng.annotations.Test;

public class MoveTestNGDataProviderIntoDifferentFile3 {

	// how to use the dataprovider to fetch for data to perform test. Data Driving
	// Testing
	// linked to file4

	@Test(dataProvider = "create1", dataProviderClass = MoveTestNGDataProviderIntoDifferentFile4.class)
	public void test2(String username, String password, String test) {
		System.out.println(username + "====" + password + "====" + test);
	}

	@Test(dataProvider = "create1", dataProviderClass = MoveTestNGDataProviderIntoDifferentFile4.class)
	public void test3(String username, String password) {
		System.out.println(username + "====" + password);
	}

}