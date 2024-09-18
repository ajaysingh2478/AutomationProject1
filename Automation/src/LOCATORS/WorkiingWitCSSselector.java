package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkiingWitCSSselector {
	public static void main(String[] args) throws InterruptedException
	{
		
		// to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the window
				driver.manage().window().maximize();
				
				//to launch the application
				driver.get("https://www.flipkart.com");
				Thread.sleep(2000);
				// Identify the login button using CSS selector
		        WebElement loginButton = driver.findElement(By.cssSelector("//div[@class='H6-NpN _3N4_BX']"));
		        	Thread.sleep(1000);
		        // Click the login button
		        loginButton.click();
				
		
	}

}
