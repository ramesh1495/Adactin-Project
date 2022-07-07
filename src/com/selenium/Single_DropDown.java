package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select s =new Select(day);
		s.selectByValue("7");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s.selectByVisibleText("2022");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
