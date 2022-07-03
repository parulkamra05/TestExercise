package com.justtestit.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T5_AlfaRomeoVoteTest extends BaseTest {
	WebDriver driver;

	@Before
	public void beforeTest() {
		driver = SetDriver();
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
