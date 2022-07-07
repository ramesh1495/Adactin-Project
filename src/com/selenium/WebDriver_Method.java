package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
	
	WebDriver driver = new ChromeDriver(); 
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().back();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.navigate().forward();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
