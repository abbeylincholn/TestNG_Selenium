package UI_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {

	@BeforeClass

	public void beforeClass()

	{
		System.out.println("Run this before class");

	}

	@AfterClass

	public void afterClass()

	{
		System.out.println("Run this after class");

	}

	@BeforeGroups(value = "regression")

	public void beforeGroup() {
		System.out.println("Run this method before regression");

	}

	@AfterGroups(value = "regression")

	public void afterGroup() {
		System.out.println("Run this method after regression");

	}

	@Test(priority = 2, groups = "regression")
	public void bTest2() {
		System.out.println("test2");
	}

	@Test(priority = 1, groups = { "regression", "smoke" })

	public void aTest3() {
		System.out.println("test3");

	}

	@Test(groups = "smoke or bvt")
	public void bTest4() {
		System.out.println("test4");
	}

}
