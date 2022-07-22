package introduction;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class Selintroduction{

	public static void main(String args[]) {
	
		 // invoking browser
		//chrome - chromeDriver driver  >> methods()
		//create object
		// WebDriver methods + class methods
		// chormedriver.exe
		// webdriver.chrome.driver >> value of path
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "S://selenium/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		
		// firefox launch
		// System.setProperty("webdriver.gecko.driver", "S://selenium/driver/geckodriver.exe");
		// driver = new FirefoxDriver();
		 
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close(); // close current browser
		//driver.quit(); // quit all open browser by driver
	}
	

	

	
}
