package com.kalbi.test.smoke;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kalbi.lib.ui.LoginPage;
import com.kalbi.test.config.CreateDriver;

public class CITTest {

		WebDriver driver;
		LoginPage login;
		
		@BeforeMethod
		public void preCondition(){
			driver=CreateDriver.getDriverInstance();
			login=new LoginPage(driver);
		}
		
		@AfterMethod
		public void postCondition(){
			driver.close();
		}
		
		@Test
		public void testSample(){
			login.waitForLoginPageToLoad();
			String actualTitle=driver.getTitle();
			String expectedTitle="actiTIME - Login";
			AssertJUnit.assertEquals(actualTitle, expectedTitle);
		}
			

}
