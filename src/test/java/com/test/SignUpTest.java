package com.test;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.utility.BaseClass;

public class SignUpTest extends BaseClass{
	@Test
	public void accountCreat() {
		
	System.out.println((driver.findElement(By.xpath("//div[@class='signUpAction']")).getText()));
	driver.findElement(By.xpath("//span[text()='Sign up']")).click();	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshaybhavre002@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aa$21234");
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.findElement(By.xpath("//img[contains(@src,'data:image/svg+xml')]")).click();
	}



}
