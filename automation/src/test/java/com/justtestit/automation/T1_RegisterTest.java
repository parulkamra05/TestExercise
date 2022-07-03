package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T1_RegisterTest extends BaseTest {
	WebDriver driver;

	@Before
	public void beforeTest() {
		driver = SetDriver();
	}

	@Test
	public void t1_registerTest() throws InterruptedException {
		RegisterPage registerPage = new RegisterPage();
		registerPage.verifyRegister(driver);
	}

	@After
	public void closedriver() {
		tearDown(driver);
	}

}


