package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {
	
	public static void main(String[] args) {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("https://www.flipkart.com");
		WebElement loginButton= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		loginButton.sendKeys("iphone");
	}

}
