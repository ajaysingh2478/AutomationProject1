package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {
	
	public static void main(String[] args) {
		
		
		// to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the window
				driver.manage().window().maximize();
				
				//to launch the application
				driver.get("https://www.facebook.com/");
				
				// identify phone no text field
				
				WebElement phoneNoTextField = driver.findElement(By.id("email"));
				phoneNoTextField.sendKeys("9958346957");
				
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("hello");
				
	}

}
