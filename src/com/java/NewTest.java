package com.java;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	 WebDriver driver ;
  @Test
  public void f() {
		// firefox launch
		// System.setProperty("webdriver.gecko.driver", "S://selenium/driver/geckodriver.exe");
		// driver = new FirefoxDriver();
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
  }
  @Test
  public void f1() {
	  driver.findElement(By.linkText("https://courses.rahulshettyacademy.com/sign_up")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	 
			System.setProperty("webdriver.chrome.driver", "S://selenium/driver/chromedriver.exe");
			 driver = new ChromeDriver();
  }

}
