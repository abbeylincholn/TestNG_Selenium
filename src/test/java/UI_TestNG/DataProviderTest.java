package UI_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	// first method
	@Test(dataProvider = "create")
	public void test(String username, String password, String test) {
		System.out.println(username + "====" + password);
	}

	@DataProvider(name = "create")
	public Object[][] dataSet1() {

		return new Object[][] { { "username", "password", "test" }, { "username1", "password1", "test1" },
				{ "username2", "password2", "test2" }, { "username2", "password2", "test3" }, };
	}

	// second method

	@Test(dataProvider = "dataSet")
	public void test(String username, String password) {
		System.out.println(username + "====" + password);
	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataSet = new Object[4][2];

		// first row data
		dataSet[0][0] = "username1";
		dataSet[0][1] = "password1";

		// second row data
		dataSet[1][0] = "username2";
		dataSet[1][1] = "password2";

		// third row data
		dataSet[2][0] = "username3";
		dataSet[2][1] = "password3";

		// fourth row data
		dataSet[3][0] = "username4";
		dataSet[3][1] = "password4";

		return dataSet;
	}

	/*
	 * //second method
	 * 
	 * @Test(dataProvider = "dataSet") public void test(String username, String
	 * password) { System.out.println(username + "====" + password); }
	 * 
	 * 
	 * @DataProvider public Object[][] dataSet() {
	 * 
	 * Object[][] dataSet = new Object[4][2];
	 * 
	 * // first row data // multidimensional object data dataSet[0][0] =
	 * "username1"; dataSet[0][1] = "password1";
	 * 
	 * // second row data dataSet[1][0] = "username2"; dataSet[1][1] = "password2";
	 * 
	 * // third row data dataSet[2][0] = "username3"; dataSet[2][1] = "password3";
	 * 
	 * // fourth row data dataSet[3][0] = "username4"; dataSet[3][1] = "password4";
	 * 
	 * return dataSet;
	 * 
	 * }
	 */

}
