package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.setProperty("org.uncommons.reportng.title", "RCV Academy Test Report");
		System.setProperty("org.uncommons.reportng.show-regression-column", "true");
		Reporter.log("Method name is - " + result.getName());
		System.out.println("Test case is starting");

	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - " + result.getStatus());
		// System.out.println("Test case is starting");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");

		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log(
				"<a href=\"C:\\Users\\Engr. Abbey\\eclipse-workspace\\WebPortal_TestNg\\screenshot\">Test Results</a>");

	}

	public void onTestSkipped(ITestResult result) {
		// System.out.println("Test case is starting");

	}

	public void onTestFailedWithinSuccessPercentage(ITestResult result) {
		// System.out.println("Test case is starting");

	}
}
