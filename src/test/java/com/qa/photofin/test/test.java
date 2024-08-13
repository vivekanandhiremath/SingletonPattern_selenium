package com.qa.photofin.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.photofin.base.WebdriverManager;

public class test {
	private WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
//	driver=DriverFactory.getDrivcer("edge").createDriver();

		driver = WebdriverManager.getInstance(browser).getDriver();
		driver.get("https://staging.photonfin.com/#/");

	}

	@Test
	public void test1() {
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void teardown() {
		WebdriverManager.quitBrowser();
	}
}
