package com.justtestit.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private By loginNameBy = By.name("login");
	private By loginpasswordBy = By.name("password");
	private By loginBy = By.xpath("//button[@type='submit']");
	private By hiUserBy = By.xpath("//*[contains(text(),'Hi,')]");
	private By profileLinkBy = By.xpath("//a[@href='/profile']");
	private By logoutBy = By.xpath("//a[contains(text(),'Logout')]");

	public void verifyLogin(WebDriver driver) throws InterruptedException {
		System.out.println("Testcase2: Verify Login");
		System.out.println("Input username and password");	
		getWebElement(loginNameBy, driver).sendKeys(Constants.LOGIN_NAME);
		getWebElement(loginpasswordBy, driver).sendKeys(Constants.PASSWORD1);
		getWebElement(loginBy, driver).click();
		Thread.sleep(3000);
		getWebElement(hiUserBy, driver).isDisplayed();
		getWebElement(profileLinkBy, driver).isDisplayed();
		getWebElement(logoutBy, driver).isDisplayed();
		System.out.println("Hi, Profile link, Logout button visibility shows successful Login");
		System.out.println("Testcase2: Login ends.....");	
	}

	private WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);
	}
}
