package com.bellnexx.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bellnexx.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	
	@Test
	public void loginAsBankManager() throws InterruptedException, IOException {
		verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("inside login test");
		click("bmlBtn_CSS");
		//driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"login not successful");
		log.debug("Login successfully executed");
		//Reporter.log("Login successfully executed");
		//Reporter.log("Capturing Screenshot");
		//Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Akash\\Documents\\selenium\\Screenshot\\error.jpg\">Screenshot</a>");
		//Reporter.log("<br>");
		//Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Akash\\Documents\\selenium\\Screenshot\\error.jpg\">img src=\"C:\\Users\\Akash\\Documents\\selenium\\Screenshot\\error.jpg\" height=40 width=40></img></a>");
		//System.setProperty("org.uncommons.reportng.escape-output", "false");
			//Assert.fail("Login not successful");
	}
}

