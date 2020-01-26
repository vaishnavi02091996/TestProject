package com.automationtesting.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		/*Set the path of chrome executables*/
		System.setProperty("webdriver.chrome.driver", ".\\exe\\chromedriver.exe");
		
		/*open chrome driver*/
		ChromeDriver driver = new ChromeDriver();
		
		/*Maximize*/
		driver.manage().window().maximize();
		
		/*Enter app url*/
		driver.get("http://www.facebook.com/");
		
		// WebElement emailIDField = driver.findElement(By.id("email"));
		
		driver.findElement(By.name("email")).sendKeys("soniya.chandrawanshi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Password123");
		driver.findElement(By.name("firstname")).sendKeys("Vaishnavi");
		driver.findElement(By.name("lastname")).sendKeys("Chandrawanshi");
	    driver.findElement(By.id("u_0_r")).sendKeys("8805845745");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("u_0_6")).click();
	    
	   // driver.findElement(By.cssSelector("button[]"));
	   
	    
		
	
	
	    
	
	
	}

}
