package com.justtestit.automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {

	private By loginNameBy = By.name("login");
	private By loginpasswordBy = By.name("password");
	private By loginBy = By.xpath("//button[@type='submit']");
	private By profileLinkBy = By.xpath("//a[@href='/profile']");
	private By currentPasswordBy = By.xpath("//input[@id='currentPassword']");
	private By newPasswordBy = By.xpath("//input[@id='newPassword']");
	private By newPasswordConfirmationBy = By.xpath("//input[@id='newPasswordConfirmation']");
	private By saveProfileBy = By.xpath("//button[@type='submit']");
	private By profileSaveMessageBy = By.xpath("//*[contains(text(),'The profile has been saved successful')]");
	private By logoutBy = By.xpath("//a[contains(text(),'Logout')]");

	public void verifyChangePassword(WebDriver driver) throws InterruptedException {
		System.out.println("Testcase4: Verify Change Password");
		System.out.println("Logging in");
		getWebElement(loginNameBy, driver).sendKeys(Constants.LOGIN_NAME);
		getWebElement(loginpasswordBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(loginBy, driver).click();
		Thread.sleep(3000);
		System.out.println("Navigating to Profile page");
		getWebElement(profileLinkBy, driver).click();
		System.out.println("Changing password");
		Thread.sleep(3000);
		getWebElement(currentPasswordBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(newPasswordBy, driver).sendKeys(Constants.PASSWORD_NEW);
		getWebElement(newPasswordConfirmationBy, driver).sendKeys(Constants.PASSWORD_NEW);
		getWebElement(saveProfileBy, driver).click();

		Thread.sleep(3000);
		WebElement msg = getWebElement(profileSaveMessageBy, driver);
		String actualSuccessMessage = msg.getText();
		Assert.assertEquals(Constants.EXPECTED_PROFILE_MESSAGE, actualSuccessMessage);
		System.out.println("The profile has been saved successful with new password");
		System.out.println("Logging out");
		getWebElement(logoutBy, driver).click();
		System.out.println("Logout successfully");
		Thread.sleep(3000);

		System.out.println("Verifying login with new password");
		getWebElement(loginNameBy, driver).sendKeys(Constants.LOGIN_NAME);
		getWebElement(loginpasswordBy, driver).sendKeys(Constants.PASSWORD_NEW);
		getWebElement(loginBy, driver).click();
		System.out.println("Login with new password successful");

		System.out.println("Resetting to previous password");
		Thread.sleep(3000);
		getWebElement(profileLinkBy, driver).click();
		Thread.sleep(3000);
		getWebElement(currentPasswordBy, driver).sendKeys(Constants.PASSWORD_NEW);
		getWebElement(newPasswordBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(newPasswordConfirmationBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(saveProfileBy, driver).click();
		System.out.println("Change Password save successful");
		getWebElement(logoutBy, driver).click();
		System.out.println("Logout successfully");
		Thread.sleep(3000);

		System.out.println("Verifying login with previous password");
		getWebElement(loginNameBy, driver).sendKeys(Constants.LOGIN_NAME);
		getWebElement(loginpasswordBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(loginBy, driver).click();
		System.out.println("Login success with changed password again");
		System.out.println("Testcase4: Verify Change Password ends.....");
	}

	private WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);
	}
}
