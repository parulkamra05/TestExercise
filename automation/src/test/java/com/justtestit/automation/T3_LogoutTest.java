package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T3_LogoutTest extends BaseTest {
	WebDriver driver;

	@Before
	public void beforeTest() {
		driver = SetDriver();
	}

	@Test
	public void t3_logoutTest() throws InterruptedException {
		LogoutPage logoutPage = new LogoutPage();
		logoutPage.verifyLogOut(driver);
	}

	@After
	public void closedriver() {
		tearDown(driver);
	}
}
