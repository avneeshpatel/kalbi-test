package com.kalbi.test.regression;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RegressionTest {

		
		@BeforeMethod
		public void preCondition(){
			System.out.println("Regression Pre-conditions");
		}
		
		@AfterMethod
		public void postCondition(){
			System.out.println("Regression Post-Conditions");
		}
		
		@Test
		public void RegressionTesting(){
			System.out.println("Running Regression Testing");
			
		}
			

}
