package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
			
		simple.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		
		
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
