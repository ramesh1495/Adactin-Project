package com.selenium;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\asus\\eclipse-workspace\\Selenium\\Screenshots\\flipkart.png");
		
		FileUtils.copyFile(scr, dest);
		
		
		
		
		
		
		
		
		
		
		
	}

}
