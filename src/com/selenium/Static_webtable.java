package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.leafground.com/pages/table.html");
	
	List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement all : allData) {
		System.out.println(all.getText());
		}
	
	System.out.println("----------Row data--------");
	List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
	for (WebElement row : rowdata) {
		System.out.println(row.getText());
		
	}
	
	System.out.println("------column data-------");
	List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	for (WebElement column : columnData) {
		System.out.println(column.getText());
		}
	
	System.out.println("-------Single data---------");
	WebElement singleData = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]"));
	System.out.println(singleData.getText());
	
}

}
