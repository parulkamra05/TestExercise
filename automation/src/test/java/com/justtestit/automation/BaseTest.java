package com.justtestit.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected WebDriver SetDriver() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://buggy.justtestit.org");
		return driver;
	}

	protected void tearDown(WebDriver driver) {
		driver.close();
	}
}
