package com.justtestit.automation;

import java.util.UUID;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlfaRomeoVotePage {

	private By registerBy = By.xpath("//a[@class='btn btn-success-outline']");
	private By usernameBy = By.id("username");
	private By firstNameBy = By.id("firstName");
	private By lastNameBy = By.id("lastName");
	private By passwordBy = By.id("password");
	private By confirmPasswordBy = By.id("confirmPassword");
	private By saveBy = By.xpath("//button[@class='btn btn-default']");
	private By homePageLinkBy = By.xpath("//a[@class='navbar-brand']");
	private By loginNameBy = By.name("login");
	private By loginpasswordBy = By.name("password");
	private By loginBy = By.xpath("//button[@type='submit']");
	private By imageGuiliaLinkBy = By.xpath("//img[@title='Guilia Quadrifoglio']");
	private By voteCountBy = By.xpath("//div[@class='card-block']/h4/strong");
	private By inputVoteCommentBy = By.xpath("//textarea[@id='comment']");
	private By voteButtonBy = By.xpath("//button[@class='btn btn-success']");
	private By voteSuccessBy = By.xpath("//*[contains(text(),'Thank you for your vote!')]");

	public void verifyAlfaRomeoVote(WebDriver driver) throws InterruptedException {
		System.out.println("Testcase5: Verify AlfaRomeo Vote Test");
		Thread.sleep(2000);
		System.out.println("Registering new user");
		getWebElement(registerBy, driver).click();
		String username = getUuid();
		getWebElement(usernameBy, driver).sendKeys(username);
		System.out.println("The login name is " + username);
		getWebElement(firstNameBy, driver).sendKeys(Constants.FIRST_NAME);
		getWebElement(lastNameBy, driver).sendKeys(Constants.LAST_NAME);
		getWebElement(passwordBy, driver).sendKeys(Constants.PASSWORD);
		getWebElement(confirmPasswordBy, driver).sendKeys(Constants.CONFIRM_PASSWORD);
		getWebElement(saveBy, driver).click();
		System.out.println("Registration success");
		System.out.println("Navigate to home page");
		getWebElement(homePageLinkBy, driver).click();
		Thread.sleep(3000);

		System.out.println("Logging in with new user");
		getWebElement(loginNameBy, driver).sendKeys(username);
		getWebElement(loginpasswordBy, driver).sendKeys(Constants.PASSWORD);
		getWebElement(loginBy, driver).click();
		Thread.sleep(3000);
		System.out.println("Click on Alfa Romeo Guilia Quadrifoglio image on home page");
		getWebElement(imageGuiliaLinkBy, driver).click();
		Thread.sleep(5000);

		WebElement voteCountElement = getWebElement(voteCountBy, driver);
		String currentVoteCount = voteCountElement.getText();
		System.out.println("The current vote count is " + currentVoteCount);
		System.out.println("Proceeding for Comment and click vote");
		getWebElement(inputVoteCommentBy, driver).sendKeys(Constants.VOTE_COMMENT);
		getWebElement(voteButtonBy, driver).click();
		System.out.println("Voting button disappeared success");
		Thread.sleep(3000);
		String newVoteCount = voteCountElement.getText();
		System.out.println("The new vote count is " + newVoteCount);
		WebElement msg = getWebElement(voteSuccessBy, driver);
		String actualVoteMessage = msg.getText();
		Assert.assertEquals(Constants.VOTE_SUCCESS_MESSAGE, actualVoteMessage);
		System.out.println("Thank you for your vote!");
		System.out.println("Testcase5: Verify AlfaRomeo Vote Test ends.....");
	}

	private WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);
	}

	private String getUuid() {
		return UUID.randomUUID().toString();
	}
}