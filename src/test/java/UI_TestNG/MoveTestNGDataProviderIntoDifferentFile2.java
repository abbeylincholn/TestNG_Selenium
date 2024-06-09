
package UI_TestNG;

import org.testng.annotations.DataProvider;

public class MoveTestNGDataProviderIntoDifferentFile2 {

	// all dataprovider will be here

	@DataProvider(name = "create")
	public Object[][] dataSet1() {

		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce" },
				{ "performance_glitch_user", "secret_sauce" } };
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

}
