package com.justtestit.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

	private By loginNameBy = By.name("login");
	private By passwordBy = By.name("password");
	private By loginBy = By.xpath("//button[@type='submit']");
	private By logoutBy = By.xpath("//a[contains(text(),'Logout')]");

	public void verifyLogOut(WebDriver driver) throws InterruptedException {
		System.out.println("Testcase3: Verify Logout");
		System.out.println("Logging In");
		getWebElement(loginNameBy, driver).sendKeys("Test06");
		getWebElement(passwordBy, driver).sendKeys("*Mycars06");
		getWebElement(loginBy, driver).click();
		Thread.sleep(3000);
		System.out.println("Click Logout");
		getWebElement(logoutBy, driver).click();
		System.out.println("Logout successfully");
		System.out.println("Testcase3: Logout ends.....");
	}

	private WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);
	}
}
