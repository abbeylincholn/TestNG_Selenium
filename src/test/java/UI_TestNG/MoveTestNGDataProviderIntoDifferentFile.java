package UI_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveTestNGDataProviderIntoDifferentFile {

	// how to use the dataprovider to fetch for data to perform test. Data Driving
	// Testing
	// linked to file2

	// ----------------------------------------------------------------------------------

	@Test(dataProvider = "create", dataProviderClass = MoveTestNGDataProviderIntoDifferentFile2.class)
	public void test(String username, String password) {
		WebDriverManager.chromedriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();

	}

	@Test(dataProvider = "dataSet", dataProviderClass = MoveTestNGDataProviderIntoDifferentFile2.class)
	public void test1(String username, String password) {
		System.out.println(username + "====" + password);
	}
	// ----------------------------------------------------------------------------------

}
