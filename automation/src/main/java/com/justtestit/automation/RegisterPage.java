package com.justtestit.automation;

import java.util.UUID;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	private By registerBy = By.xpath("//a[@class='btn btn-success-outline']");
	private By usernameBy = By.id("username");
	private By firstNameBy = By.id("firstName");
	private By lastNameBy = By.id("lastName");
	private By passwordBy = By.id("password");
	private By confirmPasswordBy = By.id("confirmPassword");
	private By saveBy = By.xpath("//button[@class='btn btn-default']");
	private By successMessageBy = By.xpath("//*[contains(text(),'Registration is successful')]");

	public void verifyRegister(WebDriver driver) throws InterruptedException {
		System.out.println("Testcase1: Verify Registration");		
		Thread.sleep(3000);
		getWebElement(registerBy, driver).click();
		getWebElement(usernameBy, driver).sendKeys(getUuid());
		System.out.println("The login name is " + getUuid());
		getWebElement(firstNameBy, driver).sendKeys(Constants.FIRST_NAME);
		getWebElement(lastNameBy, driver).sendKeys(Constants.LAST_NAME);
		getWebElement(passwordBy, driver).sendKeys(Constants.PASSWORD);
		getWebElement(confirmPasswordBy, driver).sendKeys(Constants.CONFIRM_PASSWORD);
		getWebElement(saveBy, driver).click();
		Thread.sleep(3000);

		WebElement msg = driver.findElement(successMessageBy);
		String actualSuccessMessage = msg.getText();
		Assert.assertEquals(Constants.EXPECTED_REGISTER_MESSAGE, actualSuccessMessage);
		System.out.println("Resgistration is successful");
		System.out.println("Testcase1:Registration ends.....");	
	}

	private WebElement getWebElement(By by, WebDriver driver) {
		return driver.findElement(by);
	}

	private String getUuid() {
		return UUID.randomUUID().toString();
	}
}
