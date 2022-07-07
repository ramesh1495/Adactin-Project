package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Examples {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multiple);
	    boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		
		System.out.println("**alloptions**");
		List<WebElement> alloptions = s.getOptions();
		
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
			}
		
		System.out.println("**all selected option**");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement allselected : allSelectedOptions) {
			String text = allselected.getText();
			System.out.println(text);
			}
		
		System.out.println("**first selected option**");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println("deselect all");
		s.deselectAll();
		
	}

}
