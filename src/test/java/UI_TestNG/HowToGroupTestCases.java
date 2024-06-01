package UI_TestNG;

import org.testng.annotations.Test;

@Test(groups = "admin-registration")
public class HowToGroupTestCases {

	@Test(priority = 1, groups = "regression")

	public void aTest1()

	{
		System.out.println("test1");

	}

	@Test(priority = 2, groups = "regression")
	public void bTest2() {
		System.out.println("test2");
	}

	@Test(groups = { "regression", "smoke" })

	public void bTest3()

	{
		System.out.println("test3");

	}

	@Test(groups = "smoke or bvt")
	public void bTest4() {
		System.out.println("test4");
	}

}
