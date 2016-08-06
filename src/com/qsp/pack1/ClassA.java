package com.qsp.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test
	public void funA()
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		Reporter.log("Maven-Jenkins Integration Testing",true);
		
	}

}
