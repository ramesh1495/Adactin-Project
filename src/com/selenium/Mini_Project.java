package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("kumarchennai");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("kumar@123"); 
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	    WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	    Select s = new Select(location);
	    s.selectByVisibleText("Sydney");
	    
	    WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	    Select s1 = new Select(Hotels);
	    s1.selectByVisibleText("Hotel Sunshine");
	    
	    WebElement Roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	    Select s2 = new Select(Roomtype);
	    s2.selectByVisibleText("Super Deluxe");
	    
	    WebElement no_of_rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    Select s3 = new Select(no_of_rooms);
	    s3.selectByValue("10");
	    
	    WebElement check_in = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	    check_in.clear();
	    check_in.sendKeys("07/06/2022");
	    
	    WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Select s4 = new Select(adult_room);
	    s4.selectByValue("2");
	    
	    WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	    search.click();
	    
	    WebElement confirm = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	    confirm.click();
	    
	    WebElement ok = driver.findElement(By.xpath("//input[@name='continue']"));
	    ok.click();
	    
	    WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
	    first_name.sendKeys("kumar");
	    
	    WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
	    last_name.sendKeys("chennai");
	    
	    WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	    address.sendKeys("xxxx");
	    
	    WebElement card_no = driver.findElement(By.xpath("//input[@name='cc_num']"));
	    card_no.sendKeys("0123456789876543");
	    
	    WebElement card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
	    Select s5 = new Select(card_type);
	    s5.selectByVisibleText("Master Card");
	    
	    WebElement card_ex_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	    Select s6 = new Select(card_ex_month);
	    s6.selectByVisibleText("November");
	    
	    WebElement card_ex_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	    Select s7 = new Select(card_ex_year);
	    s7.selectByValue("2022");
	    
	    WebElement card_cv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    card_cv.sendKeys("123");
	    
	    WebElement book_now = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	    book_now.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
