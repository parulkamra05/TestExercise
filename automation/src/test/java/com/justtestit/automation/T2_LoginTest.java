package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T2_LoginTest extends BaseTest {
	WebDriver driver;

	@Before
	public void beforeTest() {
		driver = SetDriver();
	}

	@Test
	public void t2_loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.verifyLogin(driver);
	}

	@After
	public void closedriver() {
		tearDown(driver);
	}
}
