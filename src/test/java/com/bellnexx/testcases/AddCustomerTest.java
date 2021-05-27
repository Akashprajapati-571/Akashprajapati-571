package com.bellnexx.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bellnexx.base.TestBase;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName, String postCode, String alerttext) throws InterruptedException {
		click("addCustBtn_CSS");
		type("firstname_CSS",firstName);
		type("lastname_XPATH",lastName);
		type("postcode_CSS",postCode);
		click("addbtn_CSS");
		Thread.sleep(3000);
		
		
		//driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
	

	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     Assert.assertTrue(alert.getText().contains(alerttext));
	     
	     alert.accept();
	     Thread.sleep(3000);
	     
	     //Assert.fail("Customer not added successfully");
	}

	@DataProvider
	public Object [][] getData(){
		String SheetName= "AddCustomerTest";
		
		int rows = excel.getRowCount(SheetName);
		int cols = excel.getColumnCount(SheetName);

		Object[][] data = new Object[rows-1][cols];

		for(int rowNum=2; rowNum<=rows; rowNum++){
		for(int colNum=0; colNum<cols; colNum++){
		data[rowNum-2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
		}
		}
		return data;
		
	}
}
