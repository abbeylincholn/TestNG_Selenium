package UI_TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class MoveTestNGDataProviderIntoDifferentFile4 {

	// all dataprovider will be here incase the data argument varies. some could be
	// 2 or more data set argument

	@DataProvider(name = "create1")
	public Object[][] dataSet1(Method m) {
		Object[][] testdata = null;

		if (m.getName().equals("test2")) {
			testdata = new Object[][] { { "username", "password", "test" }, { "username1", "password1", "test1" },
					{ "username2", "password2", "test2" }, { "username3", "password3", "test3" } };
		}

		else if (m.getName().equals("test3")) {
			testdata = new Object[][] { { "username", "password" }, { "username1", "password1" },
					{ "username2", "password2" }, { "username3", "password3" } };
		}

		return testdata;

	}

}
