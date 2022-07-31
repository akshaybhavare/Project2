package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.BaseClass;

public class LogIntest extends BaseClass {

	@Test
	public void logInValidCradentials() {
		driver.findElement(By.xpath("//input[@class='emailInput']")).sendKeys("akshaybhavre002@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aa$21234");
		driver.findElement(By.xpath("//div[@class='emailsubmitActions']")).click();
		
		
		
	}

}
