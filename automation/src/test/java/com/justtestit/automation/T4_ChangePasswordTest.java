package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T4_ChangePasswordTest extends BaseTest {
	WebDriver driver;

	@Before
	public void beforeTest() {
		driver = SetDriver();
	}

	@Test
	public void t4_changePasswordTest() throws InterruptedException {
		ChangePasswordPage changePasswordpage = new ChangePasswordPage();
		changePasswordpage.verifyChangePassword(driver);
	}

	@After
	public void closedriver() {
		tearDown(driver);
	}
}
