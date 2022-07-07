package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,4000);");
		
		js.executeScript("window.scrollBy(0,-2000);");
		
		WebElement Germany = driver.findElement(By.xpath("//a[text ( ) ='Germany']"));
		
		js.executeScript("arguments[0].click();", Germany);
		
		//screenshots
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\asus\\eclipse-workspace\\Selenium\\Screenshots\\amazon.png");
		FileUtils.copyFile(screenshot, destination);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
