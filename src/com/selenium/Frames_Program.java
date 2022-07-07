package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Program {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");	
		
	WebDriver driver = new ChromeDriver();
	
    driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("singleframe");
	WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
	textbox1.sendKeys("java");
	
	driver.switchTo().defaultContent();
	
	WebElement iframebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	iframebutton.click();
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	
	WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
	driver.switchTo().frame(innerframe);
	
	WebElement innerbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	innerbox.sendKeys("SELENIUM");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
