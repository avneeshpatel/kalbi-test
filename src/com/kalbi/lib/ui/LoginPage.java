package com.kalbi.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUserUserNameTextbox(){
		return driver.findElement(By.name("username"));
	}
	
	public WebElement getUserPasswordTextbox(){
		return driver.findElement(By.name("pwd"));
	}

	public WebElement getLoginButton(){
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}
	
	public void waitForLoginPageToLoad(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("LoginForm"))));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//html[@class=' ext-strict']"))));
	}
}
