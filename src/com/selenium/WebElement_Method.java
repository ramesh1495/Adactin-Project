package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Method {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailid = driver.findElement(By.id("email"));
		
		emailid.sendKeys("RAMESH@5016");
		
		emailid.clear();
		
		
		boolean displayed = emailid.isDisplayed();
		System.out.println(displayed);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("pkt45879");
		
		boolean enabled = password.isEnabled();
		
		System.out.println(enabled);
		
		WebElement login = driver.findElement(By.name("login"));
		
		boolean selected = login.isSelected();
		System.out.println(selected);
		
		login.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
