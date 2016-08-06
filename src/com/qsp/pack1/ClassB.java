package com.qsp.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassB {
	
	@Test
	public void funA()
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Reporter.log("Maven-Jenkins Integration Testing",true);
		
	}

}
