package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_BuggyCars extends BaseTest {
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

	@Test
	public void t2_loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.verifyLogin(driver);
	}

	@Test
	public void t3_logoutTest() throws InterruptedException {
		LogoutPage logoutPage = new LogoutPage();
		logoutPage.verifyLogOut(driver);
	}

	@Test
	public void t4_changePasswordTest() throws InterruptedException {
		ChangePasswordPage changePasswordpage = new ChangePasswordPage();
		changePasswordpage.verifyChangePassword(driver);
	}

	@Test
	public void t5_alfaRomeoVoteTest() throws InterruptedException {
		AlfaRomeoVotePage alfaRomeoVotePage = new AlfaRomeoVotePage();
		alfaRomeoVotePage.verifyAlfaRomeoVote(driver);
	}

	@After
	public void closedriver() {
		tearDown(driver);
	}

}
