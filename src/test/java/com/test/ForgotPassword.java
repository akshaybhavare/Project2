package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.BaseClass;

public class ForgotPassword extends BaseClass {

	@Test
	public void forgot() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@class='forgotaction']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshaybhavre002@gmail.com");
		driver.findElement(By.xpath("//button[text()='Send Instructions']")).click();
		
		
	}
	
	
	
	
}
