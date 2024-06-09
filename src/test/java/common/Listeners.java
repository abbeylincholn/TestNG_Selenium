package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting");

	}

	public void onTestSuccess(ITestResult result) {
		// System.out.println("Test case is starting");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");

	}

	public void onTestSkipped(ITestResult result) {
		// System.out.println("Test case is starting");

	}

	public void onTestFailedWithinSuccessPercentage(ITestResult result) {
		// System.out.println("Test case is starting");

	}
}
