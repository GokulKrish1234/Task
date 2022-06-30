package org.git;

import org.cv.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends Base {
public static void main(String[] args) {
	browserLaunch("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	fill(email, "rsboi");
	
	WebElement password = driver.findElement(By.id("pass"));
	fill(password, "12345678");
	
	WebElement loginbutton = driver.findElement(By.name("login"));
	btnClick(loginbutton);
	
	driver.close();
	
	System.out.println("work is done");
	
}
}
